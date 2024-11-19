package com.defendi.crazyideas.block;

import com.defendi.crazyideas.CrazyIdeas;
import com.defendi.crazyideas.block.sacred.HolyCatalystBlock;
import com.defendi.crazyideas.block.sacred.HolyLampBlock;
import com.defendi.crazyideas.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CrazyIdeas.MOD_ID);

    // SACRED BLOCK ---------------------------------------------------------------------------
    public static RegistryObject<Block> HOLY_METAL_BLOCK = registryBlock(
            "holy_metal_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .sound(SoundType.METAL)
                    .instrument(NoteBlockInstrument.HARP)
                    .requiresCorrectToolForDrops()
                    .strength(8.0F, 6.0F)
            )
    );

    public static RegistryObject<Block> HOLY_CATALYST_BLOCK = registryBlock(
            "holy_catalyst_block",
            () -> new HolyCatalystBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .sound(SoundType.AMETHYST)
                    .strength(1.0f, 0.0f)
            )
    );

    public static RegistryObject<Block> HOLY_LAMP = registryBlock(
            "holy_lamp",
            () -> new HolyLampBlock(BlockBehaviour.Properties.of()
                    .lightLevel(
                            state -> state.getValue(HolyLampBlock.CLICKED)? 15 : 0
                    )
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .sound(SoundType.LANTERN)
                    .strength(1.0f, 0.0f)
            )
    );

    // SINFUL BLOCK ---------------------------------------------------------------------------
    public static RegistryObject<Block> EVIL_METAL_BLOCK = registryBlock(
            "evil_metal_block",
        () -> new Block(BlockBehaviour.Properties.of()
                .mapColor(MapColor.NETHER)
                .sound(SoundType.METAL)
                .instrument(NoteBlockInstrument.GUITAR)
                .requiresCorrectToolForDrops()
                .strength(8.0f, 6.0f)
        )
    );

    private static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
