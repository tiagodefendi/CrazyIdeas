package com.defendi.crazyideas.item.food;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodConstants;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

import java.util.Optional;

// NOTE: Here I used Minecraft's own standard library but create a new method to select eatSeconds

public class CustomFoodPropertiesBuilder extends FoodProperties.Builder {
    private int nutrition;
    private float saturationModifier;
    private boolean canAlwaysEat;
    private float eatSeconds = 1.6F;
    private Optional<ItemStack> usingConvertsTo = Optional.empty();
    private final ImmutableList.Builder<FoodProperties.PossibleEffect> effects = ImmutableList.builder();

    public CustomFoodPropertiesBuilder() {
    }

    @Override
    public CustomFoodPropertiesBuilder nutrition(int pNutrition) {
        this.nutrition = pNutrition;
        return this;
    }

    @Override
    public CustomFoodPropertiesBuilder saturationModifier(float pSaturationModifier) {
        this.saturationModifier = pSaturationModifier;
        return this;
    }

    @Override
    public CustomFoodPropertiesBuilder alwaysEdible() {
        this.canAlwaysEat = true;
        return this;
    }

    public CustomFoodPropertiesBuilder eatSeconds(float eatSeconds) {
        this.eatSeconds = eatSeconds;
        return this;
    }

    @Override
    public CustomFoodPropertiesBuilder effect(MobEffectInstance pEffect, float pProbability) {
        this.effects.add(new FoodProperties.PossibleEffect(pEffect, pProbability));
        return this;
    }

    @Override
    public CustomFoodPropertiesBuilder usingConvertsTo(ItemLike pItem) {
        this.usingConvertsTo = Optional.of(new ItemStack(pItem));
        return this;
    }

    @Override
    public FoodProperties build() {
        float $$0 = FoodConstants.saturationByModifier(this.nutrition, this.saturationModifier);
        return new FoodProperties(this.nutrition, $$0, this.canAlwaysEat, this.eatSeconds, this.usingConvertsTo, this.effects.build());
    }
}
