package net.kloudspace.kloudgear.init;

import net.kloudspace.kloudgear.blocks.BlockKloudOre;
import net.kloudspace.kloudgear.blocks.FlowerBlock;
import net.kloudspace.kloudgear.util.RegisterHelper;
import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block kloudOre = new BlockKloudOre("blockKloudOre");
	public static Block hexibiscus = new FlowerBlock().setBlockName("hexibiscus");
	
	public static void init() {
		RegisterHelper.registerBlocks(kloudOre);
		RegisterHelper.registerBlocks(hexibiscus);
		
	}

}
