package net.kloudspace.kloudgear.init;

import net.kloudspace.kloudgear.gen.BaseHexGen;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModGen {
	
	public static BaseHexGen hexGen;
	
	public static void init() {
		GameRegistry.registerWorldGenerator(hexGen = new BaseHexGen(), 10);
	}

}
