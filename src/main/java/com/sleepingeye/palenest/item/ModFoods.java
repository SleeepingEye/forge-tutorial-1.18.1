package com.sleepingeye.palenest.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MYSTERIOUS_MUSHROOM = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(2F).effect(new MobEffectInstance(MobEffects.POISON, 600, 0), 0.2F).build();

    public static final FoodProperties PIZZA = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.8F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 0), 0.005F).build();

    public static final FoodProperties FRIED_POTATO = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();

    public static final FoodProperties FRENCH_FRIES = (new FoodProperties.Builder()).nutrition(11).saturationMod(1.2F).build();
}
