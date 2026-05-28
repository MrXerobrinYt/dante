/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.gru2303.updaterx.api.ui.loading.AdvancedLoadingOverlay
 *  me.gru2303.updaterx.api.ui.loading.AdvancedLoadingOverlayTextures
 *  me.gru2303.updaterx.api.ui.loading.LoadingInstance
 *  me.gru2303.updaterx.api.ui.loading.action.CloseLoadingAction
 *  me.gru2303.updaterx.api.ui.loading.action.LoadingAction
 *  me.gru2303.updaterx.api.ui.loading.progress.ProgressBar
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_4011
 *  net.minecraft.class_425
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package me.gru2303.updaterx.mixin;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import me.gru2303.updaterx.api.ui.loading.AdvancedLoadingOverlay;
import me.gru2303.updaterx.api.ui.loading.AdvancedLoadingOverlayTextures;
import me.gru2303.updaterx.api.ui.loading.LoadingInstance;
import me.gru2303.updaterx.api.ui.loading.action.CloseLoadingAction;
import me.gru2303.updaterx.api.ui.loading.action.LoadingAction;
import me.gru2303.updaterx.api.ui.loading.progress.ProgressBar;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4011;
import net.minecraft.class_425;
import org.grusha.common.concurrent.CompletableFutureTask;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_425.class})
public class LoadingOverlayMixin {
    @Shadow
    @Final
    private class_4011 field_17767;
    @Unique
    private AdvancedLoadingOverlay advancedLoadingOverlay;
    @Shadow
    @Final
    private class_310 field_18217;

    @Inject(method={"registerTextures"}, at={@At(value="HEAD")})
    private static void registerTextures(class_310 class_3102, CallbackInfo callbackInfo) {
        AdvancedLoadingOverlayTextures.registerTextures((class_310)class_3102);
    }

    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRender(class_332 class_3322, int n, int n2, float f, CallbackInfo callbackInfo) {
        this.advancedLoadingOverlay.method_25394(class_3322, n, n2, f);
        callbackInfo.cancel();
    }

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    private void onInit(class_310 class_3102, final class_4011 class_40112, Consumer<Optional<Throwable>> consumer, boolean bl, CallbackInfo callbackInfo) {
        final CompletableFutureTask<LoadingAction> completableFutureTask = CompletableFutureTask.of(() -> {
            while (!class_40112.method_18787()) {
                Thread.onSpinWait();
            }
            class_310.method_1551().execute(() -> {
                try {
                    class_40112.method_18849();
                    consumer.accept(Optional.empty());
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                    consumer.accept(Optional.of(throwable));
                }
            });
            return CloseLoadingAction.ONE;
        });
        final ProgressBar progressBar = new ProgressBar(){

            public class_2561 component() {
                return class_2561.method_43473();
            }

            public float position() {
                return class_40112.method_18229();
            }
        };
        LoadingInstance loadingInstance = new LoadingInstance(){

            public ProgressBar getProgress() {
                return progressBar;
            }

            public void run() {
                completableFutureTask.run();
            }

            public CompletableFuture<LoadingAction> done() {
                return completableFutureTask;
            }
        };
        this.advancedLoadingOverlay = new AdvancedLoadingOverlay(loadingInstance);
        CompletableFuture.runAsync((Runnable)loadingInstance);
    }
}

