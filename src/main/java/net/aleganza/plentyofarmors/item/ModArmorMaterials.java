package net.aleganza.plentyofarmors.item;

import java.util.EnumMap;
import java.util.function.Supplier;

import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.item.ArmorItem.Type;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.Util;

public enum ModArmorMaterials implements StringIdentifiable, ArmorMaterial {

    ENDER_NETHERITE("ender_netherite", 37, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 4);
        map.put(Type.LEGGINGS, 7);
        map.put(Type.CHESTPLATE, 9);
        map.put(Type.HELMET, 4);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_CHESTPLATE});
    }),
    FROZEN_DIAMOND("frozen_diamond", 33, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 3);
        map.put(Type.LEGGINGS, 6);
        map.put(Type.CHESTPLATE, 8);
        map.put(Type.HELMET, 3);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.FROZEN_DIAMOND});
    }),
    PHANTOM("phantom", 21, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 2);
        map.put(Type.LEGGINGS, 5);
        map.put(Type.CHESTPLATE, 6);
        map.put(Type.HELMET, 3);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.HARDENED_PHANTOM_MEMBRANE});
    }),
    REINFORCED_IRON("reinforced_iron", 25, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 3);
        map.put(Type.LEGGINGS, 5);
        map.put(Type.CHESTPLATE, 7);
        map.put(Type.HELMET, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_CHESTPLATE});
    }),
    ECHO_SHARD("echo_shard", 35, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 3);
        map.put(Type.LEGGINGS, 6);
        map.put(Type.CHESTPLATE, 8);
        map.put(Type.HELMET, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.ECHO_SHARD});
    }),
    BRICK("brick", 9, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 1);
        map.put(Type.LEGGINGS, 3);
        map.put(Type.CHESTPLATE, 4);
        map.put(Type.HELMET, 1);
    }), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.BRICK});
    }),
    NETHER_BRICK("nether_brick", 11, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 2);
        map.put(Type.LEGGINGS, 3);
        map.put(Type.CHESTPLATE, 4);
        map.put(Type.HELMET, 2);
    }), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHER_BRICK});
    }),
    AMETHYST("amethyst", 35, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 3);
        map.put(Type.LEGGINGS, 6);
        map.put(Type.CHESTPLATE, 8);
        map.put(Type.HELMET, 3);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.AMETHYST_GEM});
    }),
    CRYING_OBSIDIAN("crying_obsidian", 21, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 2);
        map.put(Type.LEGGINGS, 5);
        map.put(Type.CHESTPLATE, 6);
        map.put(Type.HELMET, 3);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.CRYING_OBSIDIAN});
    }),
    QUARTZ("quartz", 12, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 2);
        map.put(Type.LEGGINGS, 3);
        map.put(Type.CHESTPLATE, 5);
        map.put(Type.HELMET, 2);
    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.QUARTZ});
    }),
    STARDUSITE("stardusite", 37, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 5);
        map.put(Type.LEGGINGS, 8);
        map.put(Type.CHESTPLATE, 10);
        map.put(Type.HELMET, 5);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.STARDUSITE_INGOT});
    }),
    CACTUS("cactus", 7, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 1);
        map.put(Type.LEGGINGS, 2);
        map.put(Type.CHESTPLATE, 2);
        map.put(Type.HELMET, 1);
    }), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Blocks.CACTUS});
    }),
    CRIMSON("crimson", 7, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 1);
        map.put(Type.LEGGINGS, 2);
        map.put(Type.CHESTPLATE, 2);
        map.put(Type.HELMET, 1);
    }), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.CRIMSON_PLANKS});
    }),
    WARPED("warped", 7, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 1);
        map.put(Type.LEGGINGS, 2);
        map.put(Type.CHESTPLATE, 2);
        map.put(Type.HELMET, 1);
    }), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.WARPED_PLANKS});
    }),
    BAMBOO("bamboo", 5, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 1);
        map.put(Type.LEGGINGS, 1);
        map.put(Type.CHESTPLATE, 2);
        map.put(Type.HELMET, 1);
    }), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.BAMBOO_PLANKS});
    }),
    CHERRY("cherry", 5, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 1);
        map.put(Type.LEGGINGS, 1);
        map.put(Type.CHESTPLATE, 2);
        map.put(Type.HELMET, 1);
    }), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.CHERRY_PLANKS});
    }),
    MANGROVE("mangrove", 5, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 1);
        map.put(Type.LEGGINGS, 1);
        map.put(Type.CHESTPLATE, 2);
        map.put(Type.HELMET, 1);
    }), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.MANGROVE_PLANKS});
    }),
    DARK_OAK("dark_oak", 5, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 1);
        map.put(Type.LEGGINGS, 1);
        map.put(Type.CHESTPLATE, 2);
        map.put(Type.HELMET, 1);
    }), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.DARK_OAK_PLANKS});
    }),
    JUNGLE("jungle", 5, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 1);
        map.put(Type.LEGGINGS, 1);
        map.put(Type.CHESTPLATE, 2);
        map.put(Type.HELMET, 1);
    }), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.JUNGLE_PLANKS});
    }),
    BIRCH("birch", 5, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 1);
        map.put(Type.LEGGINGS, 1);
        map.put(Type.CHESTPLATE, 2);
        map.put(Type.HELMET, 1);
    }), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.BIRCH_PLANKS});
    }),
    SPRUCE("spruce", 5, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 1);
        map.put(Type.LEGGINGS, 1);
        map.put(Type.CHESTPLATE, 2);
        map.put(Type.HELMET, 1);
    }), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.SPRUCE_PLANKS});
    }),
    ACACIA("acacia", 5, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 1);
        map.put(Type.LEGGINGS, 1);
        map.put(Type.CHESTPLATE, 2);
        map.put(Type.HELMET, 1);
    }), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.ACACIA_PLANKS});
    }),
    OAK("oak", 5, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 1);
        map.put(Type.LEGGINGS, 1);
        map.put(Type.CHESTPLATE, 2);
        map.put(Type.HELMET, 1);
    }), 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Blocks.OAK_PLANKS});
    }),
    SLIME("slime", 7, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 1);
        map.put(ArmorItem.Type.LEGGINGS, 2);
        map.put(ArmorItem.Type.CHESTPLATE, 2);
        map.put(ArmorItem.Type.HELMET, 1);
    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.SLIME_BALL});
    }),
    OBSIDIAN("obsidian", 21, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 5);
        map.put(ArmorItem.Type.CHESTPLATE, 6);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.OBSIDIAN});
    }),
    LAPIS("lapis", 13, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 3);
        map.put(ArmorItem.Type.CHESTPLATE, 5);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.LAPIS_LAZULI});
    }),
    REDSTONE_MIXTURE("redstone", 12, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 3);
        map.put(ArmorItem.Type.CHESTPLATE, 5);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.REDSTONE_MIXTURE});
    }),
    HARDENED_ICE_SHARD("hardened_ice", 23, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 5);
        map.put(ArmorItem.Type.CHESTPLATE, 6);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.HARDENED_ICE_SHARD});
    }),
    COPPER("copper", 13, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 4);
        map.put(ArmorItem.Type.CHESTPLATE, 5);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.COPPER_INGOT});
    }),
    EMERALD("emerald", 23, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 5);
        map.put(ArmorItem.Type.CHESTPLATE, 7);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.EMERALD});
    }),
    MARINE_DIAMOND("marine_diamond", 35, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 4);
        map.put(ArmorItem.Type.LEGGINGS, 7);
        map.put(ArmorItem.Type.CHESTPLATE, 9);
        map.put(ArmorItem.Type.HELMET, 4);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.MARINE_DIAMOND});
    }),
    HEART_OF_THE_END("ender", 35, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.HEART_OF_THE_END});
    });

    public static final StringIdentifiable.Codec<ArmorMaterials> CODEC = StringIdentifiable.createCodec(ArmorMaterials::values);
    private static final EnumMap<ArmorItem.Type, Integer> BASE_DURABILITY = (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(Type.BOOTS, 13);
        map.put(Type.LEGGINGS, 15);
        map.put(Type.CHESTPLATE, 16);
        map.put(Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterials(String name, int durabilityMultiplier, EnumMap protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(ArmorItem.Type type) {
        return (Integer)BASE_DURABILITY.get(type) * this.durabilityMultiplier;
    }

    public int getProtection(ArmorItem.Type type) {
        return (Integer)this.protectionAmounts.get(type);
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredientSupplier.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public String asString() {
        return this.name;
    }
}