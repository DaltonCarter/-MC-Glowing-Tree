package com.CartersDev.GlowingTree.world;

import com.CartersDev.GlowingTree.Tree;
import com.CartersDev.GlowingTree.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = Tree.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

        ModTreeGeneration.generateTrees(event);

    }


}
