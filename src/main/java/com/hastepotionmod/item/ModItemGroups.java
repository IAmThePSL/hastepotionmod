package com.hastepotionmod.item;

import com.hastepotionmod.Hastepotionmod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup HASTE_POTION_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Hastepotionmod.MOD_ID, "haste_potion_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.HASTE_POTION))
                    .displayName(Text.translatable("itemgroup.hastepotionmod.haste_potion_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.HASTE_POTION);
                    }).build());



    public static void registerItemGroups() {
        Hastepotionmod.LOGGER.info("Registering Item Groups for " + Hastepotionmod.MOD_ID);
    }
}
