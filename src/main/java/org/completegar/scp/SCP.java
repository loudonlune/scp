package org.completegar.scp;

import org.completegar.garcore.GarCore;
import org.completegar.garcore.register.Register;
import org.completegar.scp.blocks.BlockList;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

@Mod(modid = SCP.MODID, version = SCP.VERSION, dependencies="required-after:garcore")
public class SCP {
	public static final String VERSION = "A0.1";
	public static final String MODID = "scp";
	
	public static CreativeTabs tab = new CreativeTabs("scp"){

		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(BlockList.ceilingTile);
		}
		
	};
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent e){
		System.out.println("SCP Mod A0.1 starting up...");
		System.out.println("Hooked to GarCore version " + GarCore.VERSION);
		BlockList.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e){
		Register.addToRegister(BlockList.ceilingTile);
	}
	
}
