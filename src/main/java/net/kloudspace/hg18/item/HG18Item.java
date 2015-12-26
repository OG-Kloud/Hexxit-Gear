package net.kloudspace.hg18.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HG18Item extends Item{
	
	public HG18Item(String name) {
		super();
		
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

}
