/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package me.gru2303.updaterx.api.models.client.mod;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import me.gru2303.updaterx.api.models.GeneralData;
import me.gru2303.updaterx.api.models.client.mod.ModificationFileData;
import me.gru2303.updaterx.api.models.client.mod.ModificationNestedFileData;
import org.grusha.semver.Semver;

public class ModificationLoaderFileData
extends ModificationFileData {
    public static final String[] NON_SECURE_MODS_ID;
    public static final String MOD_DIRECTORY = "mods";

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return (0x48870495 & 0x2610C009) != 0;
        }
        if (obj != null && this.getClass() == obj.getClass()) {
            ModificationLoaderFileData other = (ModificationLoaderFileData)obj;
            return (this.getId().equals(other.getId()) && this.getOriginalVersion().equals(other.getOriginalVersion()) && this.GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b().equals(other.GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b()) ? 0x9400011 & 0x3688A023 : 0x28CC4012 & 0x4101000) != 0;
        }
        return (0x92818298 & 0x7A2023) != 0;
    }

    static {
        String[] stringArray = new String[0x4C60228D & 0x1140901];
        stringArray[0x22034B & 0x2F010C20] = GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x29AE036E & 0x440C00E];
        NON_SECURE_MODS_ID = stringArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ModificationLoaderFileData from(File file) {
        if (file == null) return null;
        if (!file.exists()) return null;
        if (!file.isFile()) return null;
        if (!file.getName().endsWith(GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x12741002 & 0x1800842])) return null;
        try (JarFile jarFile = new JarFile(file);){
            JarEntry entry = jarFile.getJarEntry(GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x8A7A03 & 0x4B040067]);
            InputStream input = jarFile.getInputStream(entry);
            InputStreamReader reader = new InputStreamReader(input, StandardCharsets.UTF_8);
            GeneralData data = (GeneralData)new Gson().fromJson((Reader)reader, GeneralData.class);
            if (data == null) return null;
            if (!data.getId().equals(GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x439010B & 0x2BC60222])) return null;
            ModificationLoaderFileData modificationLoaderFileData = new ModificationLoaderFileData(data, file);
            return modificationLoaderFileData;
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    public static ModificationLoaderFileData buildLoader(File file, List<ModificationFileData> modifications, Semver version) throws Exception {
        if (!file.exists() && file.getName().endsWith(GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x45101127 & 0x8062600B])) {
            Files.createDirectories(file.getParentFile().toPath(), new FileAttribute[0x42098564 & 0x14824889]);
            if (file.createNewFile()) {
                ArrayList<String> modificationsPaths = new ArrayList<String>();
                try (FileOutputStream fos = new FileOutputStream(file);
                     JarOutputStream jos = new JarOutputStream(fos);){
                    for (ModificationFileData modification : modifications) {
                        if (!modification.getFile().isFile() || !modification.getFile().exists() || !modification.getFile().getName().endsWith(GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x1C008D5B & 0x2382428B])) continue;
                        String path = "mods/" + modification.getFile().getName();
                        modificationsPaths.add(path);
                        JarEntry entry = new JarEntry(path);
                        jos.putNextEntry(entry);
                        try (FileInputStream fis = new FileInputStream(modification.getFile());){
                            int bytesRead;
                            byte[] buffer = new byte[0x602080A8 & 0x14018110];
                            while ((bytesRead = fis.read(buffer)) != (0xFFFFFFFF & 0xFFFFFFFF)) {
                                jos.write(buffer, 0x82431400 & 0x888344, bytesRead);
                            }
                        }
                        jos.closeEntry();
                    }
                    JarEntry entry = new JarEntry(GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x150450D & 0xA000BD]);
                    JsonObject metadata = ModificationLoaderFileData.buildLoaderMetadata(modificationsPaths, version);
                    jos.putNextEntry(entry);
                    jos.write(metadata.toString().getBytes(StandardCharsets.UTF_8));
                    jos.closeEntry();
                }
                return ModificationLoaderFileData.from(file);
            }
        }
        return null;
    }

    public static JsonObject buildLoaderMetadata(List<String> paths, Semver version) throws Exception {
        try (InputStream templateSteam = ModificationLoaderFileData.class.getClassLoader().getResourceAsStream(GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x2A20588C & 0x404024F]);){
            if (templateSteam != null) {
                InputStreamReader reader = new InputStreamReader(templateSteam);
                JsonObject json = JsonParser.parseReader((Reader)reader).getAsJsonObject();
                JsonArray jars = new JsonArray();
                for (String path : paths) {
                    JsonObject filePath = new JsonObject();
                    filePath.addProperty(GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0xA660829C & 0x1010504C], path);
                    jars.add((JsonElement)filePath);
                }
                json.addProperty(GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x7814A1B & 0x181C910B], version.toString());
                json.add(GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x1801412F & 0x838A080B], (JsonElement)jars);
                JsonObject jsonObject = json;
                return jsonObject;
            }
        }
        throw new RuntimeException(GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x802800D & 0x56A1218F]);
    }

    public List<ModificationNestedFileData> getModifications() {
        ArrayList<ModificationNestedFileData> result = new ArrayList<ModificationNestedFileData>();
        try (JarFile jarFile = new JarFile(this.getFile());){
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                ModificationNestedFileData data;
                JarEntry entry = entries.nextElement();
                if (entry.isDirectory() || !entry.getName().startsWith(GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x88002C83 & 0x3114831E]) || entry.getName().substring(GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0xA4821408 & 0x1218421A].length() + (0x83520011 & 0x308850E3)).indexOf(0x340502AF & 0xD8902F) != (0xFFFFFFFF & 0xFFFFFFFF) || !entry.getName().endsWith(GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b[0x400089D & 0x1180664C]) || (data = ModificationNestedFileData.from(jarFile, entry, this)) == null) continue;
                result.add(data);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return result;
    }

    public ModificationLoaderFileData(GeneralData data, File file) {
        super(data, file);
    }
}

