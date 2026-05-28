/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  UPX.GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b
 *  UPX.GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b
 */
package me.gru2303.updaterx.api.models.client;

import UPX.GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import UPX.GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import java.io.File;
import me.gru2303.updaterx.api.models.GeneralData;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class FileData
extends GeneralData
implements GBUPX\u200d\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b {
    private final File file;
    private String hash;

    public FileData(GeneralData data, File file) {
        super(data.getId(), data.getOriginalVersion());
        this.file = file;
        if (file.exists() && file.isFile()) {
            this.hash = GBUPX\u200f\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200d\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b(file.toPath());
        }
    }

    public String GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b() {
        return this.hash;
    }

    public File getFile() {
        return this.file;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return (0xE080020D & 0x105B0C3) != 0;
        }
        if (obj != null && this.getClass() == obj.getClass()) {
            FileData other = (FileData)obj;
            return (this.getId().equals(other.getId()) && this.getOriginalVersion().equals(other.getOriginalVersion()) && this.GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b().equals(other.GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b()) ? 0x9809A403 & 0x2C21845 : 0x5E008880 & 0x21B4600A) != 0;
        }
        return (0x40A20710 & 0x10414884) != 0;
    }
}

