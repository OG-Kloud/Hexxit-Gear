package net.kloudspace.hg18.util.crafting;

import net.kloudspace.hg18.item.HG18Items;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BaseCrafting {
	
	public static void addRecipies(ItemStack i, Object...objects) {
		GameRegistry.addRecipe(i, objects);
	}
	
	public static void baseHandler() {
		addRecipies(new ItemStack(HG18Items.hexDiamond), new Object[]{" h ", "hdh", " h ", 'h', HG18Items.essence, 'd', Items.diamond});
	}

}
