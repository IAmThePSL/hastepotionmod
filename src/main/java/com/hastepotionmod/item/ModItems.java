package com.hastepotionmod.item;

import com.hastepotionmod.Hastepotionmod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item HASTE_POTION = registerItem("haste_potion", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Hastepotionmod.MOD_ID,"haste_potion")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Hastepotionmod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Hastepotionmod.LOGGER.info("Registering Mod Items for " + Hastepotionmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(HASTE_POTION);
        });
    }


}
