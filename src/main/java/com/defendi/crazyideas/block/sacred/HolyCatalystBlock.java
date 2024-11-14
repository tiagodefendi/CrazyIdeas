package com.defendi.crazyideas.block.sacred;

import com.defendi.crazyideas.block.ModBlocks;
import com.defendi.crazyideas.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class HolyCatalystBlock extends Block {
    public HolyCatalystBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if (pEntity instanceof ItemEntity itemEntity) {
            if (itemEntity.getItem().getItem() == Items.GOLD_INGOT) {
                itemEntity.setItem(new ItemStack(ModItems.HOLY_METAL.get(), itemEntity.getItem().getCount()));
            }

            if (itemEntity.getItem().getItem() == Items.GOLD_BLOCK) {
                itemEntity.setItem(new ItemStack(ModBlocks.HOLY_METAL_BLOCK.get(), itemEntity.getItem().getCount()));
            }
        }

        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
