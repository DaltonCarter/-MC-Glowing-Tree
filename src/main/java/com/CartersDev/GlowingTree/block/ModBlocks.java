package com.CartersDev.GlowingTree.block;

import com.CartersDev.GlowingTree.Tree;
import com.CartersDev.GlowingTree.block.custom.*;
import com.CartersDev.GlowingTree.block.custom.Trees.GlowwoodTree;
import com.CartersDev.GlowingTree.item.ModItemGroup;
import com.CartersDev.GlowingTree.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.potion.Effects;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {

    public static ToIntFunction<BlockState> glowLog = BlockState -> 10;

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Tree.MOD_ID);

    public static final RegistryObject<Block> FLOWER_OF_LIFE = registerBlock("flower_of_life",
            () -> new FlowerBlock(Effects.REGENERATION, 2, AbstractBlock.Properties.from(Blocks.DANDELION)));

    public static final RegistryObject<Block> GLOWWOOD_LOG = registerBlock("glowwood_log",
            () -> new RotatedPillarBlock((AbstractBlock.Properties.from(Blocks.OAK_LOG)
                    .setLightLevel(glowLog)))
            {
                @Override
                public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> GLOWWOOD_WOOD = registerBlock("glowwood_wood",
            () -> new RotatedPillarBlock((AbstractBlock.Properties.from(Blocks.OAK_WOOD).setLightLevel(glowLog)))
            {
                @Override
                public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> STRIPPED_GLOWWOOD_LOG = registerBlock("stripped_glowwood_log",
            () -> new RotatedPillarBlock((AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_LOG)))
            {
                @Override
                public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> STRIPPED_GLOWWOOD_WOOD = registerBlock("stripped_glowwood_wood",
            () -> new RotatedPillarBlock((AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_WOOD)))
            {
                @Override
                public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> GLOWWOOD_PLANKS = registerBlock("glowwood_planks",
            () -> new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)) {
                @Override
                public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> GLOWWOOD_LEAVES = registerBlock("glowwood_leaves",
            () -> new GlowingLeaves((AbstractBlock.Properties.create(Material.LEAVES)
                    .hardnessAndResistance(0.2f).tickRandomly().sound(SoundType.PLANT)
                    .notSolid().setLightLevel(glowLog)))
            {
                @Override
                public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> GLOWWOOD_SAPLING = registerBlock("glowwood_sapling",
            () -> new SaplingBlock(new GlowwoodTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)
                    .setLightLevel(glowLog)));

    public static final RegistryObject<Block> GLOWWOOD_SLAB = registerBlock("glowwood_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .harvestLevel(2).harvestTool(ToolType.AXE)
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