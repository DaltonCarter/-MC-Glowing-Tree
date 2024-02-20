package com.CartersDev.GlowingTree.item;

import com.CartersDev.GlowingTree.Tree;

import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, Tree.MOD_ID);


    public static final RegistryObject<Item> GLOWWOOD_SWORD = ITEMS.register("glowwood_sword",
            () -> new SwordItem(ModitemTier.GLOWWOOD, 2, 3f,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> GLOWWOOD_AXE = ITEMS.register("glowwood_axe",
            () -> new AxeItem(ModitemTier.GLOWWOOD, 4, -6f,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> GLOWWOOD_PICKAXE = ITEMS.register("glowwood_pickaxe",
            () -> new PickaxeItem(ModitemTier.GLOWWOOD, 0, -1f,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> GLOWWOOD_SHOVEL = ITEMS.register("glowwood_shovel",
            () -> new ShovelItem(ModitemTier.GLOWWOOD, 0, -1f,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> GLOWWOOD_HOE = ITEMS.register("glowwood_hoe",
            () -> new HoeItem(ModitemTier.GLOWWOOD, 0, 0f,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> GLOWWOOD_STICK = ITEMS.register("glowwood_stick",
            () -> new Item(new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> GLOWWOOD_SAP = ITEMS.register("glowwood_sap",
            () -> new Item(new Item.Properties().group(ModItemGroup.GLOWING_TREE)));



    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }

}
