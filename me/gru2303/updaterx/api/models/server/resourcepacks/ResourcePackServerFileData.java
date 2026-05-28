/*
 * Decompiled with CFR 0.152.
 */
package me.gru2303.updaterx.api.models.server.resourcepacks;

import java.util.List;
import me.gru2303.updaterx.api.models.GeneralData;
import me.gru2303.updaterx.api.models.server.ServerFileData;

public class ResourcePackServerFileData
extends ServerFileData {
    private boolean autoEnable;

    public boolean isAutoEnable() {
        return this.autoEnable;
    }

    public ResourcePackServerFileData(GeneralData data, String hash, List<String> urls, boolean autoEnable) {
        super(data, hash, urls);
        this.autoEnable = autoEnable;
    }
}

