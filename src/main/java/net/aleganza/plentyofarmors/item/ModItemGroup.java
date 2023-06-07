package net.aleganza.plentyofarmors.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.aleganza.plentyofarmors.PlentyOfArmors;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

// add a new item group to the creative inventory                                                                                      A2%
public class ModItemGroup {

    /*public static ItemGroup PLENTYOFARMOR;*/
    public static final RegistryKey<ItemGroup> PLENTYOFARMOR = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(PlentyOfArmors.MOD_ID, "plentyofarmors"));


    public static void registerItemGroup() {
        /*PLENTYOFARMOR = FabricItemGroup.builder(new Identifier(PlentyOfArmors.MOD_ID, "plentyofarmors"))
                .displayName(Text.literal("Plenty Of Armors"))
                .icon(() -> new ItemStack(ModItems.ADV_ICON)).build();*/
        Registry.register(Registries.ITEM_GROUP, PLENTYOFARMOR, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.ADV_ICON))
                .displayName(Text.translatable("Plenty Of Armors"))
                .build());
    }
}