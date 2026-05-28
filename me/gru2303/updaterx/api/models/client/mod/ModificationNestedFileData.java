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
import generated.gb.upx.GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import generated.gb.upx.GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import generated.gb.upx.GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import generated.gb.upx.GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import generated.gb.upx.GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import generated.gb.upx.GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import generated.gb.upx.GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import generated.gb.upx.GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import generated.gb.upx.GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import me.gru2303.updaterx.api.models.GeneralData;
import me.gru2303.updaterx.api.models.client.mod.ModificationFileData;
import me.gru2303.updaterx.api.models.client.mod.ModificationLoaderFileData;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.ModOrigin;

public class ModificationNestedFileData
extends ModificationFileData {
    private final ModificationLoaderFileData loader;

    public static ModificationNestedFileData from(JarFile jarFile, JarEntry entry, ModificationLoaderFileData loader) {
        block14: {
            try {
                if (entry.isDirectory() || !entry.getName().startsWith(GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x40030D06 & 0x21A0C0CA]) || entry.getName().substring(GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0xE1139122 & 0x68060D2].length() + (0x57009F01 & 0x8400FF)).indexOf(0x1160A42F & 0xE82097F) != (0xFFFFFFFF & 0xFFFFFFFF) || !entry.getName().endsWith(GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x60108AB & 0x8A6D406])) break block14;
                File tempFile = File.createTempFile(GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x9B02242 & 0x20409087], GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x28C1106 & 0x7050489B]);
                tempFile.deleteOnExit();
                try (InputStream is = jarFile.getInputStream(entry);
                     FileOutputStream fos = new FileOutputStream(tempFile);){
                    int bytesRead;
                    byte[] buffer = new byte[0x890A820 & 0x64048204];
                    while ((bytesRead = is.read(buffer)) != (0xFFFFFFFF & 0xFFFFFFFF)) {
                        fos.write(buffer, 0x8C824145 & 0x1519202, bytesRead);
                    }
                }
                return ModificationNestedFileData.from(tempFile, loader);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return null;
    }

    @Override
    public boolean isLoaded() {
        Optional containerOptional = FabricLoader.getInstance().getModContainer(this.getId());
        if (containerOptional.isPresent()) {
            ModContainer loader;
            ModOrigin loaderOrigin;
            Optional loaderContainer;
            if (Arrays.stream(ModificationLoaderFileData.NON_SECURE_MODS_ID).toList().contains(this.getId())) {
                return (0x2818901 & 0x79200083) != 0;
            }
            ModContainer container = (ModContainer)containerOptional.get();
            ModOrigin origin = container.getOrigin();
            if (origin.getKind().equals((Object)ModOrigin.Kind.NESTED) && origin.getParentModId().equals(GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x20A4002A & 0x1405E82]) && (loaderContainer = FabricLoader.getInstance().getModContainer(GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x848A8182 & 0x2253C23])).isPresent() && (loaderOrigin = (loader = (ModContainer)loaderContainer.get()).getOrigin()).getKind().equals((Object)ModOrigin.Kind.PATH)) {
                try {
                    return Files.isSameFile(this.loader.getFile().toPath(), (Path)loaderOrigin.getPaths().get(0xC10B4041 & 0x1E801512));
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
        return (0x301D4420 & 0x80A0228C) != 0;
    }

    public ModificationNestedFileData(GeneralData data, File file, ModificationLoaderFileData loader) {
        super(data, file);
        this.loader = loader;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return (0x40C22F05 & 0x8A080013) != 0;
        }
        if (obj != null && this.getClass() == obj.getClass()) {
            ModificationNestedFileData other = (ModificationNestedFileData)obj;
            return (this.getId().equals(other.getId()) && this.getOriginalVersion().equals(other.getOriginalVersion()) && this.GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b().equals(other.GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b()) ? 0x5114015 & 0x70240401 : 0xC2000 & 0xBD738070) != 0;
        }
        return (0x24B2000 & 0x60A4408A) != 0;
    }

    public ModificationLoaderFileData getLoader() {
        return this.loader;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ModificationNestedFileData from(File file, ModificationLoaderFileData loader) {
        if (file == null) return null;
        if (!file.exists()) return null;
        if (!file.isFile()) return null;
        if (!file.getName().endsWith(GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x10114082 & 0x1E08902])) return null;
        try (JarFile jarFile = new JarFile(file);){
            JarEntry entry = jarFile.getJarEntry(GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x4112067 & 0x48000313]);
            InputStream input = jarFile.getInputStream(entry);
            InputStreamReader reader = new InputStreamReader(input, StandardCharsets.UTF_8);
            GeneralData data = (GeneralData)new Gson().fromJson((Reader)reader, GeneralData.class);
            if (data == null) return null;
            ModificationNestedFileData modificationNestedFileData = new ModificationNestedFileData(data, file, loader);
            return modificationNestedFileData;
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }
}

