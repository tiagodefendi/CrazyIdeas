package com.defendi.crazyideas.item.tool;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class RapierItem extends SwordItem {
    public RapierItem(Tier pTier, Properties pProperties) {
        super(pTier, pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pHand);

        pPlayer.getCooldowns().addCooldown(this, 60);

        if(!pPlayer.getBlockStateOn().isAir()) {
            pPlayer.jumpFromGround();
        }

        pPlayer.move(MoverType.SELF, pPlayer.getLookAngle().multiply(-1, 1, -1));

        return InteractionResultHolder.consume(itemstack);
    }
}
