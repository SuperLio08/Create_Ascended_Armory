package net.lifex08.create_ascended_armory.item.custom;

import net.lifex08.create_ascended_armory.item.ModItems;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;


public class ModFoodProperties {
    public static final FoodProperties BRASSSLICE = new FoodProperties.Builder().nutrition(3).saturationModifier(1.0f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 6000, 4), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 2), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000), 1.0f)
            .build();
}