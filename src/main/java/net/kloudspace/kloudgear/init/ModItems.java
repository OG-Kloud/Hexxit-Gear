package net.kloudspace.kloudgear.init;

import net.kloudspace.kloudgear.item.armor.CustomHoodHelmet;
import net.kloudspace.kloudgear.item.armor.CustomScaleHelmet;
import net.kloudspace.kloudgear.item.armor.CustomSkullHelmet;
import net.kloudspace.kloudgear.items.KloudGearItem;
import net.kloudspace.kloudgear.items.armor.ItemScaleArmor;
import net.kloudspace.kloudgear.items.armor.ItemSkullArmor;
import net.kloudspace.kloudgear.items.armor.ItemThiefArmor;
import net.kloudspace.kloudgear.util.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;


public class ModItems {
	
	
	public static Item hexicalEssence = new KloudGearItem().setUnlocalizedName("hexicalEssence");
	public static Item skullImage = new KloudGearItem().setUnlocalizedName("skullCap");
	public static Item hexicalDiamond = new KloudGearItem().setUnlocalizedName("hexicalDiamond");
	
	public static Item scaleHelmet = new CustomScaleHelmet(ArmorMaterial.DIAMOND, 0, 0).setUnlocalizedName("scaleHelmet").setCreativeTab(ModTabs.tabKloudGear);

	//public static Item scaleHelmet = new CustomArmor(ArmorMaterial.DIAMOND, 0, "scaleHelmet");
	public static Item scaleChest = new ItemScaleArmor("scaleChest", ArmorMaterial.DIAMOND, 1, "scaleChest");
	public static Item scaleLeggings = new ItemScaleArmor("scaleLeggings", ArmorMaterial.DIAMOND, 2, "scaleLeggings");
	public static Item scaleBoots = new ItemScaleArmor("scaleBoots", ArmorMaterial.DIAMOND, 3, "scaleBoots");
	
	public static Item thiefHelmet = new CustomHoodHelmet(ArmorMaterial.DIAMOND, 0).setUnlocalizedName("thiefHelmet").setCreativeTab(ModTabs.tabKloudGear);
//	public static Item thiefHelmet = new CustomHoodHelmet(ArmorMaterial.DIAMOND, 0, "thiefHelmet");
	public static Item thiefChest = new ItemThiefArmor("thiefChest", ArmorMaterial.DIAMOND, 1, "thiefChest");
	public static Item thiefLeggings = new ItemThiefArmor("thiefLeggings", ArmorMaterial.DIAMOND, 2, "thiefLeggings");
	public static Item thiefBoots = new ItemThiefArmor("thiefBoots", ArmorMaterial.DIAMOND, 3, "thiefBoots");
	
	public static Item tribalHelmet = new CustomSkullHelmet(ArmorMaterial.DIAMOND, 0, 0).setUnlocalizedName("tribalHelmet").setCreativeTab(ModTabs.tabKloudGear);
	public static Item tribalChest = new ItemSkullArmor("tribalChest", ArmorMaterial.DIAMOND, 1, "tribalChest");
	public static Item tribalLeggings = new ItemSkullArmor("tribalLeggings", ArmorMaterial.DIAMOND, 2, "tribalLeggings");
	public static Item tribalBoots = new ItemSkullArmor("tribalBoots", ArmorMaterial.DIAMOND, 3, "tribalBoots");
	
	
	public static void init() {
		RegisterHelper.registerItems(hexicalEssence);
		RegisterHelper.registerItems(skullImage);
		RegisterHelper.registerItems(hexicalDiamond);
		
		RegisterHelper.registerItems(scaleHelmet);
		RegisterHelper.registerItems(scaleChest);
		RegisterHelper.registerItems(scaleLeggings);
		RegisterHelper.registerItems(scaleBoots);
		
		RegisterHelper.registerItems(thiefHelmet);
		RegisterHelper.registerItems(thiefChest);
		RegisterHelper.registerItems(thiefLeggings);
		RegisterHelper.registerItems(thiefBoots);
		
		RegisterHelper.registerItems(tribalHelmet);
		RegisterHelper.registerItems(tribalChest);
		RegisterHelper.registerItems(tribalLeggings);
		RegisterHelper.registerItems(tribalBoots);
		
	}

}
