package com.defendi.crazyideas.item;

import com.defendi.crazyideas.CrazyIdeas;
import com.defendi.crazyideas.item.food.ModFoodProperties;
import com.defendi.crazyideas.item.japan.SenzuBeanItem;
import com.defendi.crazyideas.item.fuel.FuelItem;
import com.defendi.crazyideas.item.sacred.AngelBladeItem;
import com.defendi.crazyideas.item.tool.ModToolTiers;
import com.defendi.crazyideas.item.tool.SwordUnbreakableItem;
import com.defendi.crazyideas.item.utility.ChiselItem;
import com.defendi.crazyideas.item.utility.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CrazyIdeas.MOD_ID);

    public static final RegistryObject<Item> HOLY_METAL = ITEMS.register(
            "holy_metal",
            () -> new Item(
                    new Item.Properties()
            )
    );

    public static final RegistryObject<Item> ANGEL_BLADE = ITEMS.register(
            "angel_blade",
            () -> new AngelBladeItem(
                    ModToolTiers.HOLY_METAL,
                    new Item.Properties()
                            .attributes(SwordItem.createAttributes(
                                    ModToolTiers.HOLY_METAL,
                                    3,
                                    -1.5f
                            ))
            )
    );

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register(
            "metal_detector",
            () -> new MetalDetectorItem(
                    new Item.Properties()
                            .durability(100)
            )
    );

    public static final RegistryObject<Item> CHISEL = ITEMS.register(
            "chisel",
            () -> new ChiselItem(
                    new Item.Properties()
                            .durability(250)
            )
    );

    public static final RegistryObject<Item> SENZU_BEAN = ITEMS.register(
            "senzu_bean",
            () -> new SenzuBeanItem(
                    new Item.Properties()
                            .stacksTo(16)
                            .food(ModFoodProperties.SENZU_BEAN)
            )
    );

    public static final RegistryObject<Item> HELL_FUEL = ITEMS.register(
            "hell_fuel",
            () -> new FuelItem(
                    new Item.Properties(),
                    4800
            )
    );

//    public static final RegistryObject<Item> MOTHER_FLAME = ITEMS.register(
//            "mother_flame",
//            () -> new Item(
//                    new Item.Properties()
//            )
//    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
