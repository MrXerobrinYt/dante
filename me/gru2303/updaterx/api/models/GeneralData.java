/*
 * Decompiled with CFR 0.152.
 */
package me.gru2303.updaterx.api.models;

import org.grusha.semver.Semver;

public class GeneralData {
    private String version;
    private String id;

    public String getId() {
        return this.id;
    }

    public GeneralData(String id, String version) {
        this.id = id;
        this.version = version;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return (0x68064803 & 0x901884E9) != 0;
        }
        if (obj != null && this.getClass() == obj.getClass()) {
            GeneralData other = (GeneralData)obj;
            return (this.id.equals(other.id) && this.version.equals(other.version) ? 0x1045561 & 0x222285 : 0x2B400962 & 0x14900209) != 0;
        }
        return (0x124BB044 & 0x60840638) != 0;
    }

    public GeneralData(String id, Semver version) {
        this(id, version.toString());
    }

    public GeneralData() {
    }

    public String getOriginalVersion() {
        return this.version;
    }

    public Semver getVersion() {
        return new Semver(this.version);
    }
}

