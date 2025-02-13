package net.endlordhd.bakedfoods.item;

import net.endlordhd.bakedfoods.MoreBakedFoods;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BAKED_FOODS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreBakedFoods.MOD_ID, "baked_foods_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BAKED_APPLE))
                    .displayName(Text.translatable("itemgroup.baked-foods.baked_foods_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BAKED_APPLE);
                        entries.add(ModItems.BAKED_CARROT);
                    }).build());



    public static void registerItemGroups() {
        MoreBakedFoods.LOGGER.info("Registering Mod Item Groups for " + MoreBakedFoods.MOD_ID);
    }
}
