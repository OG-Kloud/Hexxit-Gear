package kloud.block;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class BlockHandler {
	
	public static final Block hexibiscus = new HexibiscusFlower("hexibiscus");
	//IWorldGenerator
	
	
	private static final Block[] blockCollection = new Block[] {hexibiscus};
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> e) {
			final Block[] blocks = BlockHandler.blockCollection;
			
			IForgeRegistry<Block> registry = e.getRegistry();
			for(final Block block : blocks) {
				registry.register(block);
			}
		}
	}

}
