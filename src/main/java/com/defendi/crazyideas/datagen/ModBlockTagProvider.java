package com.defendi.crazyideas.datagen;

import com.defendi.crazyideas.CrazyIdeas;
import com.defendi.crazyideas.block.ModBlocks;
import com.defendi.crazyideas.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CrazyIdeas.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        ModBlocks.HOLY_METAL_BLOCK.get(),

                        ModBlocks.EVIL_METAL_BLOCK.get()
                );

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(
                        ModBlocks.HOLY_METAL_BLOCK.get(),

                        ModBlocks.EVIL_METAL_BLOCK.get()
                );

        tag(ModTags.Blocks.NEED_HOLY_METAL_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.NEED_EVIL_METAL_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
    }
}
