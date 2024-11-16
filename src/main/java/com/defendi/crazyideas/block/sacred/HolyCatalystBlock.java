package com.defendi.crazyideas.block.sacred;

import com.defendi.crazyideas.block.ModBlocks;
import com.defendi.crazyideas.item.ModItems;
import com.defendi.crazyideas.tags.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

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
            else if (itemEntity.getItem().getItem() == Items.GOLD_BLOCK) {
                itemEntity.setItem(new ItemStack(ModBlocks.HOLY_METAL_BLOCK.get(), itemEntity.getItem().getCount()));
            }
            else if (isValidItem(itemEntity.getItem())) {
                itemEntity.setItem(new ItemStack(Items.BREAD, itemEntity.getItem().getCount()*2));
            }
        }

        super.stepOn(pLevel, pPos, pState, pEntity);
    }

    private boolean isValidItem(ItemStack item) {
        return item.is(ModTags.Items.BLESSABLE_ITEMS);
    }

    @Override
    public void appendHoverText(ItemStack pStack, Item.TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        pTooltipComponents.add(Component.translatable("tooltip.crazyideas.holy_catalyst_block"));
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }
}
