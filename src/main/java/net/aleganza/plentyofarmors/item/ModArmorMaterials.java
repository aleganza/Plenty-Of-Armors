package net.aleganza.plentyofarmors.item;

import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public final class ModArmorMaterials {

    private static final Map<RegistryEntry<ArmorMaterial>, Integer> DURABILITY_MULTIPLIERS = new IdentityHashMap<>();

    public static final RegistryEntry<ArmorMaterial> ENDER_NETHERITE = armorMaterial("ender_netherite", 37,
            armorDefense(4, 7, 9, 4), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_CHESTPLATE));
    public static final RegistryEntry<ArmorMaterial> FROZEN_DIAMOND = armorMaterial("frozen_diamond", 33,
            armorDefense(3, 6, 8, 3), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
            () -> Ingredient.ofItems(ModItems.FROZEN_DIAMOND));
    public static final RegistryEntry<ArmorMaterial> PHANTOM = armorMaterial("phantom", 21,
            armorDefense(2, 5, 6, 3), 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.0F,
            () -> Ingredient.ofItems(ModItems.HARDENED_PHANTOM_MEMBRANE));
    public static final RegistryEntry<ArmorMaterial> REINFORCED_IRON = armorMaterial("reinforced_iron", 25,
            armorDefense(3, 5, 7, 3), 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.1F,
            () -> Ingredient.ofItems(Items.IRON_CHESTPLATE));
    public static final RegistryEntry<ArmorMaterial> ECHO_SHARD = armorMaterial("echo_shard", 35,
            armorDefense(3, 6, 8, 3), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, 0.0F,
            () -> Ingredient.ofItems(Items.ECHO_SHARD));
    public static final RegistryEntry<ArmorMaterial> BRICK = armorMaterial("brick", 9,
            armorDefense(1, 3, 4, 1), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.1F,
            () -> Ingredient.ofItems(Items.BRICK));
    public static final RegistryEntry<ArmorMaterial> NETHER_BRICK = armorMaterial("nether_brick", 11,
            armorDefense(2, 3, 4, 2), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHER_BRICK));
    public static final RegistryEntry<ArmorMaterial> AMETHYST = armorMaterial("amethyst", 35,
            armorDefense(3, 6, 8, 3), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
            () -> Ingredient.ofItems(ModItems.AMETHYST_GEM));
    public static final RegistryEntry<ArmorMaterial> CRYING_OBSIDIAN = armorMaterial("crying_obsidian", 21,
            armorDefense(2, 5, 6, 3), 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.0F,
            () -> Ingredient.ofItems(Items.CRYING_OBSIDIAN));
    public static final RegistryEntry<ArmorMaterial> QUARTZ = armorMaterial("quartz", 12,
            armorDefense(2, 3, 5, 2), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.QUARTZ));
    public static final RegistryEntry<ArmorMaterial> STARDUSITE = armorMaterial("stardusite", 37,
            armorDefense(5, 8, 10, 5), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F,
            () -> Ingredient.ofItems(ModItems.STARDUSITE_INGOT));
    public static final RegistryEntry<ArmorMaterial> CACTUS = armorMaterial("cactus", 7,
            armorDefense(1, 2, 2, 1), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Blocks.CACTUS));
    public static final RegistryEntry<ArmorMaterial> CRIMSON = armorMaterial("crimson", 7,
            armorDefense(1, 2, 2, 1), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.CRIMSON_PLANKS));
    public static final RegistryEntry<ArmorMaterial> WARPED = armorMaterial("warped", 7,
            armorDefense(1, 2, 2, 1), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.WARPED_PLANKS));
    public static final RegistryEntry<ArmorMaterial> BAMBOO = armorMaterial("bamboo", 5,
            armorDefense(1, 1, 2, 1), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.BAMBOO_PLANKS));
    public static final RegistryEntry<ArmorMaterial> CHERRY = armorMaterial("cherry", 5,
            armorDefense(1, 1, 2, 1), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.CHERRY_PLANKS));
    public static final RegistryEntry<ArmorMaterial> MANGROVE = armorMaterial("mangrove", 5,
            armorDefense(1, 1, 2, 1), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.MANGROVE_PLANKS));
    public static final RegistryEntry<ArmorMaterial> DARK_OAK = armorMaterial("dark_oak", 5,
            armorDefense(1, 1, 2, 1), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.DARK_OAK_PLANKS));
    public static final RegistryEntry<ArmorMaterial> JUNGLE = armorMaterial("jungle", 5,
            armorDefense(1, 1, 2, 1), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.JUNGLE_PLANKS));
    public static final RegistryEntry<ArmorMaterial> BIRCH = armorMaterial("birch", 5,
            armorDefense(1, 1, 2, 1), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.BIRCH_PLANKS));
    public static final RegistryEntry<ArmorMaterial> SPRUCE = armorMaterial("spruce", 5,
            armorDefense(1, 1, 2, 1), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.SPRUCE_PLANKS));
    public static final RegistryEntry<ArmorMaterial> ACACIA = armorMaterial("acacia", 5,
            armorDefense(1, 1, 2, 1), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.ACACIA_PLANKS));
    public static final RegistryEntry<ArmorMaterial> OAK = armorMaterial("oak", 5,
            armorDefense(1, 1, 2, 1), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Blocks.OAK_PLANKS));
    public static final RegistryEntry<ArmorMaterial> SLIME = armorMaterial("slime", 7,
            armorDefense(1, 2, 2, 1), 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.SLIME_BALL));
    public static final RegistryEntry<ArmorMaterial> OBSIDIAN = armorMaterial("obsidian", 21,
            armorDefense(2, 5, 6, 3), 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.0F,
            () -> Ingredient.ofItems(Items.OBSIDIAN));
    public static final RegistryEntry<ArmorMaterial> LAPIS = armorMaterial("lapis", 13,
            armorDefense(2, 3, 5, 2), 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.LAPIS_LAZULI));
    public static final RegistryEntry<ArmorMaterial> REDSTONE_MIXTURE = armorMaterial("redstone", 12,
            armorDefense(2, 3, 5, 2), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            () -> Ingredient.ofItems(ModItems.REDSTONE_MIXTURE));
    public static final RegistryEntry<ArmorMaterial> HARDENED_ICE_SHARD = armorMaterial("hardened_ice", 23,
            armorDefense(2, 5, 6, 3), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F,
            () -> Ingredient.ofItems(ModItems.HARDENED_ICE_SHARD));
    public static final RegistryEntry<ArmorMaterial> COPPER = armorMaterial("copper", 13,
            armorDefense(2, 4, 5, 2), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.COPPER_INGOT));
    public static final RegistryEntry<ArmorMaterial> EMERALD = armorMaterial("emerald", 23,
            armorDefense(2, 5, 7, 3), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F,
            () -> Ingredient.ofItems(Items.EMERALD));
    public static final RegistryEntry<ArmorMaterial> MARINE_DIAMOND = armorMaterial("marine_diamond", 35,
            armorDefense(4, 7, 9, 4), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, 0.0F,
            () -> Ingredient.ofItems(ModItems.MARINE_DIAMOND));
    public static final RegistryEntry<ArmorMaterial> HEART_OF_THE_END = armorMaterial("ender", 35,
            armorDefense(3, 6, 8, 3), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
            () -> Ingredient.ofItems(ModItems.HEART_OF_THE_END));

    private ModArmorMaterials() {
    }

    private static RegistryEntry<ArmorMaterial> armorMaterial(String name, int durabilityMultiplier,
                                                               EnumMap<ArmorItem.Type, Integer> defense,
                                                               int enchantability,
                                                               RegistryEntry<SoundEvent> equipSound,
                                                               float toughness, float knockbackResistance,
                                                               Supplier<Ingredient> repairIngredient) {
        RegistryEntry<ArmorMaterial> entry = RegistryEntry.of(new ArmorMaterial(defense, enchantability, equipSound,
                repairIngredient, List.of(new ArmorMaterial.Layer(Identifier.of("minecraft", name))),
                toughness, knockbackResistance));
        DURABILITY_MULTIPLIERS.put(entry, durabilityMultiplier);
        return entry;
    }

    private static EnumMap<ArmorItem.Type, Integer> armorDefense(int boots, int leggings, int chestplate, int helmet) {
        EnumMap<ArmorItem.Type, Integer> map = new EnumMap<>(ArmorItem.Type.class);
        map.put(ArmorItem.Type.BOOTS, boots);
        map.put(ArmorItem.Type.LEGGINGS, leggings);
        map.put(ArmorItem.Type.CHESTPLATE, chestplate);
        map.put(ArmorItem.Type.HELMET, helmet);
        return map;
    }

    public static int durabilityMultiplier(RegistryEntry<ArmorMaterial> material) {
        Integer multiplier = DURABILITY_MULTIPLIERS.get(material);
        if (multiplier == null) {
            throw new IllegalArgumentException("Unknown armor material: " + material);
        }
        return multiplier;
    }
}
