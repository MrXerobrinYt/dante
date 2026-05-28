/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  net.minecraft.class_310
 */
package me.gru2303.updaterx.api.models.client.resourcepacks;

import com.google.gson.Gson;
import generated.gb.upx.GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import generated.gb.upx.GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import me.gru2303.updaterx.api.models.GeneralData;
import me.gru2303.updaterx.api.models.client.FileData;
import net.minecraft.class_310;

public class ResourcePackFileData
extends FileData {
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return (0x26D0013 & 0xD0829001) != 0;
        }
        if (obj != null && this.getClass() == obj.getClass()) {
            ResourcePackFileData other = (ResourcePackFileData)obj;
            return (this.getId().equals(other.getId()) && this.getOriginalVersion().equals(other.getOriginalVersion()) && this.GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b().equals(other.GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b()) ? 0x80A0281 & 0x60749C57 : 0x24580944 & 0x4202808A) != 0;
        }
        return (0x56304102 & 0x1C4000C) != 0;
    }

    public ResourcePackFileData(GeneralData data, File file) {
        super(data, file);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ResourcePackFileData from(File file) {
        if (file == null) return null;
        if (!file.exists()) return null;
        if (!file.isFile()) return null;
        if (!file.getName().endsWith(GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x94010F & 0xB060000E])) return null;
        try (ZipFile zipFile = new ZipFile(file);){
            ZipEntry entry = zipFile.getEntry(GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0xEC6A095F & 0x110800F]);
            InputStream input = zipFile.getInputStream(entry);
            InputStreamReader reader = new InputStreamReader(input, StandardCharsets.UTF_8);
            GeneralData data = (GeneralData)new Gson().fromJson((Reader)reader, GeneralData.class);
            if (data == null) return null;
            ResourcePackFileData resourcePackFileData = new ResourcePackFileData(data, file);
            return resourcePackFileData;
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    public String getMinecraftPackIdentifier() {
        return "file/" + this.getFile().getName();
    }

    public boolean isLoaded() {
        return (class_310.method_1551().method_1520().method_14449(this.getMinecraftPackIdentifier()) != null ? 0x8001FCE1 & 0x30200117 : 0x26410C0 & 0x4100A504) != 0;
    }
}

