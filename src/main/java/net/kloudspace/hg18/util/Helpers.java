package net.kloudspace.hg18.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class Helpers {
	
	public static String modid = HG18Reference.modid;
	public static Logger logger = LogManager.getLogger(modid.toUpperCase());
	
	public static void registerItems(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	public static void registerBlocks(Block block, String name) {
		GameRegistry.registerBlock(block, name);
	}
	
	public static void registerItemRendrer(Item item, String a) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" +a, "inventory"));
		logger.info(a);	
	}
	public static void registerBlockRenderer(Block b, String a) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(b), 0, new ModelResourceLocation(modid+":"+a, "inventory"));
	}
	public static int length(String name) {
		return name.length()-5;
	}

}
