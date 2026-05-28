/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  UPX.GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b
 *  me.gru2303.updaterx.api.ui.loading.AdvancedLoadingOverlay
 *  me.gru2303.updaterx.api.ui.loading.LoadingInstance
 *  net.minecraft.class_310
 *  net.minecraft.class_4071
 *  org.jetbrains.annotations.Nullable
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package me.gru2303.updaterx.mixin;

import UPX.GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b;
import java.util.concurrent.CompletableFuture;
import me.gru2303.updaterx.api.ui.loading.AdvancedLoadingOverlay;
import me.gru2303.updaterx.api.ui.loading.LoadingInstance;
import net.minecraft.class_310;
import net.minecraft.class_4071;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_310.class})
public abstract class MinecraftMixin {
    @Shadow
    public abstract void method_18502(@Nullable class_4071 var1);

    @Redirect(method={"onGameLoadFinished"}, at=@At(value="INVOKE", target="Ljava/lang/Runnable;run()V"))
    private void onGameLoadFinished(Runnable runnable) {
        runnable.run();
        LoadingInstance loadingInstance = GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200d\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b().GBUPX\u200d\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b().GBUPX\u200d\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b();
        this.method_18502((class_4071)new AdvancedLoadingOverlay(loadingInstance));
        CompletableFuture.runAsync((Runnable)loadingInstance);
    }
}

