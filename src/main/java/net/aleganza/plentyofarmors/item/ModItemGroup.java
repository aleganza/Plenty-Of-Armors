package net.aleganza.plentyofarmors.item;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.aleganza.plentyofarmors.PlentyOfArmors;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

// add a new item group to the creative inventory                                                                                      A2%
public class ModItemGroup {

    public static final ItemGroup PLENTYOFARMOR = FabricItemGroupBuilder.build(new Identifier(PlentyOfArmors.MOD_ID, "plentyofarmors"),
            () -> new ItemStack(ModItems.MARINE_DIAMOND_CHESTPLATE));
}