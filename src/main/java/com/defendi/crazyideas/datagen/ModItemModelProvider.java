package com.defendi.crazyideas.datagen;

import com.defendi.crazyideas.CrazyIdeas;
import com.defendi.crazyideas.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1f);
        trimMaterials.put(TrimMaterials.IRON, 0.2f);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3f);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4f);
        trimMaterials.put(TrimMaterials.COPPER, 0.5f);
        trimMaterials.put(TrimMaterials.GOLD, 0.6f);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7f);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8f);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9f);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0f);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CrazyIdeas.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.HOLY_METAL.get());
        handheldItem(ModItems.ANGEL_BLADE);

        basicItem(ModItems.EVIL_METAL.get());
        handheldItem(ModItems.EVIL_METAL_HAMMER);
        handheldItem(ModItems.DEMON_KILLING_KNIFE);
        basicItem(ModItems.HELL_FUEL.get());

        handheldItem(ModItems.DEATH_SCYTHE);

        basicItem(ModItems.METAL_DETECTOR.get());
        basicItem(ModItems.CHISEL.get());
        trimmedArmorItem(ModItems.EMERALD_HELMET);
        trimmedArmorItem(ModItems.EMERALD_CHESTPLATE);
        trimmedArmorItem(ModItems.EMERALD_LEGGINGS);
        trimmedArmorItem(ModItems.EMERALD_BOOTS);

        basicItem(ModItems.SENZU_BEAN.get());
        handheldItem(ModItems.KATANA);

        handheldItem(ModItems.SCARLET);
        handheldItem(ModItems.ROOT_SWORD);
        handheldItem(ModItems.DEMON_BLOOD_SWORD);
        handheldItem(ModItems.GRAPE_SWORD);
        handheldItem(ModItems.SWORD_4D);
        handheldItem(ModItems.GRASS_SWORD);
        handheldItem(ModItems.FINN_SWORD);
        handheldItem(ModItems.SMALL_SWORD);
        handheldItem(ModItems.NIGHT_SWORD);

        handheldItem(ModItems.MJOLNIR);
        handheldItem(ModItems.JARNBJORN);
        handheldItem(ModItems.MJOLNIR_PREMIUM);
        handheldItem(ModItems.MJOLNIRON);
        handheldItem(ModItems.BLOODAXE);
        handheldItem(ModItems.FROGJOLNIR);
        handheldItem(ModItems.MJOLNIR_REPLICA);
        handheldItem(ModItems.TARENES_HAMMER);
        handheldItem(ModItems.LIGHTBRINGER);
        handheldItem(ModItems.MJOLNIR_BLACK_URU);
        handheldItem(ModItems.HELLNIR);
        handheldItem(ModItems.THUNDERSTRIKE_ERIC);
        handheldItem(ModItems.THUNDERSTRIKE_KEVIN);
        handheldItem(ModItems.STORMCASTER);
        handheldItem(ModItems.STORMBREAKER);
        handheldItem(ModItems.STORMBREAKER_MCU);
        handheldItem(ModItems.CRUSHER);
        handheldItem(ModItems.MJOLNIR_REFORGED);
        handheldItem(ModItems.MJOLNIR_REFORGED_GOLD);
        handheldItem(ModItems.MJOLNIR_YGGDRASIL);
        handheldItem(ModItems.MJOLNIR_ULTIMATE);
        handheldItem(ModItems.THORIONS_HAMMER);
        handheldItem(ModItems.MJOLNIR_UNWORTHY);
        handheldItem(ModItems.HAMMER_OF_ROK);
        handheldItem(ModItems.HAMMER_OF_NERKKOD);
        handheldItem(ModItems.HAMMER_OF_MOKK);
        handheldItem(ModItems.HAMMER_OF_GREITHOTH);
        handheldItem(ModItems.HAMMER_OF_KUURTH);
        handheldItem(ModItems.HAMMER_OF_ANGRIR);
        handheldItem(ModItems.HAMMER_OF_NUL);
        handheldItem(ModItems.HAMMER_OF_SKADI);
        handheldItem(ModItems.YOLGJORD);
        handheldItem(ModItems.MEGINGJORD);
    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = CrazyIdeas.MOD_ID;

        if (itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                    float trimValue = value;

                    String armorType = switch (armorItem.getEquipmentSlot()) {
                        case HEAD -> "helmet";
                        case CHEST -> "chestplate";
                        case LEGS -> "leggings";
                        case FEET -> "boots";
                        default -> "";
                    };

                    String armorItemPath = armorItem.toString();
                    String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                    String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";

                    ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                    ResourceLocation trimResLoc = ResourceLocation.parse(trimPath);
                    ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                    existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                    getBuilder(currentTrimName)
                            .parent(new ModelFile.UncheckedModelFile("item/generated"))
                            .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                            .texture("layer1", trimResLoc);

                    this.withExistingParent(itemRegistryObject.getId().getPath(), mcLoc("item/generated"))
                            .override()
                            .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace() + ":item/" + trimNameResLoc.getPath()))
                            .predicate(mcLoc("trim_type"), trimValue).end()
                            .texture(
                                    "layer0",
                                    ResourceLocation.fromNamespaceAndPath(
                                            MOD_ID,
                                            "item/" + itemRegistryObject.getId().getPath()
                                    )
                            );
                }
            );
        }
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(
                item.getId().getPath(),
                ResourceLocation.parse("item/handheld")
        )
                .texture(
                        "layer0",
                        ResourceLocation.fromNamespaceAndPath(
                                CrazyIdeas.MOD_ID,
                                "item/" + item.getId().getPath()
                        )
                );
    }
}
