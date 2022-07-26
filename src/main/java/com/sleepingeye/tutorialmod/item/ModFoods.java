package com.sleepingeye.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MYSTERIOUS_MUSHROOM = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(2F).effect(new MobEffectInstance(MobEffects.POISON, 600, 0), 0.2F).build();
}
