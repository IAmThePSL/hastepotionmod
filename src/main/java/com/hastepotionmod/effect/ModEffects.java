package com.hastepotionmod.effect;

import com.hastepotionmod.Hastepotionmod;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> FASTBREAK = registerStatusEffect("fastbreak",
            new FastBreakEffect(StatusEffectCategory.BENEFICIAL, 0xffde21)
                    .addAttributeModifier(EntityAttributes.MINING_EFFICIENCY,
                            Identifier.of(Hastepotionmod.MOD_ID, "fastbreak"), -0.50f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Hastepotionmod.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        Hastepotionmod.LOGGER.info("Registering Mod effects for " + Hastepotionmod.MOD_ID);
    }
}
