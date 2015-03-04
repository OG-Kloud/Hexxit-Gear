package net.kloudspace.kloudgear.item.armor;

import net.kloudspace.kloudgear.KloudGear;
import net.kloudspace.kloudgear.init.ModItems;
import net.kloudspace.kloudgear.util.Reference;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CustomSkullHelmet extends ItemArmor {
	
	public CustomSkullHelmet(ArmorMaterial armorMaterial, int arg1, int arg2) {
		super(armorMaterial, arg1, arg2);
		
	}
	
	@Override 
	@SideOnly(Side.CLIENT) 
	public void registerIcons(IIconRegister par1IconRegister) {
		String itemName = Reference.MODID + ":" + getUnlocalizedName(); 
		this.itemIcon = par1IconRegister.registerIcon(itemName); 
		}

	@Override 
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) { 
		if (stack.getItem() == ModItems.tribalHelmet) { 
			return Reference.MODID + ":armor/" + ModItems.tribalHelmet.getUnlocalizedName() + "_" + (this.armorType == 2 ? "2" : "1") +".png"; 
			} 
	//	if (stack.getItem() == ModItems.scaleLeggings) { 
	//		return ":armor/scaleLeggings_2"; 
	//			}
		return null; 
		} 
	
	@Override 
	@SideOnly(Side.CLIENT) 
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) { 
		ModelBiped armorModel = null;
		if (itemStack != null) {
			if(itemStack.getItem()instanceof CustomSkullHelmet) {
				int type = ((ItemArmor)itemStack.getItem()).armorType;
				if(type == 1||type == 3) {
					armorModel = KloudGear.proxy.getArmorModel(4);
				}
				else {
					armorModel = KloudGear.proxy.getArmorModel(5);
				}
			}
			if(armorModel != null){ 
				armorModel.bipedHead.showModel = armorSlot == 0; 
				armorModel.bipedHeadwear.showModel = armorSlot == 0; 
				armorModel.isSneak = entityLiving.isSneaking(); 
				armorModel.isRiding = entityLiving.isRiding(); 
				armorModel.isChild = entityLiving.isChild();  
				if(entityLiving instanceof EntityPlayer){ 
					armorModel.aimedBow =((EntityPlayer)entityLiving).getItemInUseDuration() > 2; 
					} 
				return armorModel; 
				}
			} 
		return null; 
		} 
}
