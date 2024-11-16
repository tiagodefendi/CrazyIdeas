package com.defendi.crazyideas.datagen;

import com.defendi.crazyideas.CrazyIdeas;
import com.defendi.crazyideas.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CrazyIdeas.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.HOLY_METAL_BLOCK);
        blockWithItem(ModBlocks.HOLY_CATALYST_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(
                blockRegistryObject.get(),
                cubeAll(blockRegistryObject.get())
        );
    }
}
