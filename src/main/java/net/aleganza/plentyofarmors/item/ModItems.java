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

    // adv icon
    public static final Item ADV_ICON = registerItem("adv_icon",
            new Item(new FabricItemSettings()));

    // dragon elytra
    /*public static final Item DRAGON_ELYTRA = registerItem("dragon_elytra",
            new ElytraItem(new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));*/

    // brick set
    public static final Item BRICK_HELMET = registerItem("brick_helmet",
            new ModArmorBrick(ModArmorMaterials.BRICK, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item BRICK_CHESTPLATE = registerItem("brick_chestplate",
            new ArmorItem(ModArmorMaterials.BRICK, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item BRICK_LEGGINGS = registerItem("brick_leggings",
            new ArmorItem(ModArmorMaterials.BRICK, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item BRICK_BOOTS = registerItem("brick_boots",
            new ArmorItem(ModArmorMaterials.BRICK, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // nether brick set
    public static final Item NETHER_BRICK_HELMET = registerItem("nether_brick_helmet",
            new ModArmorNetherBrick(ModArmorMaterials.NETHER_BRICK, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item NETHER_BRICK_CHESTPLATE = registerItem("nether_brick_chestplate",
            new ArmorItem(ModArmorMaterials.NETHER_BRICK, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item NETHER_BRICK_LEGGINGS = registerItem("nether_brick_leggings",
            new ArmorItem(ModArmorMaterials.NETHER_BRICK, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item NETHER_BRICK_BOOTS = registerItem("nether_brick_boots",
            new ArmorItem(ModArmorMaterials.NETHER_BRICK, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // amethyst set
    public static final Item AMETHYST_GEM = registerItem("amethyst_gem",
            new Item(new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet",
            new ModArmorAmethyst(ModArmorMaterials.AMETHYST, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate",
            new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings",
            new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item AMETHYST_BOOTS = registerItem("amethyst_boots",
            new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // crying obsidian set
    public static final Item CRYING_OBSIDIAN_HELMET = registerItem("crying_obsidian_helmet",
            new ArmorItem(ModArmorMaterials.CRYING_OBSIDIAN, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item CRYING_OBSIDIAN_CHESTPLATE = registerItem("crying_obsidian_chestplate",
            new ArmorItem(ModArmorMaterials.CRYING_OBSIDIAN, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item CRYING_OBSIDIAN_LEGGINGS = registerItem("crying_obsidian_leggings",
            new ArmorItem(ModArmorMaterials.CRYING_OBSIDIAN, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item CRYING_OBSIDIAN_BOOTS = registerItem("crying_obsidian_boots",
            new ArmorItem(ModArmorMaterials.CRYING_OBSIDIAN, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // quartz set
    public static final Item QUARTZ_HELMET = registerItem("quartz_helmet",
            new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item QUARTZ_CHESTPLATE = registerItem("quartz_chestplate",
            new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item QUARTZ_LEGGINGS = registerItem("quartz_leggings",
            new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item QUARTZ_BOOTS = registerItem("quartz_boots",
            new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // stardusite set
    public static final Item STARDUSITE_INGOT = registerItem("stardusite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    public static final Item STARDUSITE_HELMET = registerItem("stardusite_helmet",
            new ModArmorStardusite1(ModArmorMaterials.STARDUSITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item STARDUSITE_CHESTPLATE = registerItem("stardusite_chestplate",
            new ModArmorStardusite2(ModArmorMaterials.STARDUSITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item STARDUSITE_LEGGINGS = registerItem("stardusite_leggings",
            new ArmorItem(ModArmorMaterials.STARDUSITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item STARDUSITE_BOOTS = registerItem("stardusite_boots",
            new ArmorItem(ModArmorMaterials.STARDUSITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

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

    // crimson set
    public static final Item CRIMSON_HELMET = registerItem("crimson_helmet",
            new ModArmorCrimson(ModArmorMaterials.CRIMSON, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item CRIMSON_CHESTPLATE = registerItem("crimson_chestplate",
            new ArmorItem(ModArmorMaterials.CRIMSON, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item CRIMSON_LEGGINGS = registerItem("crimson_leggings",
            new ArmorItem(ModArmorMaterials.CRIMSON, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item CRIMSON_BOOTS = registerItem("crimson_boots",
            new ArmorItem(ModArmorMaterials.CRIMSON, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // warped set
    public static final Item WARPED_HELMET = registerItem("warped_helmet",
            new ModArmorWarped(ModArmorMaterials.WARPED, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item WARPED_CHESTPLATE = registerItem("warped_chestplate",
            new ArmorItem(ModArmorMaterials.WARPED, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item WARPED_LEGGINGS = registerItem("warped_leggings",
            new ArmorItem(ModArmorMaterials.WARPED, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item WARPED_BOOTS = registerItem("warped_boots",
            new ArmorItem(ModArmorMaterials.WARPED, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // mangrove set
    public static final Item MANGROVE_HELMET = registerItem("mangrove_helmet",
            new ArmorItem(ModArmorMaterials.MANGROVE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item MANGROVE_CHESTPLATE = registerItem("mangrove_chestplate",
            new ArmorItem(ModArmorMaterials.MANGROVE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item MANGROVE_LEGGINGS = registerItem("mangrove_leggings",
            new ArmorItem(ModArmorMaterials.MANGROVE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item MANGROVE_BOOTS = registerItem("mangrove_boots",
            new ArmorItem(ModArmorMaterials.MANGROVE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // dark oak set
    public static final Item DARK_OAK_HELMET = registerItem("dark_oak_helmet",
            new ArmorItem(ModArmorMaterials.DARK_OAK, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item DARK_OAK_CHESTPLATE = registerItem("dark_oak_chestplate",
            new ArmorItem(ModArmorMaterials.DARK_OAK, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item DARK_OAK_LEGGINGS = registerItem("dark_oak_leggings",
            new ArmorItem(ModArmorMaterials.DARK_OAK, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item DARK_OAK_BOOTS = registerItem("dark_oak_boots",
            new ArmorItem(ModArmorMaterials.DARK_OAK, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // jungle set
    public static final Item JUNGLE_HELMET = registerItem("jungle_helmet",
            new ArmorItem(ModArmorMaterials.JUNGLE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item JUNGLE_CHESTPLATE = registerItem("jungle_chestplate",
            new ArmorItem(ModArmorMaterials.JUNGLE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item JUNGLE_LEGGINGS = registerItem("jungle_leggings",
            new ArmorItem(ModArmorMaterials.JUNGLE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item JUNGLE_BOOTS = registerItem("jungle_boots",
            new ArmorItem(ModArmorMaterials.JUNGLE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // birch set
    public static final Item BIRCH_HELMET = registerItem("birch_helmet",
            new ArmorItem(ModArmorMaterials.BIRCH, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item BIRCH_CHESTPLATE = registerItem("birch_chestplate",
            new ArmorItem(ModArmorMaterials.BIRCH, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item BIRCH_LEGGINGS = registerItem("birch_leggings",
            new ArmorItem(ModArmorMaterials.BIRCH, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item BIRCH_BOOTS = registerItem("birch_boots",
            new ArmorItem(ModArmorMaterials.BIRCH, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // spruce set
    public static final Item SPRUCE_HELMET = registerItem("spruce_helmet",
            new ArmorItem(ModArmorMaterials.SPRUCE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item SPRUCE_CHESTPLATE = registerItem("spruce_chestplate",
            new ArmorItem(ModArmorMaterials.SPRUCE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item SPRUCE_LEGGINGS = registerItem("spruce_leggings",
            new ArmorItem(ModArmorMaterials.SPRUCE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item SPRUCE_BOOTS = registerItem("spruce_boots",
            new ArmorItem(ModArmorMaterials.SPRUCE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // acacia set
    public static final Item ACACIA_HELMET = registerItem("acacia_helmet",
            new ArmorItem(ModArmorMaterials.ACACIA, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item ACACIA_CHESTPLATE = registerItem("acacia_chestplate",
            new ArmorItem(ModArmorMaterials.ACACIA, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item ACACIA_LEGGINGS = registerItem("acacia_leggings",
            new ArmorItem(ModArmorMaterials.ACACIA, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item ACACIA_BOOTS = registerItem("acacia_boots",
            new ArmorItem(ModArmorMaterials.ACACIA, EquipmentSlot.FEET,
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
