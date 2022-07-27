package com.sleepingeye.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorialtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PALE_ORE.get());
        }
    };
    public static final CreativeModeTab TUTORIAL_TAB2 = new CreativeModeTab("tutorialtab2") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ENDIUM_INGOT.get());
        }
    };

    public static final CreativeModeTab TUTORIAL_TAB3 = new CreativeModeTab("tutorialtab3") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MYSTERIOUS_MUSHROOM.get());
        }
    };
}
