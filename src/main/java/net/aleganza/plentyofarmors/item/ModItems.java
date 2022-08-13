package net.aleganza.plentyofarmors.item;

import net.aleganza.plentyofarmors.PlentyOfArmors;
import net.aleganza.plentyofarmors.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // ---+ ITEMS +---

    // dragon elytra
    public static final Item DRAGON_ELYTRA = registerItem("dragon_elytra",
            new ElytraItem(new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // cactus set
    public static final Item CACTUS_HELMET = registerItem("cactus_helmet",
            new ModArmorCactus(ModArmorMaterials.CACTUS, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item CACTUS_CHESTPLATE = registerItem("cactus_chestplate",
            new ArmorItem(ModArmorMaterials.CACTUS, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item CACTUS_LEGGINGS = registerItem("cactus_leggings",
            new ArmorItem(ModArmorMaterials.CACTUS, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item CACTUS_BOOTS = registerItem("cactus_boots",
            new ArmorItem(ModArmorMaterials.CACTUS, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // oak set
    public static final Item OAK_HELMET = registerItem("oak_helmet",
            new ArmorItem(ModArmorMaterials.OAK, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item OAK_CHESTPLATE = registerItem("oak_chestplate",
            new ArmorItem(ModArmorMaterials.OAK, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item OAK_LEGGINGS = registerItem("oak_leggings",
            new ArmorItem(ModArmorMaterials.OAK, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item OAK_BOOTS = registerItem("oak_boots",
            new ArmorItem(ModArmorMaterials.OAK, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // slime set
    public static final Item SLIME_HELMET = registerItem("slime_helmet",
            new ArmorItem(ModArmorMaterials.SLIME, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item SLIME_CHESTPLATE = registerItem("slime_chestplate",
            new ArmorItem(ModArmorMaterials.SLIME, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item SLIME_LEGGINGS = registerItem("slime_leggings",
            new ArmorItem(ModArmorMaterials.SLIME, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item SLIME_BOOTS = registerItem("slime_boots",
            new ArmorItem(ModArmorMaterials.SLIME, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // obsidian set
    public static final Item OBSIDIAN_HELMET = registerItem("obsidian_helmet",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item OBSIDIAN_CHESTPLATE = registerItem("obsidian_chestplate",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item OBSIDIAN_LEGGINGS = registerItem("obsidian_leggings",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item OBSIDIAN_BOOTS = registerItem("obsidian_boots",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // lapis set
    public static final Item LAPIS_HELMET = registerItem("lapis_helmet",
            new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item LAPIS_CHESTPLATE = registerItem("lapis_chestplate",
            new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item LAPIS_LEGGINGS = registerItem("lapis_leggings",
            new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item LAPIS_BOOTS = registerItem("lapis_boots",
            new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // redstone set
    public static final Item REDSTONE_MIXTURE = registerItem("redstone_mixture",
            new Item(new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    public static final Item REDSTONE_HELMET = registerItem("redstone_helmet",
            new ArmorItem(ModArmorMaterials.REDSTONE_MIXTURE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item REDSTONE_CHESTPLATE = registerItem("redstone_chestplate",
            new ArmorItem(ModArmorMaterials.REDSTONE_MIXTURE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item REDSTONE_LEGGINGS = registerItem("redstone_leggings",
            new ArmorItem(ModArmorMaterials.REDSTONE_MIXTURE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item REDSTONE_BOOTS = registerItem("redstone_boots",
            new ArmorItem(ModArmorMaterials.REDSTONE_MIXTURE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // hardened ice set
    public static final Item ICE_SHARD = registerItem("ice_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item HARDENED_ICE_SHARD = registerItem("hardened_ice_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    public static final Item HARDENED_ICE_HELMET = registerItem("hardened_ice_helmet",
            new ModArmorHardenedIce(ModArmorMaterials.HARDENED_ICE_SHARD, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item HARDENED_ICE_CHESTPLATE = registerItem("hardened_ice_chestplate",
            new ArmorItem(ModArmorMaterials.HARDENED_ICE_SHARD, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item HARDENED_ICE_LEGGINGS = registerItem("hardened_ice_leggings",
            new ArmorItem(ModArmorMaterials.HARDENED_ICE_SHARD, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item HARDENED_ICE_BOOTS = registerItem("hardened_ice_boots",
            new ArmorItem(ModArmorMaterials.HARDENED_ICE_SHARD, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // copper set
    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // ender set
    public static final Item HEART_OF_THE_END = registerItem("heart_of_the_end",
            new Item(new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    public static final Item ENDER_HELMET = registerItem("ender_helmet",
            new ModArmorEnder(ModArmorMaterials.HEART_OF_THE_END, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item ENDER_CHESTPLATE = registerItem("ender_chestplate",
            new ArmorItem(ModArmorMaterials.HEART_OF_THE_END, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item ENDER_LEGGINGS = registerItem("ender_leggings",
            new ArmorItem(ModArmorMaterials.HEART_OF_THE_END, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item ENDER_BOOTS = registerItem("ender_boots",
            new ArmorItem(ModArmorMaterials.HEART_OF_THE_END, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // marine set
    public static final Item MARINE_DIAMOND = registerItem("marine_diamond",
            new Item(new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    public static final Item MARINE_DIAMOND_HELMET = registerItem("marine_diamond_helmet",
            new ModArmorMarineDiamond(ModArmorMaterials.MARINE_DIAMOND, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item MARINE_DIAMOND_CHESTPLATE = registerItem("marine_diamond_chestplate",
            new ArmorItem(ModArmorMaterials.MARINE_DIAMOND, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item MARINE_DIAMOND_LEGGINGS = registerItem("marine_diamond_leggings",
            new ArmorItem(ModArmorMaterials.MARINE_DIAMOND, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item MARINE_DIAMOND_BOOTS = registerItem("marine_diamond_boots",
            new ArmorItem(ModArmorMaterials.MARINE_DIAMOND, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    // emerald set
    public static final Item EMERALD_HELMET = registerItem("emerald_helmet",
            new ModArmorEmerald(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // ---+ ITEMS REGISTRATION +---
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PlentyOfArmors.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PlentyOfArmors.LOGGER.info("Registering Mod items for" + PlentyOfArmors.MOD_ID);
    }
}
