package com.sleepingeye.palenest.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier REFINED_PALE_ORE = new ForgeTier(4, 3200,12f,
            0f,24, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.REFINED_PALE_ORE.get()));
}
