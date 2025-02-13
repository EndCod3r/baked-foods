package net.endlordhd.bakedfoods.item;

import net.endlordhd.bakedfoods.MoreBakedFoods;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BAKED_APPLE = registerItem("baked_apple", new Item(new Item.Settings()));
    public static final Item BAKED_CARROT = registerItem("baked_carrot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreBakedFoods.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreBakedFoods.LOGGER.info("Registering Mod Items for " + MoreBakedFoods.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BAKED_APPLE);
            entries.add(BAKED_CARROT);
        });
    }
}
