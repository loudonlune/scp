package org.completegar.scp.blocks;

import org.completegar.garcore.factory.BlockCreationForm;
import org.completegar.garcore.factory.BlockFactory;
import org.completegar.scp.SCP;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockList {
	
	public static Block ceilingTile;
	
	public static void init(){
		// make the ceiling tile
		{
			BlockCreationForm bcf = new BlockCreationForm();
			bcf.material = Material.cloth;
			bcf.hardness = 2.5f;
			bcf.resistance = 5f;
			bcf.harvestLevel = 0;
			bcf.harvestTool = "axe";
			bcf.soundType = Block.soundTypeCloth;
			bcf.textureName = (SCP.MODID + ":ceilingtile");
			bcf.unlocalizedName = "ceilingTile";
			ceilingTile = BlockFactory.makeBlock(bcf);
		}
	}
}
