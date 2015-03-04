package net.kloudspace.kloudgear.crafting;

import net.kloudspace.kloudgear.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void init() {
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.hexicalDiamond), new Object[]{
			"CBC", 
			"BAB", 
			"CBC", 
			'A', Items.nether_star, 
			'B', Items.diamond, 
			'C', Items.blaze_powder});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.hexicalDiamond), new Object[]{ 
			"BCB", 
			"CAC", 
			"BCB", 
			'A', Items.nether_star, 
			'B', Items.diamond, 
			'C', Items.blaze_powder});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.hexicalDiamond),  new Object[] {
			" A ", 
			"ABA", 
			" A ", 
			'A', ModItems.hexicalEssence, 
			'B', Items.diamond});
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tribalHelmet), new Object[]
                {
                        "BBB",
                        "BHB",
                        "   ",
                        'B', Items.bone,
                        'H', ModItems.hexicalDiamond
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tribalChest), new Object[]
                {
                        "I I",
                        "LHL",
                        "ILI",
                        'I', "ingotIron",
                        'L', Items.leather,
                        'H', ModItems.hexicalDiamond
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tribalLeggings), new Object[]
                {
                        "LLL",
                        "IHI",
                        "L L",
                        'I', "ingotIron",
                        'L', Items.leather,
                        'H', ModItems.hexicalDiamond
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tribalBoots), new Object[]
                {
                        "   ",
                        "SHS",
                        "L L",
                        'S', Items.string,
                        'L', Items.leather,
                        'H', ModItems.hexicalDiamond
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.thiefHelmet), new Object[]
                {
                        "RRR",
                        "RHR",
                        "   ",
                        'R', new ItemStack(Blocks.wool, 1, 14),
                        'H', ModItems.hexicalDiamond
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.thiefChest), new Object[]
                {
                        "R R",
                        "LHL",
                        "LLL",
                        'R', new ItemStack(Blocks.wool, 1, 14),
                        'L', Items.leather,
                        'H', ModItems.hexicalDiamond
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.thiefLeggings), new Object[]
                {
                        "LSL",
                        "LHL",
                        "L L",
                        'L', Items.leather,
                        'S', Items.string,
                        'H', ModItems.hexicalDiamond
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.thiefBoots), new Object[]
                {
                        "   ",
                        "LHL",
                        "B B",
                        'L', Items.leather,
                        'H', ModItems.hexicalDiamond,
                        'B', new ItemStack(Blocks.wool, 1, 12)
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.scaleHelmet), new Object[]
                {
                        "GOG",
                        "OHO",
                        "   ",
                        'G', "ingotGold",
                        'O', Blocks.obsidian,
                        'H', ModItems.hexicalDiamond
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.scaleChest), new Object[]
                {
                        "G G",
                        "OHO",
                        "GOG",
                        'G', "ingotGold",
                        'O', Blocks.obsidian,
                        'H', ModItems.hexicalDiamond
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.scaleLeggings), new Object[]
                {
                        "OOO",
                        "GHG",
                        "O O",
                        'O', Blocks.obsidian,
                        'G', "ingotGold",
                        'H', ModItems.hexicalDiamond
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.scaleBoots), new Object[]
                {
                        "   ",
                        "OHO",
                        "O O",
                        'O', Blocks.obsidian,
                        'H', ModItems.hexicalDiamond
                }));


        /* Add repair recipes */
    //    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tribalHelmet, 1, 0), new ItemStack(ModItems.tribalHelmet, 1, Short.MAX_VALUE), ModItems.hexicalEssence);
	}

}
