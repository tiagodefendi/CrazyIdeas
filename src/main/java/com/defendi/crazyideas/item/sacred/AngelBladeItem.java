package com.defendi.crazyideas.item.sacred;

import com.defendi.crazyideas.item.tool.SwordUnbreakableItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class AngelBladeItem extends SwordUnbreakableItem {
    public AngelBladeItem(Tier pTier, Properties pProperties) {
        super(pTier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.kill();
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
