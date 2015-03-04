package net.kloudspace.kloudgear.items;

import net.kloudspace.kloudgear.init.ModTabs;
import net.kloudspace.kloudgear.util.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class KloudGearItem extends Item{
	
	public KloudGearItem() {
		super();
		setCreativeTab(ModTabs.tabKloudGear);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		
	}

}
