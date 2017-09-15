package kloud.proxy;

import kloud.block.BlockHandler;
import kloud.block.HexibiscusFlower;
import kloud.event.KGEventHandler;
import kloud.item.book.BookHandler;
import kloud.utils.KGUtils;
import kloud.world.WorldGenHexibiscus;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Common {
	
	public void preInit(FMLPreInitializationEvent e) {
		KGUtils.init();
		BookHandler.init();
		MinecraftForge.EVENT_BUS.register(new KGEventHandler());
		GameRegistry.registerWorldGenerator(new WorldGenHexibiscus((HexibiscusFlower)BlockHandler.hexibiscus), 1);	
	}
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
	}

	public ModelBiped getArmorModel(int i) {
		return null;
	}

}
