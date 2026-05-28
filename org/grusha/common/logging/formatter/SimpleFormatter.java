/*
 * Decompiled with CFR 0.152.
 */
package org.grusha.common.logging.formatter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class SimpleFormatter
extends Formatter {
    private static final SimpleDateFormat DATA_FORMAT = new SimpleDateFormat("HH:mm:ss");

    @Override
    public String format(LogRecord record) {
        String time = DATA_FORMAT.format(new Date(record.getMillis()));
        String level = record.getLevel().getName();
        String message = record.getMessage();
        return String.format("[%s %s]: %s%n", time, level, message);
    }
}

