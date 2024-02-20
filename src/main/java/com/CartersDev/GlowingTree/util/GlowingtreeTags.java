package com.CartersDev.GlowingTree.util;

import com.CartersDev.GlowingTree.Tree;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class GlowingtreeTags {

    public static class Blocks {

        public static final Tags.IOptionalNamedTag<Block> FIRESTONE_CLICKABLE_BLOCKS =
                createTag("firestone_clickable_blocks");

        private static Tags.IOptionalNamedTag<Block> createTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(Tree.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }

    }

    public static class Items {

        public static final Tags.IOptionalNamedTag<Item> AMETHYST = createForgeTag("gems/amethyst");

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(Tree.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }

    }

}
