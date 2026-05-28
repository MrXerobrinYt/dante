package org.grusha.common.util;

import java.util.Locale;

/**
 * Определение архитектуры процессора.
 * Суть не изменена.
 */
public enum ArchType {
    X86("x86", "i386", "i486", "i586", "i686", "pentium"),
    X86_64("x86_64", "amd64", "em64t", "universal"),
    ARM64("arm64", "aarch64"),
    UNKNOWN();

    private final String[] identifiers;

    ArchType(String... identifiers) {
        this.identifiers = identifiers;
    }

    public String[] getIdentifiers() {
        return identifiers;
    }

    public static ArchType getArchitecture() {
        String osArch = System.getProperty("os.arch");
        return getByIdentifier(osArch);
    }

    public static ArchType getByIdentifier(String identifier) {
        if (identifier == null) return UNKNOWN;

        for (ArchType type : values()) {
            for (String id : type.getIdentifiers()) {
                if (identifier.equalsIgnoreCase(id)) {
                    return type;
                }
            }
        }
        return UNKNOWN;
    }

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}