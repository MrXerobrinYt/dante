/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  UPX.GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b
 */
package me.gru2303.updaterx.api.models.server;

import UPX.GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import java.util.List;
import me.gru2303.updaterx.api.models.GeneralData;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ServerFileData
extends GeneralData
implements GBUPX\u200d\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b {
    private List<String> urls;
    private String hash;

    public List<String> getUrls() {
        return this.urls;
    }

    public ServerFileData(GeneralData data, String hash, List<String> urls) {
        super(data.getId(), data.getOriginalVersion());
        this.hash = hash;
        this.urls = urls;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return (0x8104041 & 0x40050901) != 0;
        }
        if (obj != null && this.getClass() == obj.getClass()) {
            ServerFileData other = (ServerFileData)obj;
            return (this.getId().equals(other.getId()) && this.getOriginalVersion().equals(other.getOriginalVersion()) && this.GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b().equals(other.GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b()) ? 0x3800C105 & 0x203E09 : 0x40001860 & 0x3DA30102) != 0;
        }
        return (0x10402A40 & 0x482C0A0) != 0;
    }

    public String GBUPX\u200c\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b() {
        return this.hash;
    }
}

