package com.defendi.crazyideas.item.tool;

import com.defendi.crazyideas.item.ModItems;
import com.defendi.crazyideas.tags.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

// NOTE: -1 uese indicates that the item will be negative and I will use class UnbreakableTieredItem for it

public class ModToolTiers {
    public static final Tier HOLY_METAL = new ForgeTier(
            4000,
            8,
            10f,
            35,
            ModTags.Blocks.NEED_HOLY_METAL_TOOL,
            () -> Ingredient.of(ModItems.HOLY_METAL.get()),
            ModTags.Blocks.INCORRECT_FOR_HOLY_METAL_TOOL
    );

    public static final Tier EVIL_METAL = new ForgeTier(
            4000,
            8,
            10f,
            35,
            ModTags.Blocks.NEED_EVIL_METAL_TOOL,
            () -> Ingredient.of(ModItems.HOLY_METAL.get()),
            ModTags.Blocks.INCORRECT_FOR_EVIL_METAL_TOOL
    );

    public static final Tier ANGEL_TOOL = new ForgeTier(
            -1,
            10,
            16f,
            45,
            ModTags.Blocks.NEED_HOLY_METAL_TOOL,
            () -> Ingredient.of(ModItems.HOLY_METAL.get()),
            ModTags.Blocks.INCORRECT_FOR_HOLY_METAL_TOOL
    );
}
