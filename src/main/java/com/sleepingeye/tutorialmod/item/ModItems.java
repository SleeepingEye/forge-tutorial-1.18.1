package com.sleepingeye.tutorialmod.item;

import com.sleepingeye.tutorialmod.TutorialMod;
import com.sleepingeye.tutorialmod.item.custom.DowsingRodItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SHIT = ITEMS.register("shit",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB2)));

    public static final RegistryObject<Item> ENDIUM_INGOT = ITEMS.register("endium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB2)));

    public static final RegistryObject<Item> PALE_ORE = ITEMS.register("pale_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> REFINED_PALE_ORE = ITEMS.register("refined_pale_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB2).durability(16)));

    public static final RegistryObject<Item> NAIL = ITEMS.register("nail",
            () -> new SwordItem(ModTiers.REFINED_PALE_ORE, 0, 3f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> PALE_PICKAXE = ITEMS.register("pale_pickaxe",
            () -> new PickaxeItem(ModTiers.REFINED_PALE_ORE, 0, 1f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> PALE_AXE = ITEMS.register("pale_axe",
            () -> new AxeItem(ModTiers.REFINED_PALE_ORE, 3, 1f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> PALE_SHOVEL = ITEMS.register("pale_shovel",
            () -> new ShovelItem(ModTiers.REFINED_PALE_ORE, 1, 1f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> PALE_HOE = ITEMS.register("pale_hoe",
            () -> new HoeItem(ModTiers.REFINED_PALE_ORE, 0, 0f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> SHARPENED_NAIL = ITEMS.register("sharpened_nail",
            () -> new SwordItem(ModTiers.REFINED_PALE_ORE, 4, 3f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> CHANNELLED_NAIL = ITEMS.register("channelled_nail",
            () -> new SwordItem(ModTiers.REFINED_PALE_ORE, 8, 3f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> COILED_NAIL = ITEMS.register("coiled_nail",
            () -> new SwordItem(ModTiers.REFINED_PALE_ORE, 13, 4f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> PURE_NAIL = ITEMS.register("pure_nail",
            () -> new SwordItem(ModTiers.REFINED_PALE_ORE, 17, 4f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));


    public static final RegistryObject<Item> MYSTERIOUS_MUSHROOM = ITEMS.register("mysterious_mushroom",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).food(ModFoods.MYSTERIOUS_MUSHROOM)));




    public static void register(IEventBus eventBus)  {
        ITEMS.register(eventBus);
    }
}
