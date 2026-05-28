package org.grusha.common.logging.handler;

import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

/**
 * Хендлер логов, который автоматически создаёт новый файл каждый день.
 * Суть не изменена — только улучшена безопасность и читаемость.
 */
public class FileDateHandler extends StreamHandler {
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    private static final String LOG_FILE_PATTERN = "log_%s.log";

    private final Path directory;
    private Date currentDate;
    private FileHandler fileHandler;
    private boolean closed;

    public FileDateHandler(Path directory) {
        if (directory == null) {
            throw new NullPointerException("Directory cannot be null");
        }

        this.directory = directory;
        this.closed = false;

        // Создаём директорию, если её нет
        try {
            java.nio.file.Files.createDirectories(directory);
        } catch (java.io.IOException e) {
            throw new IllegalArgumentException("Cannot create directory: " + directory, e);
        }

        if (!directory.toFile().isDirectory()) {
            throw new IllegalArgumentException(directory + " is not a directory");
        }
    }

    @Override
    public void setFilter(Filter newFilter) throws SecurityException {
        if (fileHandler != null) {
            fileHandler.setFilter(newFilter);
        }
        super.setFilter(newFilter);
    }

    @Override
    public void setFormatter(Formatter newFormatter) throws SecurityException {
        if (fileHandler != null) {
            fileHandler.setFormatter(newFormatter);
        }
        super.setFormatter(newFormatter);
    }

    @Override
    public void setEncoding(String encoding) throws SecurityException, UnsupportedEncodingException {
        if (fileHandler != null) {
            fileHandler.setEncoding(encoding);
        }
        super.setEncoding(encoding);
    }

    @Override
    public void setLevel(Level newLevel) throws SecurityException {
        if (fileHandler != null) {
            fileHandler.setLevel(newLevel);
        }
        super.setLevel(newLevel);
    }

    @Override
    public void setErrorManager(ErrorManager em) {
        if (fileHandler != null) {
            fileHandler.setErrorManager(em);
        }
        super.setErrorManager(em);
    }

    @Override
    public void publish(LogRecord record) {
        if (closed) {
            return;
        }

        Date today = new Date();
        String todayFormat = new SimpleDateFormat(DATE_FORMAT).format(today);
        String currentFormat = currentDate != null
                ? new SimpleDateFormat(DATE_FORMAT).format(currentDate)
                : "";

        // Если день изменился — создаём новый файл лога
        if (!todayFormat.equals(currentFormat)) {
            rotateLogFile(todayFormat);
            currentDate = today;
        }

        if (fileHandler != null) {
            fileHandler.publish(record);
        }
    }

    private void rotateLogFile(String dateFormat) {
        String newLog = String.format(LOG_FILE_PATTERN, dateFormat);
        try {
            java.nio.file.Files.createDirectories(directory);

            if (fileHandler != null) {
                fileHandler.close();
            }

            fileHandler = new FileHandler(directory.resolve(newLog).toString(), true);
            fileHandler.setFilter(getFilter());
            fileHandler.setFormatter(getFormatter());
            fileHandler.setEncoding(getEncoding());
            fileHandler.setLevel(getLevel());
            fileHandler.setErrorManager(getErrorManager());
        } catch (Exception e) {
            // Вместо printStackTrace — хотя бы в системный лог
            System.err.println("[FileDateHandler] Failed to rotate log: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void close() throws SecurityException {
        if (fileHandler != null) {
            fileHandler.close();
            fileHandler = null;
        }
        closed = true;
        super.close();
    }
}