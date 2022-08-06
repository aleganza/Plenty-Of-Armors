package net.aleganza.plentyofarmor.item;

import net.aleganza.plentyofarmor.PlentyOfArmor;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // items

    public static final Item PROVA = registerItem("prova",
            new Item(new FabricItemSettings().group(ModItemGroup.PLENTYOFARMOR)));

    // items registration

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PlentyOfArmor.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PlentyOfArmor.LOGGER.info("Registering Mod items for" + PlentyOfArmor.MOD_ID);
    }
}
