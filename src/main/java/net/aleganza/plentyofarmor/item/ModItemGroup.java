package net.aleganza.plentyofarmor.item;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.aleganza.plentyofarmor.PlentyOfArmor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

// add a new item group to the creative inventory                                                                                      A2%
public class ModItemGroup {

    public static final ItemGroup PLENTYOFARMOR = FabricItemGroupBuilder.build(new Identifier(PlentyOfArmor.MOD_ID, "plentyofarmor"),
            () -> new ItemStack(ModItems.PROVA));
}