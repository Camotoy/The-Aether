package com.gildedgames.aether.core.mixin.client;

import com.gildedgames.aether.common.item.accessories.cape.CapeItem;
import net.minecraft.client.renderer.entity.layers.ElytraLayer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import top.theillusivec4.curios.api.CuriosApi;

@Mixin(ElytraLayer.class)
public class ElytraLayerMixin<T extends LivingEntity>
{
    @Inject(at = @At("HEAD"), method = "getElytraTexture", cancellable = true, remap = false)
    private void getElytraTexture(ItemStack stack, T entity, CallbackInfoReturnable<ResourceLocation> cir) {
        CuriosApi.getCuriosHelper().findEquippedCurio((item) -> item.getItem() instanceof CapeItem, entity).ifPresent((triple) -> {
            CapeItem cape = (CapeItem) triple.getRight().getItem();
            if (cape.getCapeTexture() != null) {
                cir.setReturnValue(cape.getCapeTexture());
            }
        });
    }
}
