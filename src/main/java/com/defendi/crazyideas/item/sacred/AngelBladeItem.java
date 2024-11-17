package com.defendi.crazyideas.item.sacred;

import com.defendi.crazyideas.item.tool.SwordUnbreakableItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class AngelBladeItem extends SwordUnbreakableItem {
    public AngelBladeItem(Tier pTier, Properties pProperties) {
        super(pTier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        if (pAttacker instanceof Player player){
            pTarget.hurt(pAttacker.damageSources().playerAttack(player), Float.MAX_VALUE);
        }
        if (pTarget.isAlive()) {
            pTarget.kill();
        }

        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

//    @Override
//    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
//        pTooltipComponents.add(Component.translatable("tooltip.crazyideas.angel_blade"));
//
//        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
//    }
}
