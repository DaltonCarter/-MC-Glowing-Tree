package com.CartersDev.GlowingTree.integration.jei;

import com.CartersDev.GlowingTree.Tree;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;

import net.minecraft.util.ResourceLocation;


@JeiPlugin
public class TreeJei implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Tree.MOD_ID, "jei_plugin");
    }


}
