package net.kloudspace.kloudgear.items.armor;

import net.kloudspace.kloudgear.init.ModItems;
import net.kloudspace.kloudgear.init.ModTabs;
import net.kloudspace.kloudgear.item.armor.ItemHexArmor;
import net.kloudspace.kloudgear.model.ModelHoodHelmet;
import net.kloudspace.kloudgear.util.Reference;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemThiefArmor extends ItemHexArmor {
	
	public String textureName;
	
	public ItemThiefArmor(String unlocalizedName, ArmorMaterial material, int armorType, String name) {
		super(material, armorType, name);
		this.setUnlocalizedName(unlocalizedName);
		this.textureName = name;
		this.setCreativeTab(ModTabs.tabKloudGear);
		this.setTextureName(Reference.MODID + ":" + getUnlocalizedName());
	}
	

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
     //   if (slot == 0)
     //       return "/textures/maps/ScaleHelmet.png";
     //   else {
        	return Reference.MODID + ":armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") +".png";
        }
		
		//	return Reference.MODID + ":armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") +".png";
//	}

    @SideOnly(Side.CLIENT)
   // @Override
    public ModelBiped getArmorModel(EntityLiving entityLiving, ItemStack itemStack, int armorSlot) {
        if (armorSlot == 0)
            return new ModelHoodHelmet();
        return null;
    }
    
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
    if (player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ModItems.thiefLeggings)) {
    	if(player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(ModItems.thiefBoots)) {
    		if(player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(ModItems.thiefChest)) {
    			if(player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(ModItems.thiefHelmet)) {
  //      player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40));
    		        player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20, 0));
    		        player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 21 * 20, 0));
    		        player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 20, 2));
    		        player.addPotionEffect(new PotionEffect(Potion.jump.id, 20, 0));
    			}
    		}
    	}
    }
    
    }
}

