package net.endlordhd.bakedfoods;

import net.endlordhd.bakedfoods.item.ModItemGroups;
import net.endlordhd.bakedfoods.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreBakedFoods implements ModInitializer {
	public static final String MOD_ID = "baked-foods";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
	}
}