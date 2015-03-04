package net.kloudspace.kloudgear.util.core.ability;

import net.kloudspace.kloudgear.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ArmorSet {
	
	public static Boolean armorSet;
	public static Boolean scaleArmorSet;
	public static Boolean thiefArmorSet;
	public static Boolean tribalArmorSet;
	
	
	public ArmorSet	(EntityPlayer player) {
		ItemStack stack = null;
		if(player.getCurrentArmor(1) != null) {
			if(player.getCurrentArmor(1).getItem().equals(ModItems.scaleChest)){
				if (player.getCurrentArmor(0) != null) {
					if (player.getCurrentArmor(0).getItem().equals(ModItems.scaleHelmet)) {
		if(player.getCurrentArmor(2) != null) {
			if(player.getCurrentArmor(2).getItem().equals(ModItems.scaleLeggings)){
				if(player.getCurrentArmor(3) != null) {
					if (player.getCurrentArmor(4).getItem().equals(ModItems.scaleBoots)) {
						this.scaleArmorSet = true;
					}
				}
			}
		}
					}
				}
			}
		}
		
		if(player.getCurrentArmor(1).getItem().equals(ModItems.tribalChest)){
			if (player.getCurrentArmor(0) != null) {
				if (player.getCurrentArmor(0).getItem().equals(ModItems.tribalHelmet)) {
	if(player.getCurrentArmor(2) != null) {
		if(player.getCurrentArmor(2).getItem().equals(ModItems.tribalLeggings)){
			if(player.getCurrentArmor(3) != null) {
				if (player.getCurrentArmor(4).getItem().equals(ModItems.tribalBoots)) {
					this.tribalArmorSet = true;
				}
			}
		}
	}
				}
			}
		}
		
		if(player.getCurrentArmor(1).getItem().equals(ModItems.thiefChest)){
			if (player.getCurrentArmor(0) != null) {
				if (player.getCurrentArmor(0).getItem().equals(ModItems.thiefHelmet)) {
	if(player.getCurrentArmor(2) != null) {
		if(player.getCurrentArmor(2).getItem().equals(ModItems.thiefLeggings)){
			if(player.getCurrentArmor(3) != null) {
				if (player.getCurrentArmor(4).getItem().equals(ModItems.thiefBoots)) {
					this.thiefArmorSet = true;
				}
			}
		}
	}
				}
			}
		}
	}
	
	public static void checkArmorSet() {
		if(thiefArmorSet == true) {
			armorSet = true;
		}
		else if(scaleArmorSet == true) {
			armorSet = true;
		}
		else if(thiefArmorSet == true) {
			armorSet = true;
		}
		else {
			armorSet = false;
		}
	}

}
