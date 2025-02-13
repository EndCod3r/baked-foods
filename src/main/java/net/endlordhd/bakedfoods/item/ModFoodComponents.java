package net.endlordhd.bakedfoods.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;

public class ModFoodComponents {
    public static final FoodComponent BAKED_APPLE = new FoodComponent.Builder()
            .nutrition(7)
            .saturationModifier(0.6f)
            .build();
    public static final FoodComponent BAKED_CARROT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.9f)
            .build();
}
