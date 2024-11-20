package com.defendi.crazyideas.item.sacred;

import com.defendi.crazyideas.item.fuel.FuelItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class HellFuel extends FuelItem {
    private int burnTime = 13;

    public FuelItem(Properties pProperties, int burnTime) {
        super(pProperties);
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTime;
    }    

//    @Override
//    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
//        pTooltipComponents.add(Component.translatable("tooltip.crazyideas.angel_blade"));
//
//        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
//    }
}
