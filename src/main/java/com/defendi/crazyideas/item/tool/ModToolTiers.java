package com.defendi.crazyideas.item.tool;

import com.defendi.crazyideas.item.ModItems;
import com.defendi.crazyideas.tags.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

// NOTE: -1 uese indicates that the item will be negative and I will use class UnbreakableTieredItem for it

public class ModToolTiers {
    public static final Tier HOLY_METAL = new ForgeTier(
            -1,
            4,
            6f,
            30,
            ModTags.Blocks.NEED_HOLY_METAL_TOOL,
            () -> Ingredient.of(ModItems.HOLY_METAL.get()),
            ModTags.Blocks.INCORRECT_FOR_HOLY_METAL_TOOL
    );
}
