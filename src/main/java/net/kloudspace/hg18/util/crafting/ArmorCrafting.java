package net.kloudspace.hg18.util.crafting;

import net.kloudspace.hg18.item.HG18Items;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ArmorCrafting {
	
	public static void addRecipes(ItemStack i, Object...objects) {
		GameRegistry.addRecipe(i, objects);
	}
	
	public static void init() {
		//Scale Armor Recipes
		addRecipes(new ItemStack(HG18Items.scaleBoots), new Object[] { "gxg", "y y", 'g', Items.gold_ingot, 'x', HG18Items.hexDiamond, 'y', Blocks.obsidian});
		addRecipes(new ItemStack(HG18Items.scaleChest), new Object[] { "g g", "oho", "gog", 'g', Items.gold_ingot, 'h', HG18Items.hexDiamond, 'o', Blocks.obsidian});
		addRecipes(new ItemStack(HG18Items.scaleHelmet), new Object[] { "gog", "oho", 'g', Items.gold_ingot, 'o', Blocks.obsidian, 'h', HG18Items.hexDiamond });
		addRecipes(new ItemStack(HG18Items.scaleLeggings), new Object[] { "ogo", "ghg", "o o", 'g', Items.gold_ingot, 'o', Blocks.obsidian, 'h', HG18Items.hexDiamond});
		//Tribal Armor Recipes
		addRecipes(new ItemStack(HG18Items.tribalHelmet), new Object[] { "BBB", "BHB", "   ", 'B', Items.bone,  'H', HG18Items.hexDiamond});
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(HG18Items.tribalChest), new Object[] { "I I", "LHL", "ILI", 'I', "ingotIron", 'L', Items.leather, 'H', HG18Items.hexDiamond }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(HG18Items.tribalLeggings), new Object[]{ "LLL", "IHI", "L L", 'I', "ingotIron", 'L', Items.leather, 'H', HG18Items.hexDiamond }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(HG18Items.tribalBoots), new Object[] { "   ", "SHS", "L L", 'S', Items.string, 'L', Items.leather, 'H', HG18Items.hexDiamond }));
		//Thief Armor Recipes
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(HG18Items.thiefHelmet), new Object[] { "RRR", "RHR", "   ", 'R', new ItemStack(Blocks.wool, 1, 14), 'H', HG18Items.hexDiamond }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(HG18Items.thiefChest), new Object[] { "R R", "LHL", "LLL", 'R', new ItemStack(Blocks.wool, 1, 14), 'L', Items.leather, 'H', HG18Items.hexDiamond }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(HG18Items.thiefLeggings), new Object[] { "LSL", "LHL", "L L", 'L', Items.leather, 'S', Items.string, 'H', HG18Items.hexDiamond }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(HG18Items.thiefBoots), new Object[] { "   ", "LHL", "B B", 'L', Items.leather, 'H', HG18Items.hexDiamond, 'B', new ItemStack(Blocks.wool, 1, 12)}));

	}

}
