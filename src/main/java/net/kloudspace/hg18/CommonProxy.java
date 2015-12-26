package net.kloudspace.hg18;

import net.kloudspace.hg18.block.HG18Blocks;
import net.kloudspace.hg18.item.HG18Items;
import net.kloudspace.hg18.util.CraftingHandler;
import net.kloudspace.hg18.world.gen.KloudWorldGen;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preLoad(FMLPreInitializationEvent e) {
		HG18Items.create();
		HG18Blocks.create();
		System.out.println("preLoad Method in CommonProxy");
	}
	
	public void init(FMLInitializationEvent e) {
		GameRegistry.registerWorldGenerator(new KloudWorldGen(), 1);
		CraftingHandler.loadHandlers();
	}
	
	public void post(FMLPostInitializationEvent e) {
		
	}
	
    public ModelBiped getArmorModel(int id){ 
    	return null; 
    	}
    
    public int addArmor(String armorName) {
        return 0;
    }

    public EntityPlayer findPlayer(String playerName) {
        return null;
    }

    public void registerHandlers() {
    //    TickRegistry.registerTickHandler(new PlayerTickHandler(), Side.SERVER);
    }

}
