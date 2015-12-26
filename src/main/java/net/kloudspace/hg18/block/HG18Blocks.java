package net.kloudspace.hg18.block;

import net.kloudspace.hg18.util.Helpers;
import net.minecraft.block.Block;

public final class HG18Blocks {
	
	public static Block hexibiscus = new HGBlock("hexibiscus").setLightLevel(1.5f);
	
	public static void create() {
		Helpers.registerBlocks(hexibiscus, "hexibiscus");
	}
	
	public static void registerBlockRenderer() {
		Helpers.registerBlockRenderer(hexibiscus, "hexibiscus");
	}

}
