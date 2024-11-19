package com.defendi.crazyideas.datagen;

import com.defendi.crazyideas.block.ModBlocks;
import com.defendi.crazyideas.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.HOLY_METAL_BLOCK.get());
        this.add(
                ModBlocks.HOLY_CATALYST_BLOCK.get(),
                block -> createSilkTouchOnlyTable(
                        ModBlocks.HOLY_CATALYST_BLOCK.get()
                )
        );
        dropSelf(ModBlocks.HOLY_LAMP.get());

        dropSelf(ModBlocks.EVIL_METAL_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
