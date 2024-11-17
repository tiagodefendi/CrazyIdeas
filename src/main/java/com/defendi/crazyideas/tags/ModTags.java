package com.defendi.crazyideas.tags;

import com.defendi.crazyideas.CrazyIdeas;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEED_HOLY_METAL_TOOL = createTag("needs_holy_metal_tool");
        public static final TagKey<Block> INCORRECT_FOR_HOLY_METAL_TOOL = createTag("incorrect_for_holy_metal_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(CrazyIdeas.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> BLESSABLE_ITEMS = createTag("blessable_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(CrazyIdeas.MOD_ID, name));
        }
    }
}
