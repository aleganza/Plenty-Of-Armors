package net.aleganza.plentyofarmor.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.aleganza.plentyofarmor.PlentyOfArmor;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block BLOCCONE = registerBlock("bloccone",
        new Block(FabricBlockSettings.of (Material.METAL).strength(6f).requiresTool()),ItemGroup.MISC);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK,new Identifier(PlentyOfArmor.MOD_ID,name),block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM,new Identifier(PlentyOfArmor.MOD_ID,name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        PlentyOfArmor.LOGGER.info("Registering ModBlocks for" + PlentyOfArmor.MOD_ID);
    }
}
