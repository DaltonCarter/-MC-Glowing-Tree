package com.CartersDev.GlowingTree.item;

import com.CartersDev.GlowingTree.Tree;
import com.CartersDev.GlowingTree.block.ModBlocks;
import com.CartersDev.GlowingTree.item.custom.Firestone;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, Tree.MOD_ID);


    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> FIRESTONE = ITEMS.register("firestone",
            () -> new Firestone(new Item.Properties().group(ModItemGroup.GLOWING_TREE).maxDamage(8)));

    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModitemTier.AMETHYST, 2, 3f,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModitemTier.AMETHYST, 4, -6f,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModitemTier.AMETHYST, 0, -1f,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModitemTier.AMETHYST, 0, -1f,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ModitemTier.AMETHYST, 0, 0f,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet",
            () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate",
            () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings",
            () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots",
            () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> OATS = ITEMS.register("oats",
            () -> new BlockItem(ModBlocks.OATS.get(), new Item.Properties()
                    .food(new Food.Builder().hunger(1).saturation(0.1f).fastToEat()
                            .build()).group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> AMETHYST_HORSE_ARMOR = ITEMS.register("amethyst_horse_armor",
            () -> new HorseArmorItem(9, "amethyst",
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> REDWOOD_SIGN = ITEMS.register("redwood_sign",
            () -> new SignItem(new Item.Properties().maxStackSize(16).group(ModItemGroup.GLOWING_TREE),
                    ModBlocks.REDWOOD_SIGN.get(), ModBlocks.REDWOOD_WALL_SIGN.get()));





    //GlowWood Tools

    public static final RegistryObject<Item> GLOWWOOD_SWORD = ITEMS.register("glowwood_sword",
            () -> new SwordItem(ModitemTier.AMETHYST, 2, 3f,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> GLOWWOOD_AXE = ITEMS.register("glowwood_axe",
            () -> new AxeItem(ModitemTier.AMETHYST, 4, -6f,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> GLOWWOOD_PICKAXE = ITEMS.register("glowwood_pickaxe",
            () -> new PickaxeItem(ModitemTier.AMETHYST, 0, -1f,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> GLOWWOOD_SHOVEL = ITEMS.register("glowwood_shovel",
            () -> new ShovelItem(ModitemTier.AMETHYST, 0, -1f,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> GLOWWOOD_HOE = ITEMS.register("glowwood_hoe",
            () -> new HoeItem(ModitemTier.AMETHYST, 0, 0f,
                    new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> GLOWWOOD_STICK = ITEMS.register("glowwood_stick",
            () -> new Item(new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> GLOWWOOD_SAP = ITEMS.register("glowwood_sap",
            () -> new Item(new Item.Properties().group(ModItemGroup.GLOWING_TREE)));



    //End of GlowWood Tools




    //My Custom Items

    public static final RegistryObject<Item> YOKARITE = ITEMS.register("yokarite",
            () -> new Item(new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> TIBERIUM = ITEMS.register("tiberium",
            () -> new Item(new Item.Properties().group(ModItemGroup.GLOWING_TREE)));

    public static final RegistryObject<Item> TIBERIUM_BLUE = ITEMS.register("tiberium_blue",
            () -> new Item(new Item.Properties().group(ModItemGroup.GLOWING_TREE)));


    //end custom Itmes













    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }

}
