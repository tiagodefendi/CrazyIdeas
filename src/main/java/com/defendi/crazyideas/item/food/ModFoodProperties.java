package com.defendi.crazyideas.item.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties SENZU_BEAN =
            new CustomFoodPropertiesBuilder ()
                    .nutrition(20)
                    .saturationModifier(2.0f)
                    .alwaysEdible()
                    .eatSeconds(0.4f)
                    .effect(new MobEffectInstance(
                            MobEffects.REGENERATION,
                            70,
                            9,
                            false,
                            false
                    ),1.0f )
                    .effect(new MobEffectInstance(
                            MobEffects.SATURATION,
                            70,
                            9,
                            false,
                            false
                    ),1.0f )
                    .effect(new MobEffectInstance(
                            MobEffects.DAMAGE_RESISTANCE,
                            75,
                            4,
                            false,
                            false
                    ),1.0f )
                    .build();
}
