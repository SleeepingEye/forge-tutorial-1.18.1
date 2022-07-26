package com.sleepingeye.palenest.item;

import com.sleepingeye.palenest.PaleNest;
import com.sleepingeye.palenest.item.custom.DowsingRodItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PaleNest.MOD_ID);

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



    public static final RegistryObject<Item> PALE_PICKAXE = ITEMS.register("pale_pickaxe",
            () -> new PickaxeItem(ModTiers.REFINED_PALE_ORE, 6, 1f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> PALE_AXE = ITEMS.register("pale_axe",
            () -> new AxeItem(ModTiers.REFINED_PALE_ORE, 10, 1f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> PALE_SHOVEL = ITEMS.register("pale_shovel",
            () -> new ShovelItem(ModTiers.REFINED_PALE_ORE, 7, 1f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> PALE_HOE = ITEMS.register("pale_hoe",
            () -> new HoeItem(ModTiers.REFINED_PALE_ORE, 0, 0f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));




    public static final RegistryObject<Item> NAIL = ITEMS.register("nail",
            () -> new SwordItem(ModTiers.REFINED_PALE_ORE, 4, 0f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> SHARPENED_NAIL = ITEMS.register("sharpened_nail",
            () -> new SwordItem(ModTiers.REFINED_PALE_ORE, 8, 0f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> CHANNELLED_NAIL = ITEMS.register("channelled_nail",
            () -> new SwordItem(ModTiers.REFINED_PALE_ORE, 12, 1f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> COILED_NAIL = ITEMS.register("coiled_nail",
            () -> new SwordItem(ModTiers.REFINED_PALE_ORE, 16, 1f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> PURE_NAIL = ITEMS.register("pure_nail",
            () -> new SwordItem(ModTiers.REFINED_PALE_ORE, 20, 1f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));



    public static final RegistryObject<Item> MYSTERIOUS_MUSHROOM = ITEMS.register("mysterious_mushroom",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB3).food(ModFoods.MYSTERIOUS_MUSHROOM)));

    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB3).food(ModFoods.PIZZA)));

    public static final RegistryObject<Item> FRIED_POTATO = ITEMS.register("fried_potato",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB3).food(ModFoods.FRIED_POTATO)));

    public static final RegistryObject<Item> FRENCH_FRIES = ITEMS.register("french_fries",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB3).food(ModFoods.FRENCH_FRIES)));


    public static final RegistryObject<Item> VENGEFUL_SPIRIT = ITEMS.register("vengeful_spirit",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> SHORTBOW = ITEMS.register("shortbow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> PALE_HELMET = ITEMS.register("pale_helmet",
            () -> new ArmorItem(ModArmorMaterials.PALE_ORE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> PALE_CHESTPLATE = ITEMS.register("pale_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PALE_ORE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> PALE_LEGGINGS = ITEMS.register("pale_leggings",
            () -> new ArmorItem(ModArmorMaterials.PALE_ORE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> PALE_BOOTS = ITEMS.register("pale_boots",
            () -> new ArmorItem(ModArmorMaterials.PALE_ORE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));




    public static void register(IEventBus eventBus)  {
        ITEMS.register(eventBus);
    }
}
