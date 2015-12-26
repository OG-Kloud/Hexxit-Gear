
package net.kloudspace.hg18.server;

import net.kloudspace.hg18.CommonProxy;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy{
	
	@Override
	public void preLoad(FMLPreInitializationEvent e) {
		// TODO Auto-generated method stub
		super.preLoad(e);
	}

	@Override
	public void init(FMLInitializationEvent e) {
		registerHandlers();
		super.init(e);
	}

	@Override
	public void post(FMLPostInitializationEvent e) {
		// TODO Auto-generated method stub
		super.post(e);
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
