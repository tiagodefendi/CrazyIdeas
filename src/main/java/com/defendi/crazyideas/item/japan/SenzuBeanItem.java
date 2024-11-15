package com.defendi.crazyideas.item.japan;

import com.defendi.crazyideas.item.food.ModFoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SenzuBeanItem extends Item {
    public SenzuBeanItem(Properties pProperties){
        super(pProperties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        pLivingEntity.revive();
        pLivingEntity.heal(pLivingEntity.getMaxHealth());

        return pLivingEntity.eat(pLevel, pStack, ModFoodProperties.SENZU_BEAN);
    }
}
