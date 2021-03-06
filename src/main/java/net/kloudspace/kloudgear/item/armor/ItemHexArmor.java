package net.kloudspace.kloudgear.item.armor;

import net.kloudspace.kloudgear.init.ModItems;
import net.kloudspace.kloudgear.init.ModTabs;
import net.kloudspace.kloudgear.items.armor.ItemScaleArmor;
import net.kloudspace.kloudgear.util.Reference;
import net.kloudspace.kloudgear.util.core.buff.IBuffHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemHexArmor extends ItemArmor{
	
	private IBuffHandler buffHandler;
	
	
	public ItemHexArmor(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabKloudGear);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == ModItems.scaleHelmet || stack.getItem() == ModItems.scaleChest || stack.getItem() == ModItems.scaleBoots) {
			return Reference.MODID + ":modles/armor/scale_layer1";
		}
		else if (stack.getItem() == ModItems.scaleLeggings) {
			return Reference.MODID + ":modles/armor/scale_layer2";
		}
		else {
			return null;
		}
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		
		if(player.getActivePotionEffects().contains(Potion.damageBoost.id) && this instanceof ItemScaleArmor) {
		    ItemStack[] armor = new ItemStack[] {
		    		new ItemStack(ModItems.scaleBoots),
		    		new ItemStack(ModItems.scaleChest),
		    		new ItemStack(ModItems.scaleLeggings),
		    		new ItemStack(ModItems.scaleHelmet)
		    		}; //Create a new itemstack with each piece of your armor
		int gearCounter = 0;
		for(int i = 1; i < 5; i++) {
		     if(player.getEquipmentInSlot(i) == armor[i]) {
		        gearCounter++;
		     }
		}
		if(gearCounter == 3) {
		    player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20, 0));
		    player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20, 1));
		    player.addPotionEffect(new PotionEffect(Potion.resistance.id, 20, 0));
		    gearCounter = 0;
		}
	
		/*
		if(net.kloudspace.kloudgear.util.core.ability.ArmorSet.armorSet == true) {
			if(net.kloudspace.kloudgear.util.core.ability.ArmorSet.scaleArmorSet == true) {
	        player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20, 0));
	        player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20, 1));
	        player.addPotionEffect(new PotionEffect(Potion.resistance.id, 20, 0));
		}
		else if(net.kloudspace.kloudgear.util.core.ability.ArmorSet.thiefArmorSet == true) {
	        player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20, 0));
	        player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 21 * 20, 0));
	        player.capabilities.setPlayerWalkSpeed(0.15F);
	        player.jumpMovementFactor = player.capabilities.getWalkSpeed() * 0.5F;
		}
		else if(net.kloudspace.kloudgear.util.core.ability.ArmorSet.tribalArmorSet) {
	        player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20, 0));
	        player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 21 * 20, 0));
	        player.addPotionEffect(new PotionEffect(Potion.jump.id, 2 * 20, 2));
		}
			
		else { System.out.println("Error");
	}
	
	*/
	/*
			 //    	player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40));
				}
*/
		}
	}
}
