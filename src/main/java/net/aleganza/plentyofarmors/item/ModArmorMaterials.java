package net.aleganza.plentyofarmors.item;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {

    // ---+ MOD ARMOR +---
    REINFORCED_IRON("reinforced_iron", 25, new int[]{3, 5, 7, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.ECHO_SHARD});
    }),
    ECHO_SHARD("echo_shard", 35, new int[]{3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.ECHO_SHARD});
    }),
    BRICK("brick", 9, new int[]{1, 3, 4, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.BRICK});
    }),
    NETHER_BRICK("nether_brick", 11, new int[]{2, 3, 4, 2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHER_BRICK});
    }),
    AMETHYST("amethyst", 35, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.AMETHYST_GEM});
    }),
    CRYING_OBSIDIAN("crying_obsidian", 21, new int[]{2, 5, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.CRYING_OBSIDIAN});
    }),
    QUARTZ("quartz", 12, new int[]{2, 3, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.QUARTZ});
    }),
    STARDUSITE("stardusite", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.STARDUSITE_INGOT});
    }),
    CACTUS("cactus", 7, new int[]{1, 2, 2, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Blocks.CACTUS});
    }),
    CRIMSON("crimson", 7, new int[]{1, 2, 2, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.CRIMSON_PLANKS});
    }),
    WARPED("warped", 7, new int[]{1, 2, 2, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.WARPED_PLANKS});
    }),
    MANGROVE("mangrove", 5, new int[]{1, 1, 2, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.MANGROVE_PLANKS});
    }),
    DARK_OAK("dark_oak", 5, new int[]{1, 1, 2, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.DARK_OAK_PLANKS});
    }),
    JUNGLE("jungle", 5, new int[]{1, 1, 2, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.JUNGLE_PLANKS});
    }),
    BIRCH("birch", 5, new int[]{1, 1, 2, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.BIRCH_PLANKS});
    }),
    SPRUCE("spruce", 5, new int[]{1, 1, 2, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.SPRUCE_PLANKS});
    }),
    ACACIA("acacia", 5, new int[]{1, 1, 2, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.ACACIA_PLANKS});
    }),
    OAK("oak", 5, new int[]{1, 1, 2, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Blocks.OAK_PLANKS});
    }),
    SLIME("slime", 7, new int[]{1, 2, 2, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.SLIME_BALL});
    }),  
    OBSIDIAN("obsidian", 21, new int[]{2, 5, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.OBSIDIAN});
    }),
    LAPIS("lapis", 13, new int[]{2, 4, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.LAPIS_LAZULI});
    }),
    REDSTONE_MIXTURE("redstone", 12, new int[]{2, 3, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.REDSTONE_MIXTURE});
    }),
    HARDENED_ICE_SHARD("hardened_ice", 23, new int[]{2, 5, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.HARDENED_ICE_SHARD});
    }),
    COPPER("copper", 13, new int[]{2, 4, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.COPPER_INGOT});
    }),
    EMERALD("emerald", 23, new int[]{2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.EMERALD});
    }),
    MARINE_DIAMOND("marine_diamond", 35, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.MARINE_DIAMOND});
    }),
    HEART_OF_THE_END("ender", 35, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.HEART_OF_THE_END});
    });

    // ---+ DEFAULT ARMOR +---
    /*
    LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.LEATHER});
    }),
    CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
    }),
    IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
    }),
    GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
    }),
    DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND});
    }),
    TURTLE("turtle", 25, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.SCUTE});
    }),
    NETHERITE("netherite", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
    })
    */

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
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
}
