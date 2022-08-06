package net.aleganza.plentyofarmor.item;

import net.aleganza.plentyofarmor.PlentyOfArmor;
import net.aleganza.plentyofarmor.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // items
    public static final Item PROVA = registerItem("prova",
            new Item(new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // emerald set
    public static final Item EMERALD_HELMET = registerItem("emerald_helmet",
            new ModArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));
    public static final Item MYTHRIEMERALD_BOOTS = registerItem("emerald_boots",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // items registration
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PlentyOfArmor.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PlentyOfArmor.LOGGER.info("Registering Mod items for" + PlentyOfArmor.MOD_ID);
    }
}
