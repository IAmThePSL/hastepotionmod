package com.hastepotionmod.mixin;

import com.hastepotionmod.effect.ModEffects; // Import your mod effects
import net.minecraft.block.BlockState;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.entry.RegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {

    @Inject(method = "getBlockBreakingSpeed", at = @At("RETURN"), cancellable = true)
    private void applyFastBreakEffect(BlockState block, CallbackInfoReturnable<Float> cir) {
        PlayerEntity player = (PlayerEntity) (Object) this;

        // Safe null check
        if (player.hasStatusEffect(ModEffects.FASTBREAK)) {
            StatusEffectInstance effect = player.getStatusEffect(ModEffects.FASTBREAK);
            if (effect != null) {
                float baseSpeed = cir.getReturnValueF();
                float multiplier = 1.0F + (0.5F * (effect.getAmplifier() + 1));
                cir.setReturnValue(baseSpeed * multiplier);
            }
        }
    }
}