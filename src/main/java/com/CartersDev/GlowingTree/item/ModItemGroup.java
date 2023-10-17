package com.CartersDev.GlowingTree.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup GLOWING_TREE = new ItemGroup("glowingTreeTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.GLOWINGOAK.get());
        }
    };

}
