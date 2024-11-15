package com.defendi.crazyideas.item.sacred;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
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

        FoodProperties foodproperties = (FoodProperties)pStack.get(DataComponents.FOOD);
        return foodproperties != null ? pLivingEntity.eat(pLevel, pStack, foodproperties) : pStack;
    }
}
