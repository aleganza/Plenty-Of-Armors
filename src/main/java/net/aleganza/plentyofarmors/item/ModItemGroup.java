package net.aleganza.plentyofarmors.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.aleganza.plentyofarmors.PlentyOfArmors;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

// add a new item group to the creative inventory                                                                                      A2%
public class ModItemGroup {

    public static ItemGroup PLENTYOFARMOR;

    public static void registerItemGroup() {
        PLENTYOFARMOR = FabricItemGroup.builder(new Identifier(PlentyOfArmors.MOD_ID, "plentyofarmors"))
                .displayName(Text.literal("Plenty Of Armors"))
                .icon(() -> new ItemStack(ModItems.ADV_ICON)).build();
    }
}