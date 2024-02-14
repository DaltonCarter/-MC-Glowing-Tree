package com.CartersDev.GlowingTree.fluid;

import com.CartersDev.GlowingTree.Tree;
import com.CartersDev.GlowingTree.block.ModBlocks;
import com.CartersDev.GlowingTree.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.ToIntFunction;

public class ModFluids {

    public static ToIntFunction<BlockState> liquid_tiberium = BlockState -> 10;
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    //for Tiberium
    public static final ResourceLocation LAVA_STILL_RL = new ResourceLocation("block/lava_still");
    public static final ResourceLocation LAVA_FLOWING_RL = new ResourceLocation("block/lava_flow");
    public static final ResourceLocation LAVA_OVERLAY_RL = new ResourceLocation("block/lava_overlay");
    //end of Tiberium

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, Tree.MOD_ID);

    //Tutorial Fluids
public static final RegistryObject<FlowingFluid> OIL_FLUID =
        FLUIDS.register("oil_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.OIL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> OIL_FLOWING =
            FLUIDS.register("oil_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.OIL_PROPERTIES));

    public static final ForgeFlowingFluid.Properties OIL_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> OIL_FLUID.get(), () -> OIL_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK).overlay(WATER_OVERLAY_RL)
            .color(0xbffed0d0)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.OIL_BLOCK.get()).bucket(() -> ModItems.OIL_BUCKET.get());

public static final RegistryObject<FlowingFluidBlock> OIL_BLOCK = ModBlocks.BLOCKS.register("oil",
        () -> new FlowingFluidBlock(() -> ModFluids.OIL_FLUID.get(), AbstractBlock.Properties.create(Material.WATER)
                .doesNotBlockMovement().hardnessAndResistance(100f).noDrops()));

//End Tutorial Fluids


//Off Tutorial Fluids
public static final RegistryObject<FlowingFluid> TIBERIUM_FLUID =
        FLUIDS.register("tiberium_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.LIQUID_TIBERIUM_PROPERTIES));

    public static final RegistryObject<FlowingFluid> TIBERIUM_FLOWING =
            FLUIDS.register("tiberium_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.LIQUID_TIBERIUM_PROPERTIES));

    public static final ForgeFlowingFluid.Properties LIQUID_TIBERIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> TIBERIUM_FLUID.get(), () -> TIBERIUM_FLOWING.get(), FluidAttributes.builder(LAVA_STILL_RL, LAVA_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.ITEM_BUCKET_EMPTY_LAVA).overlay(LAVA_OVERLAY_RL)
            .color(0xbf00F587)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.LIQUID_TIBERIUM_BLOCK.get()).bucket(() -> ModItems.TIBERIUM_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> LIQUID_TIBERIUM_BLOCK = ModBlocks.BLOCKS.register("liquid_tiberium",
            () -> new FlowingFluidBlock(() -> ModFluids.TIBERIUM_FLUID.get(), AbstractBlock.Properties.create(Material.LAVA)
                    .doesNotBlockMovement().hardnessAndResistance(100f).noDrops().setLightLevel(liquid_tiberium)));

//End Off Tutorial Fluids

public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }



}
