package kloud.proxy;

import kloud.KG;
import kloud.item.model.ModelHoodHelmet;
import kloud.item.model.ModelScaleHelmet;
import kloud.item.model.ModelSkullHelmet;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Client extends Common{
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}
	

	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(KG.ID + ":" + id, "inventory"));
	}
	
	public static final ModelBiped armorScaleHelm = new ModelScaleHelmet();
	public static final ModelBiped armorSkullHelm = new ModelSkullHelmet();
	public static final ModelBiped armorHoodHelm = new ModelHoodHelmet();
	
	@Override
	public ModelBiped getArmorModel(int i) {
		switch(i) {
			case 0 :
				return armorScaleHelm;
			case 1:
				return armorSkullHelm;
			case 2:
				return armorHoodHelm;
			default:
				return armorScaleHelm;
		}
	}

}
