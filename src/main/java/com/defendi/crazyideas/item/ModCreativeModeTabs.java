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
                        pOutput.accept(ModBlocks.HOLY_CATALYST_BLOCK.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> SINFUL_TAB = CREATIVE_MODE_TABS.register(
            "sinful_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HELL_FUEL.get()))
                    .withTabsBefore(SACRED_TAB.getId())
                    .title(Component.translatable("creativetab.crazyideas.sinful_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.HELL_FUEL.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> UTILITY_TAB = CREATIVE_MODE_TABS.register(
            "utility_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.METAL_DETECTOR.get()))
                    .withTabsBefore(SINFUL_TAB.getId())
                    .title(Component.translatable("creativetab.crazyideas.utility_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModItems.CHISEL.get());
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
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
