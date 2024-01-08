package com.CartersDev.GlowingTree.screen;

import com.CartersDev.GlowingTree.Tree;
import com.CartersDev.GlowingTree.container.LightningChannelerContainer;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class LightningChannelerScreen extends ContainerScreen<LightningChannelerContainer> {

    private final ResourceLocation GUI = new ResourceLocation(Tree.MOD_ID,
            "textures/gui/lightning-channeler-gui.png");

    public LightningChannelerScreen(LightningChannelerContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float v, int i, int i1) {

    }
}
