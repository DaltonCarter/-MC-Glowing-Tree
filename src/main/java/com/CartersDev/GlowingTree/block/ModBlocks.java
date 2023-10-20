package com.CartersDev.GlowingTree.block;

import com.CartersDev.GlowingTree.Tree;
import com.CartersDev.GlowingTree.block.custom.FirestoneBlock;
import com.CartersDev.GlowingTree.item.ModItemGroup;
import com.CartersDev.GlowingTree.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Tree.MOD_ID);

    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> YOKARITE_ORE = registerBlock("yokarite_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> TIBERIUM_ORE = registerBlock("tiberium_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> YOKARITE_BLOCK = registerBlock("yokarite_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> TIBERIUM_BLOCK = registerBlock("tiberium_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> TIBERIUM_BLUE_BLOCK = registerBlock("tiberium_blue_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> FIRESTONE_BLOCK = registerBlock("firestone_block",
            () -> new FirestoneBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));



public static final RegistryObject<Block> AMETHYST_STAIRS = registerBlock("amethyst_stairs",
        () -> new StairsBlock(() -> AMETHYST_BLOCK.get().getDefaultState(),
                AbstractBlock.Properties.create(Material.IRON).harvestLevel(3)
                        .harvestTool(ToolType.PICKAXE).setRequiresTool()));

    public static final RegistryObject<Block> AMETHYST_FENCE = registerBlock("amethyst_fence",
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> AMETHYST_FENCE_GATE = registerBlock("amethyst_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(5f)));








    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {

        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.GLOWING_TREE)));
    }

    public static void register(IEventBus eventBus) {

        BLOCKS.register(eventBus);
    }

}
