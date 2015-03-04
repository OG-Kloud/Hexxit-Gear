package net.kloudspace.kloudgear.items.armor;

import net.kloudspace.kloudgear.KloudGear;
import net.kloudspace.kloudgear.init.ModItems;
import net.kloudspace.kloudgear.init.ModTabs;
import net.kloudspace.kloudgear.item.armor.ItemHexArmor;
import net.kloudspace.kloudgear.util.Reference;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemScaleArmor extends ItemHexArmor{
		
	public String textureName;
	
	public ItemScaleArmor(String unlocalizedName, ArmorMaterial material, int armorType, String name) {
		super(material, armorType, name);
		this.setUnlocalizedName(unlocalizedName);
		this.textureName = name;
		this.setCreativeTab(ModTabs.tabKloudGear);
		this.setTextureName(Reference.MODID + ":" + getUnlocalizedName());
	}
	

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
   //     if (slot == 0)
     //       return ;
      //  else {
        	return Reference.MODID + ":armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") +".png";
        }
		
		//	return Reference.MODID + ":armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") +".png";
//	}

    @SideOnly(Side.CLIENT)
   // @Override
    public ModelBiped getArmorModel(EntityLiving entityLiving, ItemStack itemStack, int armorSlot) {
    	ModelBiped armorModel = null;
    		if(itemStack != null) {
    			if(itemStack.getItem() instanceof ItemScaleArmor) {
    				
    			}
    		}
    		
    	int type =((ItemArmor)itemStack.getItem()).armorType;
    		if(type == 1 || type == 3) {
    			armorModel = KloudGear.proxy.getArmorModel(0);
    		}
    		else {
    			armorModel = KloudGear.proxy.getArmorModel(1);
    		}
//    	    if (armorSlot == 0)
//           return new ModelScaleHelm();
        return null;
    }
    
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
    if (player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ModItems.scaleLeggings)) {
    	if(player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(ModItems.scaleBoots)) {
    		if(player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(ModItems.scaleChest)) {
    			if(player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(ModItems.scaleHelmet)) {
  //      player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40));
        player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20, 0));
        player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20, 1));
        player.addPotionEffect(new PotionEffect(Potion.resistance.id, 20, 0));
    			}
    		}
    	}
    }
    
    }
    
    
    
    
    
    
}