/*
 * Decompiled with CFR 0.152.
 */
package org.grusha.semver;

import java.util.Objects;
private static final String DEFAULT_VERSION = "1.0.0";

public Semver() {
    this(DEFAULT_VERSION);
}

public class Semver
implements Comparable<Semver> {
    private final String originalValue;
    private final String value;
    private final int major;
    private final int minor;
    private final int patch;
    private final String[] suffixTokens;
    private final String build;

    public Semver(String value) {
        String[] tmp;
        this.originalValue = value;
        this.value = value = value.trim();
        String[] tokens = this.hasPreRelease(value) ? value.split("-", 2) : new String[]{value};
        String build = null;
        try {
            String[] mainTokens;
            if (tokens.length == 1) {
                if (tokens[0].endsWith("+")) {
                    throw new IllegalArgumentException("The build cannot be empty.");
                }
                tmp = tokens[0].split("\\+");
                mainTokens = tmp[0].split("\\.");
                if (tmp.length == 2) {
                    build = tmp[1];
                }
            } else {
                mainTokens = tokens[0].split("\\.");
            }
            try {
                this.major = Integer.parseInt(mainTokens[0]);
            }
            catch (IndexOutOfBoundsException | NumberFormatException e) {
                throw new IllegalArgumentException("Invalid version (no major version): " + value);
            }
            try {
                this.minor = Integer.parseInt(mainTokens[1]);
            }
            catch (IndexOutOfBoundsException | NumberFormatException e) {
                throw new IllegalArgumentException("Invalid version (no minor version): " + value);
            }
            try {
                this.patch = Integer.parseInt(mainTokens[2]);
            }
            catch (IndexOutOfBoundsException | NumberFormatException e) {
                throw new IllegalArgumentException("Invalid version (no patch version): " + value);
            }
        }
        catch (IndexOutOfBoundsException | NumberFormatException e) {
            throw new IllegalArgumentException("The version is invalid: " + value);
        }
        String[] suffix = new String[]{};
        try {
            if (tokens[1].endsWith("+")) {
                throw new IllegalArgumentException("The build cannot be empty.");
            }
            tmp = tokens[1].split("\\+");
            if (tmp.length == 2) {
                suffix = tmp[0].split("\\.");
                build = tmp[1];
            } else {
                suffix = tokens[1].split("\\.");
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            // empty catch block
        }
        this.suffixTokens = suffix;
        this.build = build;
    }

    public Semver() {
        this("1.0.0");
    }

    public String getOriginalValue() {
        return this.originalValue;
    }

    public String getValue() {
        return this.value;
    }

    public int getMajor() {
        return this.major;
    }

    public int getMinor() {
        return this.minor;
    }

    public int getPatch() {
        return this.patch;
    }

    public String[] getSuffixTokens() {
        return this.suffixTokens;
    }

    public String getBuild() {
        return this.build;
    }

    public boolean isGreaterThan(String version) {
        return this.isGreaterThan(new Semver(version));
    }

    public boolean isGreaterThan(Semver version) {
        if (this.getMajor() > version.getMajor()) {
            return true;
        }
        if (this.getMajor() < version.getMajor()) {
            return false;
        }
        if (this.getMinor() > version.getMinor()) {
            return true;
        }
        if (this.getMinor() < version.getMinor()) {
            return false;
        }
        if (this.getPatch() > version.getPatch()) {
            return true;
        }
        if (this.getPatch() < version.getPatch()) {
            return false;
        }
        String[] tokens1 = this.getSuffixTokens();
        String[] tokens2 = version.getSuffixTokens();
        if (tokens1.length == 0 && tokens2.length > 0) {
            return true;
        }
        if (tokens2.length == 0 && tokens1.length > 0) {
            return false;
        }
        for (int i = 0; i < tokens1.length && i < tokens2.length; ++i) {
            int cmp;
            try {
                int t1 = Integer.parseInt(tokens1[i]);
                int t2 = Integer.parseInt(tokens2[i]);
                cmp = t1 - t2;
            }
            catch (NumberFormatException e) {
                cmp = tokens1[i].compareToIgnoreCase(tokens2[i]);
            }
            if (cmp < 0) {
                return false;
            }
            if (cmp <= 0) continue;
            return true;
        }
        return tokens1.length > tokens2.length;
    }

    public boolean isGreaterThanOrEqualTo(String version) {
        return this.isGreaterThanOrEqualTo(new Semver(version));
    }

    public boolean isGreaterThanOrEqualTo(Semver version) {
        return this.isGreaterThan(version) || this.isEquivalentTo(version);
    }

    public boolean isLowerThan(String version) {
        return this.isLowerThan(new Semver(version));
    }

    public boolean isLowerThan(Semver version) {
        return !this.isGreaterThan(version) && !this.isEquivalentTo(version);
    }

    public boolean isLowerThanOrEqualTo(String version) {
        return this.isLowerThanOrEqualTo(new Semver(version));
    }

    public boolean isLowerThanOrEqualTo(Semver version) {
        return !this.isGreaterThan(version);
    }

    public boolean isEquivalentTo(String version) {
        return this.isEquivalentTo(new Semver(version));
    }

    public boolean isEquivalentTo(Semver version) {
        Semver sem1 = this.getBuild() == null ? this : new Semver(this.getValue().replace("+" + this.getBuild(), ""));
        Semver sem2 = version.getBuild() == null ? version : new Semver(version.getValue().replace("+" + version.getBuild(), ""));
        return sem1.isEqualTo(sem2);
    }

    public boolean isEqualTo(String version) {
        return this.isEqualTo(new Semver(version));
    }

    public boolean isEqualTo(Semver version) {
        return this.equals(version);
    }

    public boolean isStable() {
        return this.getMajor() > 0 && (this.getSuffixTokens() == null || this.getSuffixTokens().length == 0);
    }

    public VersionDiff diff(String version) {
        return this.diff(new Semver(version));
    }

    public VersionDiff diff(Semver version) {
        if (!Objects.equals(this.major, version.getMajor())) {
            return VersionDiff.MAJOR;
        }
        if (!Objects.equals(this.minor, version.getMinor())) {
            return VersionDiff.MINOR;
        }
        if (!Objects.equals(this.patch, version.getPatch())) {
            return VersionDiff.PATCH;
        }
        if (!this.areSameSuffixes(version.getSuffixTokens())) {
            return VersionDiff.SUFFIX;
        }
        if (!Objects.equals(this.build, version.getBuild())) {
            return VersionDiff.BUILD;
        }
        return VersionDiff.NONE;
    }

    public Semver withIncMajor() {
        return this.withIncMajor(1);
    }

    public Semver withIncMajor(int increment) {
        return this.withInc(increment, 0, 0);
    }

    public Semver withIncMinor() {
        return this.withIncMinor(1);
    }

    public Semver withIncMinor(int increment) {
        return this.withInc(0, increment, 0);
    }

    public Semver withIncPatch() {
        return this.withIncPatch(1);
    }

    public Semver withIncPatch(int increment) {
        return this.withInc(0, 0, increment);
    }

    private Semver withInc(int majorInc, int minorInc, int patchInc) {
        return this.with(this.major + majorInc, this.minor + minorInc, this.patch + patchInc, true, true);
    }

    public Semver withClearedSuffix() {
        return this.with(this.major, this.minor, this.patch, false, true);
    }

    public Semver withClearedBuild() {
        return this.with(this.major, this.minor, this.patch, true, false);
    }

    public Semver withClearedSuffixAndBuild() {
        return this.with(this.major, this.minor, this.patch, false, false);
    }

    public Semver withSuffix(String suffix) {
        return this.with(this.major, this.minor, this.patch, suffix.split("\\."), this.build);
    }

    public Semver withBuild(String build) {
        return this.with(this.major, this.minor, this.patch, this.suffixTokens, build);
    }

    public Semver nextMajor() {
        return this.with(this.major + 1, 0, 0, false, false);
    }

    public Semver nextMinor() {
        return this.with(this.major, this.minor + 1, 0, false, false);
    }

    public Semver nextPatch() {
        return this.with(this.major, this.minor, this.patch + 1, false, false);
    }

    private Semver with(int major, int minor, int patch, boolean suffix, boolean build) {
        String buildStr = build ? this.build : null;
        String[] suffixTokens = suffix ? this.suffixTokens : null;
        return Semver.create(major, minor, patch, suffixTokens, buildStr);
    }

    private Semver with(int major, int minor, int patch, String[] suffixTokens, String build) {
        return Semver.create(major, minor, patch, suffixTokens, build);
    }

    private static Semver create(int major, int minor, int patch, String[] suffix, String build) {
        StringBuilder sb = new StringBuilder().append(major).append(".").append(minor).append(".").append(patch);
        if (suffix != null) {
            boolean first = true;
            for (String suffixToken : suffix) {
                if (first) {
                    sb.append("-");
                    first = false;
                } else {
                    sb.append(".");
                }
                sb.append(suffixToken);
            }
        }
        if (build != null) {
            sb.append("+").append(build);
        }
        return new Semver(sb.toString());
    }

    @Override
    public int compareTo(Semver version) {
        if (this.isGreaterThan(version)) {
            return 1;
        }
        if (this.isLowerThan(version)) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && this.getClass() == obj.getClass()) {
            Semver other = (Semver)obj;
            return this.value.equals(other.value);
        }
        return false;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return this.getValue();
    }

    private boolean hasPreRelease(String version) {
        int firstIndexOfPlus = this.value.indexOf("+");
        int firstIndexOfHyphen = this.value.indexOf("-");
        if (firstIndexOfHyphen == -1) {
            return false;
        }
        return firstIndexOfPlus == -1 || firstIndexOfHyphen < firstIndexOfPlus;
    }

    private boolean areSameSuffixes(String[] suffixTokens) {
        if (this.suffixTokens == null && suffixTokens == null) {
            return true;
        }
        if (this.suffixTokens == null || suffixTokens == null) {
            return false;
        }
        if (this.suffixTokens.length != suffixTokens.length) {
            return false;
        }
        for (int i = 0; i < this.suffixTokens.length; ++i) {
            if (this.suffixTokens[i].equals(suffixTokens[i])) continue;
            return false;
        }
        return true;
    }

    public static enum VersionDiff {
        NONE,
        MAJOR,
        MINOR,
        PATCH,
        SUFFIX,
        BUILD;

    }
}

