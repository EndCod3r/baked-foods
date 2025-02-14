package net.endlordhd.bakedfoods.item;

import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import net.endlordhd.bakedfoods.MoreBakedFoods;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItems {
    public static final Item BAKED_APPLE = registerItem("baked_apple", new PolyItem(new Item.Settings().food(ModFoodComponents.BAKED_APPLE)));
    public static final Item BAKED_CARROT = registerItem("baked_carrot", new PolyItem(new Item.Settings().food(ModFoodComponents.BAKED_CARROT)));
    public static final Item BAKED_MELON = registerItem("baked_melon", new PolyItem(new Item.Settings().food(ModFoodComponents.BAKED_MELON)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreBakedFoods.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreBakedFoods.LOGGER.info("Registering Mod Items for " + MoreBakedFoods.MOD_ID);
        ItemGroup.Builder builder = PolymerItemGroupUtils.builder();
        builder.icon(() -> new ItemStack(BAKED_APPLE, 1));
        builder.displayName(Text.translatable("item-group.baked-foods.items"));

//      ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
        builder.entries(((displayContext, entries) -> {
            entries.add(BAKED_APPLE);
            entries.add(BAKED_CARROT);
            entries.add(BAKED_MELON);
        }));
        ItemGroup polymerGroup = builder.build();
        PolymerItemGroupUtils.registerPolymerItemGroup(Identifier.of(MoreBakedFoods.MOD_ID, "items"), polymerGroup);
        MoreBakedFoods.LOGGER.info("Registered Mod Items for " + MoreBakedFoods.MOD_ID);
    }
}
