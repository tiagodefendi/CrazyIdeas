package com.defendi.crazyideas.item;

import com.defendi.crazyideas.CrazyIdeas;
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
                    .title(Component.translatable("creativetab.sacred_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.HOLY_METAL.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
