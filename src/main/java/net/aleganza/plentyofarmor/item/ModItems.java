package net.aleganza.plentyofarmor.item;

import net.aleganza.plentyofarmor.PlentyOfArmor;
import net.aleganza.plentyofarmor.item.custom.ModArmorEmerald;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // ---+ ITEMS +---
    // marine set
    public static final Item MARINE_DIAMOND = registerItem("marine_diamond",
            new Item(new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    public static final Item MARINE_DIAMOND_HELMET = registerItem("marine_diamond_helmet",
            new ModArmorEmerald(ModArmorMaterials.MARINE_DIAMOND, EquipmentSlot.HEAD,
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
