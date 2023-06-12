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
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    // ---+ ITEMS +---

    // adv icon
    public static final Item ADV_ICON = registerItem("adv_icon",
            new Item(new FabricItemSettings()));

    // ender netherite set
    public static final Item ENDER_NETHERITE_HELMET = registerItem("ender_netherite_helmet",
            new ModArmorEnderNetherite1(ModArmorMaterials.ENDER_NETHERITE, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item ENDER_NETHERITE_CHESPLATE = registerItem("ender_netherite_chestplate",
            new ModArmorEnderNetherite2(ModArmorMaterials.ENDER_NETHERITE, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item ENDER_NETHERITE_LEGGINGS = registerItem("ender_netherite_leggings",
            new ArmorItem(ModArmorMaterials.ENDER_NETHERITE, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item ENDER_NETHERITE_BOOTS = registerItem("ender_netherite_boots",
            new ArmorItem(ModArmorMaterials.ENDER_NETHERITE, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // frozen diamond set
    public static final Item FROZEN_DIAMOND = registerItem("frozen_diamond",
            new Item(new FabricItemSettings()));

    public static final Item FROZEN_DIAMOND_HELMET = registerItem("frozen_diamond_helmet",
            new ModArmorFrozenDiamond(ModArmorMaterials.FROZEN_DIAMOND, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item FROZEN_DIAMOND_CHESTPLATE = registerItem("frozen_diamond_chestplate",
            new ArmorItem(ModArmorMaterials.FROZEN_DIAMOND, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item FROZEN_DIAMOND_LEGGINGS = registerItem("frozen_diamond_leggings",
            new ArmorItem(ModArmorMaterials.FROZEN_DIAMOND, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item FROZEN_DIAMOND_BOOTS = registerItem("frozen_diamond_boots",
            new ArmorItem(ModArmorMaterials.FROZEN_DIAMOND, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // phantom set
    public static final Item HARDENED_PHANTOM_MEMBRANE = registerItem("hardened_phantom_membrane",
            new Item(new FabricItemSettings()));

    public static final Item PHANTOM_HELMET = registerItem("phantom_helmet",
            new ModArmorPhantom(ModArmorMaterials.PHANTOM, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item PHANTOM_CHESTPLATE = registerItem("phantom_chestplate",
            new ArmorItem(ModArmorMaterials.PHANTOM, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item PHANTOM_LEGGINGS = registerItem("phantom_leggings",
            new ArmorItem(ModArmorMaterials.PHANTOM, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item PHANTOM_BOOTS = registerItem("phantom_boots",
            new ArmorItem(ModArmorMaterials.PHANTOM, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // reinforced iron set
    public static final Item REINFORCED_IRON_HELMET = registerItem("reinforced_iron_helmet",
            new ModArmorReinforcedIron(ModArmorMaterials.REINFORCED_IRON, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item REINFORCED_IRON_CHESTPLATE = registerItem("reinforced_iron_chestplate",
            new ArmorItem(ModArmorMaterials.REINFORCED_IRON, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item REINFORCED_IRON_LEGGINGS = registerItem("reinforced_iron_leggings",
            new ArmorItem(ModArmorMaterials.REINFORCED_IRON, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item REINFORCED_IRON_BOOTS = registerItem("reinforced_iron_boots",
            new ArmorItem(ModArmorMaterials.REINFORCED_IRON, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // echo shard set
    public static final Item ECHO_SHARD_HELMET = registerItem("echo_shard_helmet",
            new ArmorItem(ModArmorMaterials.ECHO_SHARD, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    /* public static final Item ECHO_SHARD_HELMET = registerItem("echo_shard_helmet",
            new ModArmorEchoShard(ModArmorMaterials.ECHO_SHARD, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));*/
    public static final Item ECHO_SHARD_CHESTPLATE = registerItem("echo_shard_chestplate",
            new ArmorItem(ModArmorMaterials.ECHO_SHARD, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item ECHO_SHARD_LEGGINGS = registerItem("echo_shard_leggings",
            new ArmorItem(ModArmorMaterials.ECHO_SHARD, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item ECHO_SHARD_BOOTS = registerItem("echo_shard_boots",
            new ArmorItem(ModArmorMaterials.ECHO_SHARD, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // brick set
    public static final Item BRICK_HELMET = registerItem("brick_helmet",
            new ModArmorBrick(ModArmorMaterials.BRICK, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item BRICK_CHESTPLATE = registerItem("brick_chestplate",
            new ArmorItem(ModArmorMaterials.BRICK, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item BRICK_LEGGINGS = registerItem("brick_leggings",
            new ArmorItem(ModArmorMaterials.BRICK, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item BRICK_BOOTS = registerItem("brick_boots",
            new ArmorItem(ModArmorMaterials.BRICK, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // nether brick set
    public static final Item NETHER_BRICK_HELMET = registerItem("nether_brick_helmet",
            new ModArmorNetherBrick(ModArmorMaterials.NETHER_BRICK, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item NETHER_BRICK_CHESTPLATE = registerItem("nether_brick_chestplate",
            new ArmorItem(ModArmorMaterials.NETHER_BRICK, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item NETHER_BRICK_LEGGINGS = registerItem("nether_brick_leggings",
            new ArmorItem(ModArmorMaterials.NETHER_BRICK, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item NETHER_BRICK_BOOTS = registerItem("nether_brick_boots",
            new ArmorItem(ModArmorMaterials.NETHER_BRICK, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // amethyst set
    public static final Item AMETHYST_GEM = registerItem("amethyst_gem",
            new Item(new FabricItemSettings()));

    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet",
            new ModArmorAmethyst(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate",
            new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings",
            new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item AMETHYST_BOOTS = registerItem("amethyst_boots",
            new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // crying obsidian set
    public static final Item CRYING_OBSIDIAN_HELMET = registerItem("crying_obsidian_helmet",
            new ArmorItem(ModArmorMaterials.CRYING_OBSIDIAN, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item CRYING_OBSIDIAN_CHESTPLATE = registerItem("crying_obsidian_chestplate",
            new ArmorItem(ModArmorMaterials.CRYING_OBSIDIAN, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item CRYING_OBSIDIAN_LEGGINGS = registerItem("crying_obsidian_leggings",
            new ArmorItem(ModArmorMaterials.CRYING_OBSIDIAN, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item CRYING_OBSIDIAN_BOOTS = registerItem("crying_obsidian_boots",
            new ArmorItem(ModArmorMaterials.CRYING_OBSIDIAN, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // quartz set
    public static final Item QUARTZ_HELMET = registerItem("quartz_helmet",
            new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item QUARTZ_CHESTPLATE = registerItem("quartz_chestplate",
            new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item QUARTZ_LEGGINGS = registerItem("quartz_leggings",
            new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item QUARTZ_BOOTS = registerItem("quartz_boots",
            new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // stardusite set
    public static final Item STARDUSITE_INGOT = registerItem("stardusite_ingot",
            new Item(new FabricItemSettings()));

    public static final Item STARDUSITE_HELMET = registerItem("stardusite_helmet",
            new ModArmorStardusite1(ModArmorMaterials.STARDUSITE, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item STARDUSITE_CHESTPLATE = registerItem("stardusite_chestplate",
            new ModArmorStardusite2(ModArmorMaterials.STARDUSITE, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item STARDUSITE_LEGGINGS = registerItem("stardusite_leggings",
            new ArmorItem(ModArmorMaterials.STARDUSITE, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item STARDUSITE_BOOTS = registerItem("stardusite_boots",
            new ArmorItem(ModArmorMaterials.STARDUSITE, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // cactus set
    public static final Item CACTUS_HELMET = registerItem("cactus_helmet",
            new ModArmorCactus(ModArmorMaterials.CACTUS, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item CACTUS_CHESTPLATE = registerItem("cactus_chestplate",
            new ArmorItem(ModArmorMaterials.CACTUS, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item CACTUS_LEGGINGS = registerItem("cactus_leggings",
            new ArmorItem(ModArmorMaterials.CACTUS, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item CACTUS_BOOTS = registerItem("cactus_boots",
            new ArmorItem(ModArmorMaterials.CACTUS, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // crimson set
    public static final Item CRIMSON_HELMET = registerItem("crimson_helmet",
            new ModArmorCrimson(ModArmorMaterials.CRIMSON, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item CRIMSON_CHESTPLATE = registerItem("crimson_chestplate",
            new ArmorItem(ModArmorMaterials.CRIMSON, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item CRIMSON_LEGGINGS = registerItem("crimson_leggings",
            new ArmorItem(ModArmorMaterials.CRIMSON, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item CRIMSON_BOOTS = registerItem("crimson_boots",
            new ArmorItem(ModArmorMaterials.CRIMSON, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // warped set
    public static final Item WARPED_HELMET = registerItem("warped_helmet",
            new ModArmorWarped(ModArmorMaterials.WARPED, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item WARPED_CHESTPLATE = registerItem("warped_chestplate",
            new ArmorItem(ModArmorMaterials.WARPED, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item WARPED_LEGGINGS = registerItem("warped_leggings",
            new ArmorItem(ModArmorMaterials.WARPED, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item WARPED_BOOTS = registerItem("warped_boots",
            new ArmorItem(ModArmorMaterials.WARPED, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // bamboo set
    public static final Item BAMBOO_HELMET = registerItem("bamboo_helmet",
            new ArmorItem(ModArmorMaterials.BAMBOO, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item BAMBOO_CHESTPLATE = registerItem("bamboo_chestplate",
            new ArmorItem(ModArmorMaterials.BAMBOO, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item BAMBOO_LEGGINGS = registerItem("bamboo_leggings",
            new ArmorItem(ModArmorMaterials.BAMBOO, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item BAMBOO_BOOTS = registerItem("bamboo_boots",
            new ArmorItem(ModArmorMaterials.BAMBOO, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // cherry set
    public static final Item CHERRY_HELMET = registerItem("cherry_helmet",
            new ArmorItem(ModArmorMaterials.CHERRY, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item CHERRY_CHESTPLATE = registerItem("cherry_chestplate",
            new ArmorItem(ModArmorMaterials.CHERRY, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item CHERRY_LEGGINGS = registerItem("cherry_leggings",
            new ArmorItem(ModArmorMaterials.CHERRY, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item CHERRY_BOOTS = registerItem("cherry_boots",
            new ArmorItem(ModArmorMaterials.CHERRY, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // mangrove set
    public static final Item MANGROVE_HELMET = registerItem("mangrove_helmet",
            new ArmorItem(ModArmorMaterials.MANGROVE, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item MANGROVE_CHESTPLATE = registerItem("mangrove_chestplate",
            new ArmorItem(ModArmorMaterials.MANGROVE, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item MANGROVE_LEGGINGS = registerItem("mangrove_leggings",
            new ArmorItem(ModArmorMaterials.MANGROVE, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item MANGROVE_BOOTS = registerItem("mangrove_boots",
            new ArmorItem(ModArmorMaterials.MANGROVE, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // dark oak set
    public static final Item DARK_OAK_HELMET = registerItem("dark_oak_helmet",
            new ArmorItem(ModArmorMaterials.DARK_OAK, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item DARK_OAK_CHESTPLATE = registerItem("dark_oak_chestplate",
            new ArmorItem(ModArmorMaterials.DARK_OAK, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item DARK_OAK_LEGGINGS = registerItem("dark_oak_leggings",
            new ArmorItem(ModArmorMaterials.DARK_OAK, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item DARK_OAK_BOOTS = registerItem("dark_oak_boots",
            new ArmorItem(ModArmorMaterials.DARK_OAK, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // jungle set
    public static final Item JUNGLE_HELMET = registerItem("jungle_helmet",
            new ArmorItem(ModArmorMaterials.JUNGLE, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item JUNGLE_CHESTPLATE = registerItem("jungle_chestplate",
            new ArmorItem(ModArmorMaterials.JUNGLE, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item JUNGLE_LEGGINGS = registerItem("jungle_leggings",
            new ArmorItem(ModArmorMaterials.JUNGLE, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item JUNGLE_BOOTS = registerItem("jungle_boots",
            new ArmorItem(ModArmorMaterials.JUNGLE, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // birch set
    public static final Item BIRCH_HELMET = registerItem("birch_helmet",
            new ArmorItem(ModArmorMaterials.BIRCH, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item BIRCH_CHESTPLATE = registerItem("birch_chestplate",
            new ArmorItem(ModArmorMaterials.BIRCH, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item BIRCH_LEGGINGS = registerItem("birch_leggings",
            new ArmorItem(ModArmorMaterials.BIRCH, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item BIRCH_BOOTS = registerItem("birch_boots",
            new ArmorItem(ModArmorMaterials.BIRCH, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // spruce set
    public static final Item SPRUCE_HELMET = registerItem("spruce_helmet",
            new ArmorItem(ModArmorMaterials.SPRUCE, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item SPRUCE_CHESTPLATE = registerItem("spruce_chestplate",
            new ArmorItem(ModArmorMaterials.SPRUCE, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item SPRUCE_LEGGINGS = registerItem("spruce_leggings",
            new ArmorItem(ModArmorMaterials.SPRUCE, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item SPRUCE_BOOTS = registerItem("spruce_boots",
            new ArmorItem(ModArmorMaterials.SPRUCE, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // acacia set
    public static final Item ACACIA_HELMET = registerItem("acacia_helmet",
            new ArmorItem(ModArmorMaterials.ACACIA, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item ACACIA_CHESTPLATE = registerItem("acacia_chestplate",
            new ArmorItem(ModArmorMaterials.ACACIA, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item ACACIA_LEGGINGS = registerItem("acacia_leggings",
            new ArmorItem(ModArmorMaterials.ACACIA, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item ACACIA_BOOTS = registerItem("acacia_boots",
            new ArmorItem(ModArmorMaterials.ACACIA, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // oak set
    public static final Item OAK_HELMET = registerItem("oak_helmet",
            new ArmorItem(ModArmorMaterials.OAK, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item OAK_CHESTPLATE = registerItem("oak_chestplate",
            new ArmorItem(ModArmorMaterials.OAK, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item OAK_LEGGINGS = registerItem("oak_leggings",
            new ArmorItem(ModArmorMaterials.OAK, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item OAK_BOOTS = registerItem("oak_boots",
            new ArmorItem(ModArmorMaterials.OAK, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // slime set
    public static final Item SLIME_HELMET = registerItem("slime_helmet",
            new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item SLIME_CHESTPLATE = registerItem("slime_chestplate",
            new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item SLIME_LEGGINGS = registerItem("slime_leggings",
            new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item SLIME_BOOTS = registerItem("slime_boots",
            new ArmorItem(ModArmorMaterials.SLIME, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // obsidian set
    public static final Item OBSIDIAN_HELMET = registerItem("obsidian_helmet",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item OBSIDIAN_CHESTPLATE = registerItem("obsidian_chestplate",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item OBSIDIAN_LEGGINGS = registerItem("obsidian_leggings",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item OBSIDIAN_BOOTS = registerItem("obsidian_boots",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // lapis set
    public static final Item LAPIS_HELMET = registerItem("lapis_helmet",
            new ArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item LAPIS_CHESTPLATE = registerItem("lapis_chestplate",
            new ArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item LAPIS_LEGGINGS = registerItem("lapis_leggings",
            new ArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item LAPIS_BOOTS = registerItem("lapis_boots",
            new ArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // redstone set
    public static final Item REDSTONE_MIXTURE = registerItem("redstone_mixture",
            new Item(new FabricItemSettings()));

    public static final Item REDSTONE_HELMET = registerItem("redstone_helmet",
            new ArmorItem(ModArmorMaterials.REDSTONE_MIXTURE, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item REDSTONE_CHESTPLATE = registerItem("redstone_chestplate",
            new ArmorItem(ModArmorMaterials.REDSTONE_MIXTURE, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item REDSTONE_LEGGINGS = registerItem("redstone_leggings",
            new ArmorItem(ModArmorMaterials.REDSTONE_MIXTURE, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item REDSTONE_BOOTS = registerItem("redstone_boots",
            new ArmorItem(ModArmorMaterials.REDSTONE_MIXTURE, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // hardened ice set
    public static final Item ICE_SHARD = registerItem("ice_shard",
            new Item(new FabricItemSettings()));
    public static final Item HARDENED_ICE_SHARD = registerItem("hardened_ice_shard",
            new Item(new FabricItemSettings()));

    public static final Item HARDENED_ICE_HELMET = registerItem("hardened_ice_helmet",
            new ModArmorHardenedIce(ModArmorMaterials.HARDENED_ICE_SHARD, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item HARDENED_ICE_CHESTPLATE = registerItem("hardened_ice_chestplate",
            new ArmorItem(ModArmorMaterials.HARDENED_ICE_SHARD, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item HARDENED_ICE_LEGGINGS = registerItem("hardened_ice_leggings",
            new ArmorItem(ModArmorMaterials.HARDENED_ICE_SHARD, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item HARDENED_ICE_BOOTS = registerItem("hardened_ice_boots",
            new ArmorItem(ModArmorMaterials.HARDENED_ICE_SHARD, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // copper set
    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // ender set
    public static final Item HEART_OF_THE_END = registerItem("heart_of_the_end",
            new Item(new FabricItemSettings()));

    public static final Item ENDER_HELMET = registerItem("ender_helmet",
            new ModArmorEnder(ModArmorMaterials.HEART_OF_THE_END, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item ENDER_CHESTPLATE = registerItem("ender_chestplate",
            new ArmorItem(ModArmorMaterials.HEART_OF_THE_END, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item ENDER_LEGGINGS = registerItem("ender_leggings",
            new ArmorItem(ModArmorMaterials.HEART_OF_THE_END, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item ENDER_BOOTS = registerItem("ender_boots",
            new ArmorItem(ModArmorMaterials.HEART_OF_THE_END, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // marine set
    public static final Item MARINE_DIAMOND = registerItem("marine_diamond",
            new Item(new FabricItemSettings()));

    public static final Item MARINE_DIAMOND_HELMET = registerItem("marine_diamond_helmet",
            new ModArmorMarineDiamond(ModArmorMaterials.MARINE_DIAMOND, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item MARINE_DIAMOND_CHESTPLATE = registerItem("marine_diamond_chestplate",
            new ArmorItem(ModArmorMaterials.MARINE_DIAMOND, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item MARINE_DIAMOND_LEGGINGS = registerItem("marine_diamond_leggings",
            new ArmorItem(ModArmorMaterials.MARINE_DIAMOND, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item MARINE_DIAMOND_BOOTS = registerItem("marine_diamond_boots",
            new ArmorItem(ModArmorMaterials.MARINE_DIAMOND, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));
    // emerald set
    public static final Item EMERALD_HELMET = registerItem("emerald_helmet",
            new ModArmorEmerald(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // ---+ ITEMS REGISTRATION +---
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PlentyOfArmors.MOD_ID, name), item);
    }

    // 1.19.3
    public static void addItemsToItemsGroup() {
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ENDER_NETHERITE_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ENDER_NETHERITE_CHESPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ENDER_NETHERITE_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, ENDER_NETHERITE_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, FROZEN_DIAMOND);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, FROZEN_DIAMOND_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, FROZEN_DIAMOND_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, FROZEN_DIAMOND_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, FROZEN_DIAMOND_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, HARDENED_PHANTOM_MEMBRANE);
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

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, BAMBOO_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, BAMBOO_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, BAMBOO_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, BAMBOO_BOOTS);

        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CHERRY_HELMET);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CHERRY_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CHERRY_LEGGINGS);
        addToItemGroup(ModItemGroup.PLENTYOFARMOR, CHERRY_BOOTS);

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
    public static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        PlentyOfArmors.LOGGER.info("Registering Mod items for" + PlentyOfArmors.MOD_ID);

        addItemsToItemsGroup();
    }
}
