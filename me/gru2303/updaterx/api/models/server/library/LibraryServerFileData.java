/*
 * Decompiled with CFR 0.152.
 */
package me.gru2303.updaterx.api.models.server.library;

import java.util.List;
import me.gru2303.updaterx.api.models.GeneralData;
import me.gru2303.updaterx.api.models.server.ServerFileData;
import org.grusha.common.util.ArchType;
import org.grusha.common.util.OSType;

public class LibraryServerFileData
extends ServerFileData {
    private ArchType arch;
    private List<String> relativeBinaryPaths;
    private OSType os;
    private List<String> names;

    public LibraryServerFileData(GeneralData data, String hash, List<String> urls, OSType os, ArchType arch, List<String> names, List<String> relativeBinaryPaths) {
        super(data, hash, urls);
        this.os = os;
        this.arch = arch;
        this.names = names;
        this.relativeBinaryPaths = relativeBinaryPaths;
    }

    public List<String> getNames() {
        return this.names;
    }

    public OSType getOperationSystem() {
        return this.os;
    }

    public ArchType getArchitecture() {
        return this.arch;
    }

    public List<String> getRelativeBinaryPaths() {
        return this.relativeBinaryPaths;
    }
}

