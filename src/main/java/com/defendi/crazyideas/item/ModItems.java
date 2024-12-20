package com.defendi.crazyideas.item;

import com.defendi.crazyideas.CrazyIdeas;
import com.defendi.crazyideas.item.death.DeathScythe;
import com.defendi.crazyideas.item.food.ModFoodProperties;
import com.defendi.crazyideas.item.japan.SenzuBeanItem;
import com.defendi.crazyideas.item.fuel.FuelItem;
import com.defendi.crazyideas.item.sacred.AngelBladeItem;
import com.defendi.crazyideas.item.sinful.DemonKillingKnifeItem;
import com.defendi.crazyideas.item.tool.HammerItem;
import com.defendi.crazyideas.item.tool.KatanaItem;
import com.defendi.crazyideas.item.tool.ModToolTiers;
import com.defendi.crazyideas.item.tool.RapierItem;
import com.defendi.crazyideas.item.utility.ChiselItem;
import com.defendi.crazyideas.item.utility.MetalDetectorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CrazyIdeas.MOD_ID);

    // SACRED ITEMS -------------------------------------------------------------------------
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
                                    5,
                                    -1.5f
                            ))
            )
    );

    // SINFUL ITEMS -------------------------------------------------------------------------
    public static final RegistryObject<Item> EVIL_METAL = ITEMS.register(
            "evil_metal",
        () -> new Item(
                new Item.Properties()
        )
    );

    public static final RegistryObject<Item> HELL_FUEL = ITEMS.register(
            "hell_fuel",
            () -> new FuelItem(
                    new Item.Properties(),
                    25600
            )
    );

    public static final RegistryObject<Item> EVIL_METAL_HAMMER = ITEMS.register(
            "evil_metal_hammer",
            () -> new HammerItem(
                    ModToolTiers.EVIL_METAL,
                    new Item.Properties()
                            .attributes(PickaxeItem.createAttributes(
                                    ModToolTiers.EVIL_METAL,
                                    0,
                                    -3f
                            ))
            )
    );

    public static final RegistryObject<Item> DEMON_KILLING_KNIFE = ITEMS.register(
            "demon-killing_knife",
            () -> new DemonKillingKnifeItem(
                    ModToolTiers.EVIL_METAL,
                    new Item.Properties()
                            .attributes(SwordItem.createAttributes(
                                    ModToolTiers.EVIL_METAL,
                                    -5,
                                    -1.25f
                            ))
            )
    );

    // DEATH ---------------------------------------------------------------------------------
    public static final RegistryObject<Item> DEATH_SCYTHE = ITEMS.register(
            "death_scythe",
            () -> new DeathScythe(
                    ModToolTiers.OMNI_TOOL,
                    new Item.Properties()
                            .attributes(SwordItem.createAttributes(
                                    ModToolTiers.OMNI_TOOL,
                                    5,
                                    -2.8f
                            ))
            )
    );

    // HUNTER ITEMS --------------------------------------------------------------------------

    // UTILITY ITEMS -------------------------------------------------------------------------
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

    // JAPAN ITEMS ----------------------------------------------------------------------
    public static final RegistryObject<Item> SENZU_BEAN = ITEMS.register(
            "senzu_bean",
            () -> new SenzuBeanItem(
                    new Item.Properties()
                            .stacksTo(16)
                            .food(ModFoodProperties.SENZU_BEAN)
            )
    );

//    public static final RegistryObject<Item> MOTHER_FLAME = ITEMS.register(
//            "mother_flame",
//            () -> new Item(
//                    new Item.Properties()
//            )
//    );

    public static final RegistryObject<Item> KATANA = ITEMS.register(
            "katana",
            () -> new KatanaItem(
                    Tiers.DIAMOND,
                    new Item.Properties()
                            .attributes(KatanaItem.createAttributes(
                                    Tiers.DIAMOND,
                                    6,
                                    -2.8f
                            ))
            )
    );

    // ADVENTURE TIME ITEMS ---------------------------------------------------------------
    public static final RegistryObject<Item> SCARLET = ITEMS.register(
            "scarlet",
            () -> new SwordItem(
                    Tiers.DIAMOND,
                    new Item.Properties()
                            .attributes(SwordItem.createAttributes(
                                    Tiers.DIAMOND,
                                    5,
                                    -2.4f
                            ))
            )
    );

    public static final RegistryObject<Item> ROOT_SWORD = ITEMS.register(
            "root_sword",
            () -> new SwordItem(
                    Tiers.DIAMOND,
                    new Item.Properties()
                            .attributes(SwordItem.createAttributes(
                                    Tiers.DIAMOND,
                                    5,
                                    -2.4f
                            ))
            )
    );

    public static final RegistryObject<Item> DEMON_BLOOD_SWORD = ITEMS.register(
            "demon_blood_sword",
            () -> new SwordItem(
                    Tiers.DIAMOND,
                    new Item.Properties()
                            .attributes(SwordItem.createAttributes(
                                    Tiers.DIAMOND,
                                    5,
                                    -2.4f
                            ))
            )
    );

    public static final RegistryObject<Item> GRAPE_SWORD = ITEMS.register(
            "grape_sword",
            () -> new SwordItem(
                    Tiers.GOLD,
                    new Item.Properties()
                            .attributes(SwordItem.createAttributes(
                                    Tiers.GOLD,
                                    2,
                                    -1.75f
                            ))
            )
    );

    public static final RegistryObject<Item> SWORD_4D = ITEMS.register(
            "4d_sword",
            () -> new SwordItem(
                    Tiers.DIAMOND,
                    new Item.Properties()
                            .attributes(SwordItem.createAttributes(
                                    Tiers.DIAMOND,
                                    5,
                                    -2.4f
                            ))
            )
    );

    public static final RegistryObject<Item> GRASS_SWORD = ITEMS.register(
            "grass_sword",
            () -> new SwordItem(
                    Tiers.DIAMOND,
                    new Item.Properties()
                            .attributes(SwordItem.createAttributes(
                                    Tiers.DIAMOND,
                                    2,
                                    -1.5f
                            ))
            )
    );

    public static final RegistryObject<Item> FINN_SWORD = ITEMS.register(
            "finn_sword",
            () -> new SwordItem(
                    Tiers.DIAMOND,
                    new Item.Properties()
                            .attributes(SwordItem.createAttributes(
                                    Tiers.DIAMOND,
                                    5,
                                    -2.4f
                            ))
            )
    );

    public static final RegistryObject<Item> SMALL_SWORD = ITEMS.register(
            "small_sword",
            () -> new RapierItem(
                    Tiers.DIAMOND,
                    new Item.Properties()
                            .attributes(SwordItem.createAttributes(
                                    Tiers.DIAMOND,
                                    -1,
                                    6f
                            ))
            )
    );

    public static final RegistryObject<Item> NIGHT_SWORD = ITEMS.register(
            "night_sword",
            () -> new SwordItem(
                    Tiers.DIAMOND,
                    new Item.Properties()
                            .attributes(SwordItem.createAttributes(
                                    Tiers.DIAMOND,
                                    5,
                                    -2.4f
                            ))
            )
    );

    // HAMMERS ITEMS ---------------------------------------------------------------------------------
    public static final RegistryObject<Item> MJOLNIR = ITEMS.register(
            "mjolnir",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> JARNBJORN = ITEMS.register(
            "jarnbjorn",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> MJOLNIR_PREMIUM = ITEMS.register(
            "mjolnir_premium",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> MJOLNIRON = ITEMS.register(
            "mjolniron",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> BLOODAXE = ITEMS.register(
            "bloodaxe",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> FROGJOLNIR = ITEMS.register(
            "frogjolnir",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> MJOLNIR_REPLICA = ITEMS.register(
            "mjolnir_replica",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> TARENES_HAMMER = ITEMS.register(
            "tarenes_hammer",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> LIGHTBRINGER = ITEMS.register(
            "lightbringer",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> MJOLNIR_BLACK_URU = ITEMS.register(
            "mjolnir_black_uru",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> HELLNIR = ITEMS.register(
            "hellnir",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> THUNDERSTRIKE_ERIC = ITEMS.register(
            "thunderstrike-e",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> THUNDERSTRIKE_KEVIN = ITEMS.register(
            "thunderstrike-k",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> STORMCASTER = ITEMS.register(
            "stormcaster",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> STORMBREAKER = ITEMS.register(
            "stormbreaker",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> STORMBREAKER_MCU = ITEMS.register(
            "stormbreaker_mcu",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> CRUSHER = ITEMS.register(
            "crusher",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> MJOLNIR_REFORGED = ITEMS.register(
            "mjolnir_reforged",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> MJOLNIR_REFORGED_GOLD = ITEMS.register(
            "mjolnir_reforged_gold",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> MJOLNIR_YGGDRASIL = ITEMS.register(
            "mjolnir_yggdrasil",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> MJOLNIR_ULTIMATE = ITEMS.register(
            "mjolnir_ultimate",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> THORIONS_HAMMER = ITEMS.register(
            "thorions_hammer",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> MJOLNIR_UNWORTHY = ITEMS.register(
            "mjolnir_unworthy",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> HAMMER_OF_ROK = ITEMS.register(
            "hammer_of_rok",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> HAMMER_OF_NERKKOD = ITEMS.register(
            "hammer_of_nerkkod",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> HAMMER_OF_MOKK = ITEMS.register(
            "hammer_of_mokk",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> HAMMER_OF_GREITHOTH = ITEMS.register(
            "hammer_of_greithoth",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> HAMMER_OF_KUURTH = ITEMS.register(
            "hammer_of_kuurth",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> HAMMER_OF_ANGRIR = ITEMS.register(
            "hammer_of_angrir",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> HAMMER_OF_NUL = ITEMS.register(
            "hammer_of_nul",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> HAMMER_OF_SKADI = ITEMS.register(
            "hammer_of_skadi",
            () -> new MaceItem(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> YOLGJORD = ITEMS.register(
            "yolgjord",
            () -> new Item(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> MEGINGJORD = ITEMS.register(
            "megingjord",
            () -> new Item(
                    new Item.Properties()
                            .stacksTo(1)
            )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
