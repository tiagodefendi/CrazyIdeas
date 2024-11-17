package com.defendi.crazyideas.item.tool;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

// NOTE: Here I used Minecraft's own standard library but removed the durability option

public class UnbreakableTieredItem extends Item {
    private final Tier tier;

    public UnbreakableTieredItem(Tier pTier, Item.Properties pProperties) {
        super(pProperties.stacksTo(1));
        this.tier = pTier;
    }

    public Tier getTier() {
        return this.tier;
    }

    @Override
    public int getEnchantmentValue() {
        return this.tier.getEnchantmentValue();
    }

    @Override
    public boolean isValidRepairItem(ItemStack pToRepair, ItemStack pRepair) {
        return this.tier.getRepairIngredient().test(pRepair) || super.isValidRepairItem(pToRepair, pRepair);
    }
}
