package bdc.heaven.mod;

import bdc.heaven.mod.blocks.EnderitheBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class HeavenMod implements ModInitializer {

	//Variável de Item
	public static final Item ENXADA_SUPREMA = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	//Variável de bloco
	public static final Block ENDERITHE_BLOCK = new EnderitheBlock(FabricBlockSettings.of(Material.METAL).
	//Rigidez do bloco
	strength(50f, 1200f).
	//som
	sounds(BlockSoundGroup.METAL).
	//Precisa de picareta lv6 para qubrar e dropar
	breakByTool(FabricToolTags.PICKAXES, 6).requiresTool());
	
	@Override
	public void onInitialize() {
		//Registro de item
		Registry.register(Registry.ITEM, new Identifier("heavenmod", "enxada_suprema"), ENXADA_SUPREMA);
		//Registro de bloco
		Registry.register(Registry.BLOCK, new Identifier("heavenmod", "enderithe_block"), ENDERITHE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("heavenmod", "enderithe_block"), new BlockItem(ENDERITHE_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
	}
}
