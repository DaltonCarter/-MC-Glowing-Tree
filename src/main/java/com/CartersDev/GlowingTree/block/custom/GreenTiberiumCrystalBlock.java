package com.CartersDev.GlowingTree.block.custom;

import com.CartersDev.GlowingTree.block.ModBlocks;
import com.CartersDev.GlowingTree.item.ModItems;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class GreenTiberiumCrystalBlock extends CropsBlock {

public static final IntegerProperty AGE = BlockStateProperties.AGE_0_7;

    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{

            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};

    public GreenTiberiumCrystalBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.getStateContainer().getBaseState());

    }






    @Override
    protected IItemProvider getSeedsItem() {
        return ModItems.GREEN_TIBERIUM_DUST.get();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE_BY_AGE[state.get(this.getAgeProperty())];
    }

    public boolean canUseBonemeal() {
        return false;
    }

    @Override
    public void onBlockHarvested (World worldIn, BlockPos pos, BlockState state, PlayerEntity player){
        super.onBlockHarvested(worldIn, pos, state, player);
        if(worldIn.isRemote) {
            worldIn.setBlockState(pos, ModBlocks.GREEN_TIBERIUM_CROP.get().getDefaultState());}
    }





}
