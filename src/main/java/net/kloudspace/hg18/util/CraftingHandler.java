package net.kloudspace.hg18.util;

import net.kloudspace.hg18.util.crafting.ArmorCrafting;
import net.kloudspace.hg18.util.crafting.BaseCrafting;

public final class CraftingHandler {
	
	public static void loadHandlers() {
		BaseCrafting.baseHandler();
		ArmorCrafting.init();
	}

}
