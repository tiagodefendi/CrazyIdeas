package com.defendi.crazyideas.item.tool;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class RapierItem extends SwordItem {
    public RapierItem(Tier pTier, Properties pProperties) {
        super(pTier, pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pHand);

        pPlayer.getCooldowns().addCooldown(this, 60);

        pPlayer.setDeltaMovement(
                pPlayer.getLookAngle().multiply(
                        -0.75,
                        0,
                        -0.75)
        );

        if(!pPlayer.getBlockStateOn().isAir()) {
            pPlayer.addDeltaMovement(Vec3.ZERO.add(0, (double) 1/3,0));
        }

        return InteractionResultHolder.consume(itemstack);
    }
}
