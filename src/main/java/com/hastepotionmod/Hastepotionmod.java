package com.hastepotionmod;

import com.hastepotionmod.effect.ModEffects;
import com.hastepotionmod.item.ModItemGroups;
import com.hastepotionmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hastepotionmod implements ModInitializer {
	public static final String MOD_ID = "hastepotionmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModEffects.registerEffects();
	}
}