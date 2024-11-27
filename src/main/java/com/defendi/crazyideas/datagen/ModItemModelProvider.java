package com.defendi.crazyideas.datagen;

import com.defendi.crazyideas.CrazyIdeas;
import com.defendi.crazyideas.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CrazyIdeas.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.HOLY_METAL.get());
        handheldItem(ModItems.ANGEL_BLADE);

        basicItem(ModItems.EVIL_METAL.get());
        handheldItem(ModItems.EVIL_METAL_HAMMER);
        handheldItem(ModItems.DEMON_KILLING_KNIFE);
        basicItem(ModItems.HELL_FUEL.get());

        basicItem(ModItems.METAL_DETECTOR.get());
        basicItem(ModItems.CHISEL.get());

        basicItem(ModItems.SENZU_BEAN.get());
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(
                item.getId().getPath(),
                ResourceLocation.parse("item/handheld")
        )
                .texture(
                        "layer0",
                        ResourceLocation.fromNamespaceAndPath(
                                CrazyIdeas.MOD_ID,
                                "item/" + item.getId().getPath()
                        )
                );
    }
}
