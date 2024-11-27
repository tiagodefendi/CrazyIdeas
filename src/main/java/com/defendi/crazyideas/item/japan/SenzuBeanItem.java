package com.defendi.crazyideas.item.japan;

import com.defendi.crazyideas.item.food.ModFoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SenzuBeanItem extends Item {
    public SenzuBeanItem(Properties pProperties){
        super(pProperties);
    }

    @Override
    public void releaseUsing(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity, int pTimeCharged) {
        this.finishUsingItem(pStack, pLevel, pLivingEntity);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        pLivingEntity.revive();
        pLivingEntity.removeAllEffects();
        pLivingEntity.heal(Float.MAX_VALUE);

        if (pLivingEntity instanceof Player player) {
            player.getCooldowns().addCooldown(this, 10);
        }

        return pLivingEntity.eat(pLevel, pStack, ModFoodProperties.SENZU_BEAN);
    }
}
