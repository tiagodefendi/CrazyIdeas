package com.defendi.crazyideas.datagen;

import com.defendi.crazyideas.block.ModBlocks;
import com.defendi.crazyideas.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(
                RecipeCategory.MISC,
                ModBlocks.HOLY_METAL_BLOCK.get(),
                1
        )
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.HOLY_METAL.get())
                .unlockedBy(getHasName(ModItems.HOLY_METAL.get()), has(ModItems.HOLY_METAL.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(
                RecipeCategory.MISC,
                ModItems.HOLY_METAL.get(),
                9
        )
                .requires(
                        ModBlocks.HOLY_METAL_BLOCK.get(),
                        1
                )
                .unlockedBy(getHasName(ModBlocks.HOLY_METAL_BLOCK.get()), has(ModBlocks.HOLY_METAL_BLOCK.get()))
                .save(pRecipeOutput);
    }
}
