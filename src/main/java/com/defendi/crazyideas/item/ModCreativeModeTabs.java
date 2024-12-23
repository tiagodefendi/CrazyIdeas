package com.defendi.crazyideas.item;

import com.defendi.crazyideas.CrazyIdeas;
import com.defendi.crazyideas.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CrazyIdeas.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SACRED_TAB = CREATIVE_MODE_TABS.register(
            "sacred_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HOLY_METAL.get()))
                    .title(Component.translatable("creativetab.crazyideas.sacred_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.HOLY_METAL.get());
                        pOutput.accept(ModBlocks.HOLY_METAL_BLOCK.get());

                        pOutput.accept(ModItems.ANGEL_BLADE.get());

                        pOutput.accept(ModBlocks.HOLY_CATALYST_BLOCK.get());
                        pOutput.accept(ModBlocks.HOLY_LAMP.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> SINFUL_TAB = CREATIVE_MODE_TABS.register(
            "sinful_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EVIL_METAL.get()))
                    .withTabsBefore(SACRED_TAB.getId())
                    .title(Component.translatable("creativetab.crazyideas.sinful_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.EVIL_METAL.get());
                        pOutput.accept(ModBlocks.EVIL_METAL_BLOCK.get());

                        pOutput.accept(ModItems.DEMON_KILLING_KNIFE.get());
                        pOutput.accept(ModItems.EVIL_METAL_HAMMER.get());

                        pOutput.accept(ModItems.HELL_FUEL.get());
                    })
                    .build()

    );public static final RegistryObject<CreativeModeTab> DEATH_TAB = CREATIVE_MODE_TABS.register(
            "death_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DEATH_SCYTHE.get()))
                    .withTabsBefore(SINFUL_TAB.getId())
                    .title(Component.translatable("creativetab.crazyideas.death_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DEATH_SCYTHE.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> UTILITY_TAB = CREATIVE_MODE_TABS.register(
            "utility_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.METAL_DETECTOR.get()))
                    .withTabsBefore(DEATH_TAB.getId())
                    .title(Component.translatable("creativetab.crazyideas.utility_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.METAL_DETECTOR.get());

                        pOutput.accept(ModItems.CHISEL.get());

                        pOutput.accept(ModItems.EMERALD_HELMET.get());
                        pOutput.accept(ModItems.EMERALD_CHESTPLATE.get());
                        pOutput.accept(ModItems.EMERALD_LEGGINGS.get());
                        pOutput.accept(ModItems.EMERALD_BOOTS.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> JAPAN_TAB = CREATIVE_MODE_TABS.register(
            "japan_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SENZU_BEAN.get()))
                    .withTabsBefore(UTILITY_TAB.getId())
                    .title(Component.translatable("creativetab.crazyideas.japan_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SENZU_BEAN.get());
                        pOutput.accept(ModItems.KATANA.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ADVENTURE_TIME_TAB = CREATIVE_MODE_TABS.register(
            "adventure_time_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCARLET.get()))
                    .withTabsBefore(JAPAN_TAB.getId())
                    .title(Component.translatable("creativetab.crazyideas.adventure_time_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SCARLET.get());
                        pOutput.accept(ModItems.ROOT_SWORD.get());
                        pOutput.accept(ModItems.DEMON_BLOOD_SWORD.get());
                        pOutput.accept(ModItems.GRAPE_SWORD.get());
                        pOutput.accept(ModItems.SWORD_4D.get());
                        pOutput.accept(ModItems.GRASS_SWORD.get());
                        pOutput.accept(ModItems.FINN_SWORD.get());
                        pOutput.accept(ModItems.SMALL_SWORD.get());
                        pOutput.accept(ModItems.NIGHT_SWORD.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> HAMMERS_TAB = CREATIVE_MODE_TABS.register(
            "hammers_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MJOLNIR.get()))
                    .withTabsBefore(ADVENTURE_TIME_TAB.getId())
                    .title(Component.translatable("creativetab.crazyideas.hammers_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MJOLNIR.get());
                        pOutput.accept(ModItems.JARNBJORN.get());
                        pOutput.accept(ModItems.MJOLNIR_PREMIUM.get());
                        pOutput.accept(ModItems.MJOLNIRON.get());
                        pOutput.accept(ModItems.BLOODAXE.get());
                        pOutput.accept(ModItems.FROGJOLNIR.get());
                        pOutput.accept(ModItems.MJOLNIR_REPLICA.get());
                        pOutput.accept(ModItems.TARENES_HAMMER.get());
                        pOutput.accept(ModItems.LIGHTBRINGER.get());
                        pOutput.accept(ModItems.MJOLNIR_BLACK_URU.get());
                        pOutput.accept(ModItems.HELLNIR.get());
                        pOutput.accept(ModItems.THUNDERSTRIKE_ERIC.get());
                        pOutput.accept(ModItems.THUNDERSTRIKE_KEVIN.get());
                        pOutput.accept(ModItems.STORMCASTER.get());
                        pOutput.accept(ModItems.STORMBREAKER.get());
                        pOutput.accept(ModItems.STORMBREAKER_MCU.get());
                        pOutput.accept(ModItems.CRUSHER.get());
                        pOutput.accept(ModItems.MJOLNIR_REFORGED.get());
                        pOutput.accept(ModItems.MJOLNIR_REFORGED_GOLD.get());
                        pOutput.accept(ModItems.MJOLNIR_YGGDRASIL.get());
                        pOutput.accept(ModItems.MJOLNIR_ULTIMATE.get());
                        pOutput.accept(ModItems.THORIONS_HAMMER.get());
                        pOutput.accept(ModItems.MJOLNIR_UNWORTHY.get());
                        pOutput.accept(ModItems.HAMMER_OF_ROK.get());
                        pOutput.accept(ModItems.HAMMER_OF_NERKKOD.get());
                        pOutput.accept(ModItems.HAMMER_OF_MOKK.get());
                        pOutput.accept(ModItems.HAMMER_OF_GREITHOTH.get());
                        pOutput.accept(ModItems.HAMMER_OF_KUURTH.get());
                        pOutput.accept(ModItems.HAMMER_OF_ANGRIR.get());
                        pOutput.accept(ModItems.HAMMER_OF_NUL.get());
                        pOutput.accept(ModItems.HAMMER_OF_SKADI.get());
                        pOutput.accept(ModItems.YOLGJORD.get());
                        pOutput.accept(ModItems.MEGINGJORD.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
