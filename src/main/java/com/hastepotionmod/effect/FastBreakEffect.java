package com.hastepotionmod.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class FastBreakEffect extends StatusEffect {
    public FastBreakEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // No continuous updates needed unless we have other effects, which we don't if it wasn't clear...
        return false;
    }
}