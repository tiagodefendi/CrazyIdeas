package com.defendi.crazyideas.datagen;

import com.defendi.crazyideas.CrazyIdeas;
import com.defendi.crazyideas.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CrazyIdeas.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.HOLY_METAL.get());

        basicItem(ModItems.HELL_FUEL.get());

        basicItem(ModItems.METAL_DETECTOR.get());
        basicItem(ModItems.CHISEL.get());

        basicItem(ModItems.SENZU_BEAN.get());
    }
}
