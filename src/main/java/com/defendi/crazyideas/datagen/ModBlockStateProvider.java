package com.defendi.crazyideas.datagen;

import com.defendi.crazyideas.CrazyIdeas;
import com.defendi.crazyideas.block.ModBlocks;
import com.defendi.crazyideas.block.sacred.HolyLampBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
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
        holyLampBlock();
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(
                blockRegistryObject.get(),
                cubeAll(blockRegistryObject.get())
        );
    }

    private void holyLampBlock() {
        getVariantBuilder(ModBlocks.HOLY_LAMP.get()).forAllStates( state -> {
            if (state.getValue(HolyLampBlock.CLICKED)) {
                return new ConfiguredModel[]{
                        new ConfiguredModel(models().cubeAll(
                                "holy_lamp_on",
                                ResourceLocation.fromNamespaceAndPath(
                                        CrazyIdeas.MOD_ID,
                                        "block/" + "holy_lamp_on"
                                )
                        ))
                };
            }
            else {
                return new ConfiguredModel[]{
                        new ConfiguredModel(models().cubeAll(
                                "holy_lamp_off",
                                ResourceLocation.fromNamespaceAndPath(
                                        CrazyIdeas.MOD_ID,
                                        "block/" + "holy_lamp_off"
                                )
                        ))
                };
            }
        });
        simpleBlockItem(
                ModBlocks.HOLY_LAMP.get(),
                models().cubeAll(
                        "holy_lamp_on",
                        ResourceLocation.fromNamespaceAndPath(
                                CrazyIdeas.MOD_ID,
                                "block/" + "holy_lamp_off"
                        )
                )
        );
    }
}
