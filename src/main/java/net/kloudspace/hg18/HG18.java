package net.kloudspace.hg18;

import net.kloudspace.hg18.util.HG18Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = HG18Reference.modid, name = HG18Reference.name, version = HG18Reference.name)
public class HG18 {
	
	@Instance
	public static HG18 instance;
	
    @SidedProxy(clientSide="net.kloudspace.hg18.client.ClientProxy", serverSide="net.kloudspace.hg18.server.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
	public void preLoad(FMLPreInitializationEvent event) {
    	proxy.preLoad(event);
    }
    
    @EventHandler
    public void initial(FMLInitializationEvent event) {
    	proxy.init(event);
    }
    
    @EventHandler
	public void postLoad(FMLPostInitializationEvent event) {
    	proxy.post(event);
    }


}
