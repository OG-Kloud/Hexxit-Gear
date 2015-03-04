package net.kloudspace.kloudgear;

import net.kloudspace.kloudgear.crafting.Recipes;
import net.kloudspace.kloudgear.init.ModBlocks;
import net.kloudspace.kloudgear.init.ModGen;
import net.kloudspace.kloudgear.init.ModItems;
import net.kloudspace.kloudgear.util.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class KloudGear {
	
    @SidedProxy(clientSide="net.kloudspace.kloudgear.client.ClientProxy", serverSide="net.kloudspace.kloudgear.CommonProxy")
    public static CommonProxy proxy;
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event) {
		ModItems.init();
		ModBlocks.init();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
	Recipes.init();	
	ModGen.init();
	}
	
	@EventHandler
	public void postLoad(FMLPostInitializationEvent event) {
		
	}

}
