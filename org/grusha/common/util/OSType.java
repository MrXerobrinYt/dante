package org.grusha.common.util;

import java.util.Locale;

/**
 * Определение типа операционной системы.
 * Суть не изменена.
 */
public enum OSType {
    WINDOWS("Windows"),
    LINUX("Linux"),
    DARWIN("Darwin"),
    UNIX("Unix"),
    UNKNOWN(null);

    public final String name;

    OSType(String name) {
        this.name = name;
    }

    public static OSType getOperationSystem() {
        String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT);

        if (osName.contains("windows")) return WINDOWS;
        if (osName.contains("linux")) return LINUX;
        if (osName.contains("mac") || osName.contains("darwin")) return DARWIN;
        if (osName.contains("nix") || osName.contains("nux") || osName.contains("aix")) return UNIX;

        return UNKNOWN;
    }

    public String getName() {
        return name;
    }

    /**
     * @return true для Linux, macOS, Unix систем
     */
    public boolean isUnixBased() {
        return this == LINUX || this == DARWIN || this == UNIX;
    }

    @Override
    public String toString() {
        return getName();
    }
}