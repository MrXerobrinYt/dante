/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  UPX.GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b
 *  net.minecraft.class_315
 *  net.minecraft.class_3283
 *  net.minecraft.class_3288
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 */
package me.gru2303.updaterx.mixin;

import UPX.GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import java.util.List;
import net.minecraft.class_315;
import net.minecraft.class_3283;
import net.minecraft.class_3288;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_315.class})
public abstract class OptionsMixin
implements GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b {
    @Shadow
    public List<String> field_1887;
    @Shadow
    public List<String> field_1846;

    @Shadow
    public abstract void method_1640();

    public void updaterX$updateResourcePacksWithoutReload(class_3283 class_32832) {
        this.field_1887.clear();
        this.field_1846.clear();
        for (class_3288 class_32882 : class_32832.method_14444()) {
            if (class_32882.method_14465()) continue;
            this.field_1887.add(class_32882.method_14463());
            if (class_32882.method_14460().method_14437()) continue;
            this.field_1846.add(class_32882.method_14463());
        }
        this.method_1640();
    }

    @Shadow
    public abstract void method_49598(class_3283 var1);
}

