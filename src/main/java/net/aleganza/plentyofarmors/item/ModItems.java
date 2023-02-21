package net.aleganza.plentyofarmors.item;

import net.aleganza.plentyofarmors.PlentyOfArmors;
import net.aleganza.plentyofarmors.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // ---+ ITEMS +---

    // adv icon
    public static final Item ADV_ICON = registerItem("adv_icon",
            new Item(new FabricItemSettings()));

    // phantom set
    public static final Item PHANTOM_HELMET = registerItem("phantom_helmet",
            new ModArmorPhantom(ModArmorMaterials.PHANTOM, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item PHANTOM_CHESTPLATE = registerItem("phantom_chestplate",
            new ArmorItem(ModArmorMaterials.PHANTOM, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item PHANTOM_LEGGINGS = registerItem("phantom_leggings",
            new ArmorItem(ModArmorMaterials.PHANTOM, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item PHANTOM_BOOTS = registerItem("phantom_boots",
            new ArmorItem(ModArmorMaterials.PHANTOM, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // reinforced iron set
    public static final Item REINFORCED_IRON_HELMET = registerItem("reinforced_iron_helmet",
            new ModArmorReinforcedIron(ModArmorMaterials.REINFORCED_IRON, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item REINFORCED_IRON_CHESTPLATE = registerItem("reinforced_iron_chestplate",
            new ArmorItem(ModArmorMaterials.REINFORCED_IRON, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item REINFORCED_IRON_LEGGINGS = registerItem("reinforced_iron_leggings",
            new ArmorItem(ModArmorMaterials.REINFORCED_IRON, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item REINFORCED_IRON_BOOTS = registerItem("reinforced_iron_boots",
            new ArmorItem(ModArmorMaterials.REINFORCED_IRON, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // echo shard set
    public static final Item ECHO_SHARD_HELMET = registerItem("echo_shard_helmet",
            new ArmorItem(ModArmorMaterials.ECHO_SHARD, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    /* public static final Item ECHO_SHARD_HELMET = registerItem("echo_shard_helmet",
            new ModArmorEchoShard(ModArmorMaterials.ECHO_SHARD, EquipmentSlot.HEAD,
                    new FabricItemSettings()));*/
    public static final Item ECHO_SHARD_CHESTPLATE = registerItem("echo_shard_chestplate",
            new ArmorItem(ModArmorMaterials.ECHO_SHARD, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item ECHO_SHARD_LEGGINGS = registerItem("echo_shard_leggings",
            new ArmorItem(ModArmorMaterials.ECHO_SHARD, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item ECHO_SHARD_BOOTS = registerItem("echo_shard_boots",
            new ArmorItem(ModArmorMaterials.ECHO_SHARD, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // brick set
    public static final Item BRICK_HELMET = registerItem("brick_helmet",
            new ModArmorBrick(ModArmorMaterials.BRICK, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item BRICK_CHESTPLATE = registerItem("brick_chestplate",
            new ArmorItem(ModArmorMaterials.BRICK, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item BRICK_LEGGINGS = registerItem("brick_leggings",
            new ArmorItem(ModArmorMaterials.BRICK, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item BRICK_BOOTS = registerItem("brick_boots",
            new ArmorItem(ModArmorMaterials.BRICK, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // nether brick set
    public static final Item NETHER_BRICK_HELMET = registerItem("nether_brick_helmet",
            new ModArmorNetherBrick(ModArmorMaterials.NETHER_BRICK, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item NETHER_BRICK_CHESTPLATE = registerItem("nether_brick_chestplate",
            new ArmorItem(ModArmorMaterials.NETHER_BRICK, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item NETHER_BRICK_LEGGINGS = registerItem("nether_brick_leggings",
            new ArmorItem(ModArmorMaterials.NETHER_BRICK, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item NETHER_BRICK_BOOTS = registerItem("nether_brick_boots",
            new ArmorItem(ModArmorMaterials.NETHER_BRICK, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // amethyst set
    public static final Item AMETHYST_GEM = registerItem("amethyst_gem",
            new Item(new FabricItemSettings()));

    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet",
            new ModArmorAmethyst(ModArmorMaterials.AMETHYST, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate",
            new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings",
            new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item AMETHYST_BOOTS = registerItem("amethyst_boots",
            new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // crying obsidian set
    public static final Item CRYING_OBSIDIAN_HELMET = registerItem("crying_obsidian_helmet",
            new ArmorItem(ModArmorMaterials.CRYING_OBSIDIAN, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item CRYING_OBSIDIAN_CHESTPLATE = registerItem("crying_obsidian_chestplate",
            new ArmorItem(ModArmorMaterials.CRYING_OBSIDIAN, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item CRYING_OBSIDIAN_LEGGINGS = registerItem("crying_obsidian_leggings",
            new ArmorItem(ModArmorMaterials.CRYING_OBSIDIAN, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item CRYING_OBSIDIAN_BOOTS = registerItem("crying_obsidian_boots",
            new ArmorItem(ModArmorMaterials.CRYING_OBSIDIAN, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // quartz set
    public static final Item QUARTZ_HELMET = registerItem("quartz_helmet",
            new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item QUARTZ_CHESTPLATE = registerItem("quartz_chestplate",
            new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item QUARTZ_LEGGINGS = registerItem("quartz_leggings",
            new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item QUARTZ_BOOTS = registerItem("quartz_boots",
            new ArmorItem(ModArmorMaterials.QUARTZ, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // stardusite set
    public static final Item STARDUSITE_INGOT = registerItem("stardusite_ingot",
            new Item(new FabricItemSettings()));

    public static final Item STARDUSITE_HELMET = registerItem("stardusite_helmet",
            new ModArmorStardusite1(ModArmorMaterials.STARDUSITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item STARDUSITE_CHESTPLATE = registerItem("stardusite_chestplate",
            new ModArmorStardusite2(ModArmorMaterials.STARDUSITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item STARDUSITE_LEGGINGS = registerItem("stardusite_leggings",
            new ArmorItem(ModArmorMaterials.STARDUSITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item STARDUSITE_BOOTS = registerItem("stardusite_boots",
            new ArmorItem(ModArmorMaterials.STARDUSITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // cactus set
    public static final Item CACTUS_HELMET = registerItem("cactus_helmet",
            new ModArmorCactus(ModArmorMaterials.CACTUS, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item CACTUS_CHESTPLATE = registerItem("cactus_chestplate",
            new ArmorItem(ModArmorMaterials.CACTUS, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item CACTUS_LEGGINGS = registerItem("cactus_leggings",
            new ArmorItem(ModArmorMaterials.CACTUS, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item CACTUS_BOOTS = registerItem("cactus_boots",
            new ArmorItem(ModArmorMaterials.CACTUS, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // crimson set
    public static final Item CRIMSON_HELMET = registerItem("crimson_helmet",
            new ModArmorCrimson(ModArmorMaterials.CRIMSON, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item CRIMSON_CHESTPLATE = registerItem("crimson_chestplate",
            new ArmorItem(ModArmorMaterials.CRIMSON, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item CRIMSON_LEGGINGS = registerItem("crimson_leggings",
            new ArmorItem(ModArmorMaterials.CRIMSON, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item CRIMSON_BOOTS = registerItem("crimson_boots",
            new ArmorItem(ModArmorMaterials.CRIMSON, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // warped set
    public static final Item WARPED_HELMET = registerItem("warped_helmet",
            new ModArmorWarped(ModArmorMaterials.WARPED, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item WARPED_CHESTPLATE = registerItem("warped_chestplate",
            new ArmorItem(ModArmorMaterials.WARPED, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item WARPED_LEGGINGS = registerItem("warped_leggings",
            new ArmorItem(ModArmorMaterials.WARPED, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item WARPED_BOOTS = registerItem("warped_boots",
            new ArmorItem(ModArmorMaterials.WARPED, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // mangrove set
    public static final Item MANGROVE_HELMET = registerItem("mangrove_helmet",
            new ArmorItem(ModArmorMaterials.MANGROVE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item MANGROVE_CHESTPLATE = registerItem("mangrove_chestplate",
            new ArmorItem(ModArmorMaterials.MANGROVE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item MANGROVE_LEGGINGS = registerItem("mangrove_leggings",
            new ArmorItem(ModArmorMaterials.MANGROVE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item MANGROVE_BOOTS = registerItem("mangrove_boots",
            new ArmorItem(ModArmorMaterials.MANGROVE, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // dark oak set
    public static final Item DARK_OAK_HELMET = registerItem("dark_oak_helmet",
            new ArmorItem(ModArmorMaterials.DARK_OAK, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item DARK_OAK_CHESTPLATE = registerItem("dark_oak_chestplate",
            new ArmorItem(ModArmorMaterials.DARK_OAK, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item DARK_OAK_LEGGINGS = registerItem("dark_oak_leggings",
            new ArmorItem(ModArmorMaterials.DARK_OAK, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item DARK_OAK_BOOTS = registerItem("dark_oak_boots",
            new ArmorItem(ModArmorMaterials.DARK_OAK, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // jungle set
    public static final Item JUNGLE_HELMET = registerItem("jungle_helmet",
            new ArmorItem(ModArmorMaterials.JUNGLE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item JUNGLE_CHESTPLATE = registerItem("jungle_chestplate",
            new ArmorItem(ModArmorMaterials.JUNGLE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item JUNGLE_LEGGINGS = registerItem("jungle_leggings",
            new ArmorItem(ModArmorMaterials.JUNGLE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item JUNGLE_BOOTS = registerItem("jungle_boots",
            new ArmorItem(ModArmorMaterials.JUNGLE, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // birch set
    public static final Item BIRCH_HELMET = registerItem("birch_helmet",
            new ArmorItem(ModArmorMaterials.BIRCH, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item BIRCH_CHESTPLATE = registerItem("birch_chestplate",
            new ArmorItem(ModArmorMaterials.BIRCH, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item BIRCH_LEGGINGS = registerItem("birch_leggings",
            new ArmorItem(ModArmorMaterials.BIRCH, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item BIRCH_BOOTS = registerItem("birch_boots",
            new ArmorItem(ModArmorMaterials.BIRCH, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // spruce set
    public static final Item SPRUCE_HELMET = registerItem("spruce_helmet",
            new ArmorItem(ModArmorMaterials.SPRUCE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item SPRUCE_CHESTPLATE = registerItem("spruce_chestplate",
            new ArmorItem(ModArmorMaterials.SPRUCE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item SPRUCE_LEGGINGS = registerItem("spruce_leggings",
            new ArmorItem(ModArmorMaterials.SPRUCE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item SPRUCE_BOOTS = registerItem("spruce_boots",
            new ArmorItem(ModArmorMaterials.SPRUCE, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // acacia set
    public static final Item ACACIA_HELMET = registerItem("acacia_helmet",
            new ArmorItem(ModArmorMaterials.ACACIA, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item ACACIA_CHESTPLATE = registerItem("acacia_chestplate",
            new ArmorItem(ModArmorMaterials.ACACIA, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item ACACIA_LEGGINGS = registerItem("acacia_leggings",
            new ArmorItem(ModArmorMaterials.ACACIA, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item ACACIA_BOOTS = registerItem("acacia_boots",
            new ArmorItem(ModArmorMaterials.ACACIA, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // oak set
    public static final Item OAK_HELMET = registerItem("oak_helmet",
            new ArmorItem(ModArmorMaterials.OAK, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item OAK_CHESTPLATE = registerItem("oak_chestplate",
            new ArmorItem(ModArmorMaterials.OAK, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item OAK_LEGGINGS = registerItem("oak_leggings",
            new ArmorItem(ModArmorMaterials.OAK, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item OAK_BOOTS = registerItem("oak_boots",
            new ArmorItem(ModArmorMaterials.OAK, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // slime set
    public static final Item SLIME_HELMET = registerItem("slime_helmet",
            new ArmorItem(ModArmorMaterials.SLIME, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item SLIME_CHESTPLATE = registerItem("slime_chestplate",
            new ArmorItem(ModArmorMaterials.SLIME, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item SLIME_LEGGINGS = registerItem("slime_leggings",
            new ArmorItem(ModArmorMaterials.SLIME, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item SLIME_BOOTS = registerItem("slime_boots",
            new ArmorItem(ModArmorMaterials.SLIME, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // obsidian set
    public static final Item OBSIDIAN_HELMET = registerItem("obsidian_helmet",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item OBSIDIAN_CHESTPLATE = registerItem("obsidian_chestplate",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item OBSIDIAN_LEGGINGS = registerItem("obsidian_leggings",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item OBSIDIAN_BOOTS = registerItem("obsidian_boots",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // lapis set
    public static final Item LAPIS_HELMET = registerItem("lapis_helmet",
            new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item LAPIS_CHESTPLATE = registerItem("lapis_chestplate",
            new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item LAPIS_LEGGINGS = registerItem("lapis_leggings",
            new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item LAPIS_BOOTS = registerItem("lapis_boots",
            new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // redstone set
    public static final Item REDSTONE_MIXTURE = registerItem("redstone_mixture",
            new Item(new FabricItemSettings()));

    public static final Item REDSTONE_HELMET = registerItem("redstone_helmet",
            new ArmorItem(ModArmorMaterials.REDSTONE_MIXTURE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item REDSTONE_CHESTPLATE = registerItem("redstone_chestplate",
            new ArmorItem(ModArmorMaterials.REDSTONE_MIXTURE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item REDSTONE_LEGGINGS = registerItem("redstone_leggings",
            new ArmorItem(ModArmorMaterials.REDSTONE_MIXTURE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item REDSTONE_BOOTS = registerItem("redstone_boots",
            new ArmorItem(ModArmorMaterials.REDSTONE_MIXTURE, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // hardened ice set
    public static final Item ICE_SHARD = registerItem("ice_shard",
            new Item(new FabricItemSettings()));
    public static final Item HARDENED_ICE_SHARD = registerItem("hardened_ice_shard",
            new Item(new FabricItemSettings()));

    public static final Item HARDENED_ICE_HELMET = registerItem("hardened_ice_helmet",
            new ModArmorHardenedIce(ModArmorMaterials.HARDENED_ICE_SHARD, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item HARDENED_ICE_CHESTPLATE = registerItem("hardened_ice_chestplate",
            new ArmorItem(ModArmorMaterials.HARDENED_ICE_SHARD, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item HARDENED_ICE_LEGGINGS = registerItem("hardened_ice_leggings",
            new ArmorItem(ModArmorMaterials.HARDENED_ICE_SHARD, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item HARDENED_ICE_BOOTS = registerItem("hardened_ice_boots",
            new ArmorItem(ModArmorMaterials.HARDENED_ICE_SHARD, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // copper set
    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // ender set
    public static final Item HEART_OF_THE_END = registerItem("heart_of_the_end",
            new Item(new FabricItemSettings()));

    public static final Item ENDER_HELMET = registerItem("ender_helmet",
            new ModArmorEnder(ModArmorMaterials.HEART_OF_THE_END, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item ENDER_CHESTPLATE = registerItem("ender_chestplate",
            new ArmorItem(ModArmorMaterials.HEART_OF_THE_END, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item ENDER_LEGGINGS = registerItem("ender_leggings",
            new ArmorItem(ModArmorMaterials.HEART_OF_THE_END, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item ENDER_BOOTS = registerItem("ender_boots",
            new ArmorItem(ModArmorMaterials.HEART_OF_THE_END, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // marine set
    public static final Item MARINE_DIAMOND = registerItem("marine_diamond",
            new Item(new FabricItemSettings()));

    public static final Item MARINE_DIAMOND_HELMET = registerItem("marine_diamond_helmet",
            new ModArmorMarineDiamond(ModArmorMaterials.MARINE_DIAMOND, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item MARINE_DIAMOND_CHESTPLATE = registerItem("marine_diamond_chestplate",
            new ArmorItem(ModArmorMaterials.MARINE_DIAMOND, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item MARINE_DIAMOND_LEGGINGS = registerItem("marine_diamond_leggings",
            new ArmorItem(ModArmorMaterials.MARINE_DIAMOND, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item MARINE_DIAMOND_BOOTS = registerItem("marine_diamond_boots",
            new ArmorItem(ModArmorMaterials.MARINE_DIAMOND, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    // emerald set
    public static final Item EMERALD_HELMET = registerItem("emerald_helmet",
            new ModArmorEmerald(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.FEET,
                    new FabricItemSettings()));

    // ---+ ITEMS REGISTRATION +---
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PlentyOfArmors.MOD_ID, name), item);
    }

    // 1.19.3
    public static void addItemsToItemsGroup() {
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, PHANTOM_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, PHANTOM_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, PHANTOM_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, PHANTOM_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, REINFORCED_IRON_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, REINFORCED_IRON_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, REINFORCED_IRON_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, REINFORCED_IRON_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ECHO_SHARD_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ECHO_SHARD_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ECHO_SHARD_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ECHO_SHARD_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, BRICK_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, BRICK_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, BRICK_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, BRICK_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, NETHER_BRICK_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, NETHER_BRICK_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, NETHER_BRICK_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, NETHER_BRICK_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, AMETHYST_GEM);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, AMETHYST_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, AMETHYST_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, AMETHYST_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, AMETHYST_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CRYING_OBSIDIAN_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CRYING_OBSIDIAN_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CRYING_OBSIDIAN_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CRYING_OBSIDIAN_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, QUARTZ_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, QUARTZ_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, QUARTZ_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, QUARTZ_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, STARDUSITE_INGOT);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, STARDUSITE_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, STARDUSITE_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, STARDUSITE_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, STARDUSITE_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CACTUS_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CACTUS_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CACTUS_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CACTUS_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CRIMSON_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CRIMSON_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CRIMSON_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CRIMSON_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, WARPED_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, WARPED_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, WARPED_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, WARPED_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, MANGROVE_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, MANGROVE_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, MANGROVE_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, MANGROVE_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, DARK_OAK_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, DARK_OAK_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, DARK_OAK_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, DARK_OAK_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, JUNGLE_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, JUNGLE_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, JUNGLE_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, JUNGLE_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, BIRCH_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, BIRCH_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, BIRCH_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, BIRCH_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, SPRUCE_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, SPRUCE_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, SPRUCE_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, SPRUCE_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ACACIA_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ACACIA_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ACACIA_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ACACIA_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, OAK_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, OAK_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, OAK_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, OAK_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, SLIME_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, SLIME_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, SLIME_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, SLIME_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, OBSIDIAN_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, OBSIDIAN_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, OBSIDIAN_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, OBSIDIAN_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, LAPIS_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, LAPIS_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, LAPIS_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, LAPIS_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, REDSTONE_MIXTURE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, REDSTONE_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, REDSTONE_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, REDSTONE_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, REDSTONE_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ICE_SHARD);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, HARDENED_ICE_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, HARDENED_ICE_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, HARDENED_ICE_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, HARDENED_ICE_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, COPPER_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, COPPER_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, COPPER_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, COPPER_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, HEART_OF_THE_END);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ENDER_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ENDER_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ENDER_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ENDER_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, MARINE_DIAMOND);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, MARINE_DIAMOND_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, MARINE_DIAMOND_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, MARINE_DIAMOND_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, MARINE_DIAMOND_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, EMERALD_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, EMERALD_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, EMERALD_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, EMERALD_BOOTS);
    }

    // 1.19.3
    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        PlentyOfArmors.LOGGER.info("Registering Mod items for" + PlentyOfArmors.MOD_ID);

        addItemsToItemsGroup();
    }
}
