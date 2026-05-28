/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package me.gru2303.updaterx.api.models.server;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import me.gru2303.updaterx.api.models.server.library.LibraryServerFileData;
import me.gru2303.updaterx.api.models.server.mod.ModificationsServerFileData;
import me.gru2303.updaterx.api.models.server.resourcepacks.ResourcePackServerFileData;
import org.grusha.common.util.ArchType;
import org.grusha.common.util.OSType;

public class ServerData {
    private List<LibraryServerFileData> libraries;
    private List<ModificationsServerFileData> modifications;
    private ModificationsServerFileData self;
    @SerializedName(value="resourcepacks")
    private List<ResourcePackServerFileData> resourcePacks;

    public List<ResourcePackServerFileData> getResourcePacks() {
        return this.resourcePacks;
    }

    public List<LibraryServerFileData> getLibraries(OSType os, ArchType arch) {
        return this.libraries.stream().filter(e -> (e.getOperationSystem().equals((Object)os) && e.getArchitecture().equals((Object)arch) ? 0x18976C1 & 0x630012B : 0xD00804 & 0xC12010B0) != 0).toList();
    }

    public List<LibraryServerFileData> getAllLibraries() {
        return this.libraries;
    }

    public ServerData(ModificationsServerFileData self, List<ModificationsServerFileData> modifications, List<ResourcePackServerFileData> resourcePacks, List<LibraryServerFileData> libraries) {
        this.self = self;
        this.modifications = modifications;
        this.resourcePacks = resourcePacks;
        this.libraries = libraries;
    }

    public List<ModificationsServerFileData> getModifications() {
        return this.modifications;
    }

    public ModificationsServerFileData getSelfModification() {
        return this.self;
    }

    public List<LibraryServerFileData> getLibraries() {
        return this.getLibraries(OSType.getOperationSystem(), ArchType.getArchitecture());
    }
}

