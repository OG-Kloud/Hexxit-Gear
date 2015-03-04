package net.kloudspace.kloudgear.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class KloudTab extends CreativeTabs{
	
	String name;
	public KloudTab(int par1, String par2Str) {
		super(par1,par2Str);
		this.name =par2Str;
		
	}
	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		if (this.name =="tabKloud") {
			return ModItems.skullImage;
		} /*else if (this.name == "tabKloudTest") {
			return ModStructureItems.spawnAbandonHouse;
		}
		*/
		return null;
	}


}
