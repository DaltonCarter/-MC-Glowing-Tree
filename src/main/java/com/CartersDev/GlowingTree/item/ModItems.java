package com.CartersDev.GlowingTree.item;

import com.CartersDev.GlowingTree.Tree;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, Tree.MOD_ID);


    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> YOKARITE = ITEMS.register("yokarite",
            () -> new Item(new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> TIBERIUM = ITEMS.register("tiberium",
            () -> new Item(new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> TIBERIUM_BLUE = ITEMS.register("tiberium_blue",
            () -> new Item(new Item.Properties().group(ModItemGroup.GLOWING_TREE)));




    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }

}
