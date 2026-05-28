/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.metadata.ModOrigin
 *  net.fabricmc.loader.api.metadata.ModOrigin$Kind
 */
package me.gru2303.updaterx.api.models.client.mod;

import com.google.gson.Gson;
import generated.gb.upx.GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import generated.gb.upx.GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import me.gru2303.updaterx.api.models.GeneralData;
import me.gru2303.updaterx.api.models.client.FileData;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.ModOrigin;

public class ModificationFileData
extends FileData {
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return (0x42692071 & 0xB1860A01) != 0;
        }
        if (obj != null && this.getClass() == obj.getClass()) {
            ModificationFileData other = (ModificationFileData)obj;
            return (this.getId().equals(other.getId()) && this.getOriginalVersion().equals(other.getOriginalVersion()) && this.GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b().equals(other.GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b()) ? 0x26440801 & 0x50828099 : 0x8324 & 0x216081) != 0;
        }
        return (0xE120226 & 0x41E04010) != 0;
    }

    public boolean isLoaded() {
        ModContainer container;
        ModOrigin origin;
        Optional containerOptional = FabricLoader.getInstance().getModContainer(this.getId());
        if (containerOptional.isPresent() && (origin = (container = (ModContainer)containerOptional.get()).getOrigin()).getKind().equals((Object)ModOrigin.Kind.PATH)) {
            try {
                return Files.isSameFile(this.getFile().toPath(), (Path)origin.getPaths().get(0xC9146002 & 0x10800D98));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return (0x8012008 & 0x20F011E2) != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ModificationFileData from(File file) {
        if (file == null) return null;
        if (!file.exists()) return null;
        if (!file.isFile()) return null;
        if (!file.getName().endsWith(GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0xC00290F & 0x92D49013])) return null;
        try (JarFile jarFile = new JarFile(file);){
            JarEntry entry = jarFile.getJarEntry(GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x95804783 & 0x42288003]);
            InputStream input = jarFile.getInputStream(entry);
            InputStreamReader reader = new InputStreamReader(input, StandardCharsets.UTF_8);
            GeneralData data = (GeneralData)new Gson().fromJson((Reader)reader, GeneralData.class);
            if (data == null) return null;
            ModificationFileData modificationFileData = new ModificationFileData(data, file);
            return modificationFileData;
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    public ModificationFileData(GeneralData data, File file) {
        super(data, file);
    }
}

