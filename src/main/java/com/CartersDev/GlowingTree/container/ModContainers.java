package com.CartersDev.GlowingTree.container;

import com.CartersDev.GlowingTree.Tree;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainers {

    public static DeferredRegister<ContainerType<?>> CONTAINERS
            = DeferredRegister.create(ForgeRegistries.CONTAINERS, Tree.MOD_ID);

public static void register(IEventBus eventBus) {
    CONTAINERS.register(eventBus);
}


}
