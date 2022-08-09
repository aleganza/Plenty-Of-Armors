package net.aleganza.plentyofarmor.item;

import net.aleganza.plentyofarmor.PlentyOfArmor;
import net.aleganza.plentyofarmor.item.custom.ModArmorEmerald;
import net.aleganza.plentyofarmor.item.custom.ModArmorEnder;
import net.aleganza.plentyofarmor.item.custom.ModArmorMarineDiamond;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // ---+ ITEMS +---

    // redstone set
    public static final Item REDSTONE_MIXTURE = registerItem("redstone_mixture",
            new Item(new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    public static final Item REDSTONE_HELMET = registerItem("redstone_helmet",
            new ModArmorEnder(ModArmorMaterials.HARDENED_ICE_SHARD, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item REDSTONE_CHESTPLATE = registerItem("redstone_chestplate",
            new ArmorItem(ModArmorMaterials.HARDENED_ICE_SHARD, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item REDSTONE_LEGGINGS = registerItem("redstone_leggings",
            new ArmorItem(ModArmorMaterials.HARDENED_ICE_SHARD, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item REDSTONE_BOOTS = registerItem("redstone_boots",
            new ArmorItem(ModArmorMaterials.HARDENED_ICE_SHARD, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // hardened ice set
    public static final Item ICE_SHARD = registerItem("ice_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item HARDENED_ICE_SHARD = registerItem("hardened_ice_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    public static final Item HARDENED_ICE_HELMET = registerItem("hardened_ice_helmet",
            new ModArmorEnder(ModArmorMaterials.HARDENED_ICE_SHARD, EquipmentSlot.HEAD,
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
            new ModArmorEnder(ModArmorMaterials.COPPER, EquipmentSlot.HEAD,
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
        return Registry.register(Registry.ITEM, new Identifier(PlentyOfArmor.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PlentyOfArmor.LOGGER.info("Registering Mod items for" + PlentyOfArmor.MOD_ID);
    }
}
