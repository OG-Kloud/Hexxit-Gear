package net.kloudspace.hg18.client;

import net.kloudspace.hg18.CommonProxy;
import net.kloudspace.hg18.block.HG18Blocks;
import net.kloudspace.hg18.item.HG18Items;
import net.kloudspace.hg18.item.model.ModelHoodHelmet;
import net.kloudspace.hg18.item.model.ModelScaleHelmet;
import net.kloudspace.hg18.item.model.ModelSkullHelmet;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void preLoad(FMLPreInitializationEvent e) {
		// TODO Auto-generated method stub
		super.preLoad(e);
	}

	@Override
	public void init(FMLInitializationEvent e) {		
		HG18Items.registerItemRenderer();
		HG18Blocks.registerBlockRenderer();
		super.init(e);
	}

	@Override
	public void post(FMLPostInitializationEvent e) {
		// TODO Auto-generated method stub
		super.post(e);
	}

	private static final ModelScaleHelmet scaleHelm = new ModelScaleHelmet();
	private static final ModelHoodHelmet thiefHelm = new ModelHoodHelmet();
	private static final ModelSkullHelmet tribalHelm = new ModelSkullHelmet();
	
    @Override 
    public ModelBiped getArmorModel(int id){ 
    	switch(id) {
    	case 1:
    		return scaleHelm;
    	case 3: 
    		return thiefHelm;
    	case 5:
    		return tribalHelm;
    	default: break;
    	}
    	return scaleHelm;
    }

    @Override
    public int addArmor(String armorName) {
 //       return RenderingRegistry.addNewArmourRendererPrefix(armorName);
    	return 0;
    }

    @Override
    public EntityPlayer findPlayer(String playerName) {
        for (Object a : FMLClientHandler.instance().getClient().theWorld.playerEntities) {
            EntityPlayer player = (EntityPlayer) a;
            if ((player.getDisplayNameString()).toLowerCase().equals(playerName.toLowerCase())) {
                return player;
            }
        }
        return null;
    }

    @Override
    public void registerHandlers() {
        super.registerHandlers();

    }

}
