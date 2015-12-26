package net.kloudspace.hg18.item;

import net.kloudspace.hg18.item.armor.ItemScaleArmor;
import net.kloudspace.hg18.item.armor.ItemSkullArmor;
import net.kloudspace.hg18.item.armor.ItemThiefArmor;
import net.kloudspace.hg18.item.model.helm.CustomHoodHelmet;
import net.kloudspace.hg18.item.model.helm.CustomScaleHelmet;
import net.kloudspace.hg18.item.model.helm.CustomSkullHelmet;
import net.kloudspace.hg18.util.Helpers;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public final class HG18Items {
	
	public static Item essence= new HG18Item("essence");
//	public static Item gem = new HG18Item("gem");
	public static Item hexDiamond = new HG18Item("hexDiamond");
	
	public static Item scaleHelmet = new CustomScaleHelmet(ArmorMaterial.DIAMOND, 0, 0).setUnlocalizedName("scaleHelmet");

	public static Item scaleChest = new ItemScaleArmor("scaleChest", ArmorMaterial.DIAMOND, 1, "scaleChest");
	public static Item scaleLeggings = new ItemScaleArmor("scaleLeggings", ArmorMaterial.DIAMOND, 2, "scaleLeggings");
	public static Item scaleBoots = new ItemScaleArmor("scaleBoots", ArmorMaterial.DIAMOND, 3, "scaleBoots");
	
	public static Item thiefHelmet = new CustomHoodHelmet(ArmorMaterial.DIAMOND, 0).setUnlocalizedName("thiefHelmet");
	public static Item thiefChest = new ItemThiefArmor("thiefChest", ArmorMaterial.DIAMOND, 1, "thiefChest");
	public static Item thiefLeggings = new ItemThiefArmor("thiefLeggings", ArmorMaterial.DIAMOND, 2, "thiefLeggings");
	public static Item thiefBoots = new ItemThiefArmor("thiefBoots", ArmorMaterial.DIAMOND, 3, "thiefBoots");
	
	public static Item tribalHelmet = new CustomSkullHelmet(ArmorMaterial.DIAMOND, 0, 0).setUnlocalizedName("tribalHelmet");
	public static Item tribalChest = new ItemSkullArmor("tribalChest", ArmorMaterial.DIAMOND, 1, "tribalChest");
	public static Item tribalLeggings = new ItemSkullArmor("tribalLeggings", ArmorMaterial.DIAMOND, 2, "tribalLeggings");
	public static Item tribalBoots = new ItemSkullArmor("tribalBoots", ArmorMaterial.DIAMOND, 3, "tribalBoots");
	
	public static void create() {
		System.out.println("Method for creating items");
		Helpers.registerItems(essence);
//		Helpers.registerItems(gem);
		Helpers.registerItems(hexDiamond);
		
		Helpers.registerItems(scaleHelmet);
		Helpers.registerItems(scaleBoots);
		Helpers.registerItems(scaleChest);
		Helpers.registerItems(scaleLeggings);
		
		Helpers.registerItems(thiefBoots);
		Helpers.registerItems(thiefChest);
		Helpers.registerItems(thiefHelmet);
		Helpers.registerItems(thiefLeggings);
		
		Helpers.registerItems(tribalBoots);
		Helpers.registerItems(tribalChest);
		Helpers.registerItems(tribalHelmet);
		Helpers.registerItems(tribalLeggings);
		
	}
	
	public static void registerItemRenderer() {
		Helpers.registerItemRendrer(essence, "essence");
//		Helpers.registerItemRendrer(gem, "gem");
		Helpers.registerItemRendrer(hexDiamond, "hexDiamond");
		Helpers.registerItemRendrer(scaleHelmet, "scaleHelmet");
		Helpers.registerItemRendrer(scaleBoots, "scaleBoots");
		Helpers.registerItemRendrer(scaleChest, "scaleChest");
		Helpers.registerItemRendrer(scaleLeggings, "scaleLeggings");
		Helpers.registerItemRendrer(thiefBoots, "thiefBoots");
		Helpers.registerItemRendrer(thiefChest, "thiefChest");
		Helpers.registerItemRendrer(thiefHelmet, "thiefHelmet");
		Helpers.registerItemRendrer(thiefLeggings, "thiefLeggings");
		Helpers.registerItemRendrer(tribalBoots, "tribalBoots");
		Helpers.registerItemRendrer(tribalChest, "tribalChest");
		Helpers.registerItemRendrer(tribalHelmet, "tribalHelmet");
		Helpers.registerItemRendrer(tribalLeggings, "tribalLeggings");
	}

}
