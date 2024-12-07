package com.defendi.crazyideas.item.death;

import com.defendi.crazyideas.item.tool.SwordUnbreakableItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class DeathScythe extends SwordUnbreakableItem {
    public DeathScythe(Tier pTier, Properties pProperties) {
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
}
