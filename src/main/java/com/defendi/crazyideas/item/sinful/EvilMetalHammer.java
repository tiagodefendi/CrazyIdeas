package com.defendi.crazyideas.item.sacred;
import com.defendi.crazyideas.item.tool.HammerItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class EvilMetalHammer extends HammerItem {
    public HammerItem(Tier pTier, Properties pProperties) {
        super(pTier, BlockTags.MINEABLE_WITH_PICKAXE, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

//    @Override
//    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
//        pTooltipComponents.add(Component.translatable("tooltip.crazyideas.evil_metal_hammer"));
//
//        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
//    }
}
