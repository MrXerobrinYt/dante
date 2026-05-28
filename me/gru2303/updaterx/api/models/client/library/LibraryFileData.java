/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package me.gru2303.updaterx.api.models.client.library;

import com.google.gson.Gson;
import generated.gb.upx.GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import generated.gb.upx.GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import me.gru2303.updaterx.api.models.GeneralData;
import me.gru2303.updaterx.api.models.client.FileData;

public class LibraryFileData
extends FileData {
    public LibraryFileData(GeneralData data, File file) {
        super(data, file);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static LibraryFileData from(File file) {
        if (file == null) return null;
        if (!file.exists()) return null;
        if (!file.isFile()) return null;
        if (!file.getName().endsWith(GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x600229A & 0x4080C410])) return null;
        try (ZipFile zipFile = new ZipFile(file);){
            ZipEntry entry = zipFile.getEntry(GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x91001058 & 0x2E044891]);
            InputStream input = zipFile.getInputStream(entry);
            InputStreamReader reader = new InputStreamReader(input, StandardCharsets.UTF_8);
            GeneralData data = (GeneralData)new Gson().fromJson((Reader)reader, GeneralData.class);
            if (data == null) return null;
            LibraryFileData libraryFileData = new LibraryFileData(data, file);
            return libraryFileData;
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return (0x600CB145 & 0xFC14209) != 0;
        }
        if (obj != null && this.getClass() == obj.getClass()) {
            LibraryFileData other = (LibraryFileData)obj;
            return (this.getId().equals(other.getId()) && this.getOriginalVersion().equals(other.getOriginalVersion()) && this.GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b().equals(other.GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b()) ? 0x80011001 & 0x220063D : 0x22005220 & 0xD083A084) != 0;
        }
        return (0x1C08343 & 0x8034000C) != 0;
    }

    public boolean unzip(Path path) {
        try {
            if (Files.notExists(path, new LinkOption[0x14C04155 & 0xC2061208])) {
                Files.createDirectories(path, new FileAttribute[0x6080002 & 0xC00447C8]);
            }
            try (ZipInputStream zis = new ZipInputStream(new FileInputStream(this.getFile()));){
                ZipEntry entry;
                while ((entry = zis.getNextEntry()) != null) {
                    Path newFilePath = path.resolve(entry.getName());
                    if (entry.isDirectory()) {
                        Files.createDirectories(newFilePath, new FileAttribute[0x83102D00 & 0x44670061]);
                    } else {
                        try (BufferedOutputStream bos = new BufferedOutputStream(Files.newOutputStream(newFilePath, new OpenOption[0x434E1C & 0xBC0001]));){
                            int bytesRead;
                            byte[] buffer = new byte[0x8601A000 & 0x284880DF];
                            while ((bytesRead = zis.read(buffer)) != (0xFFFFFFFF & 0xFFFFFFFF)) {
                                bos.write(buffer, 0x672300C0 & 0x88444A00, bytesRead);
                            }
                        }
                    }
                    zis.closeEntry();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return (0x54052818 & 0x83B01026) != 0;
        }
        return (0x514E8001 & 0x80002013) != 0;
    }
}

