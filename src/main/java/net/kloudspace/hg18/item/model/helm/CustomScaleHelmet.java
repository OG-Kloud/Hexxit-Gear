package net.kloudspace.hg18.item.model.helm;

import net.kloudspace.hg18.HG18;
import net.kloudspace.hg18.item.HG18Items;
import net.kloudspace.hg18.util.HG18Reference;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CustomScaleHelmet extends ItemArmor{
	
//	public int type;
	
	public CustomScaleHelmet(ArmorMaterial armorMaterial, int arg1, int arg2) {
		super(armorMaterial, arg1, arg2);
//		this.type = Reference.scale;
	}
/*	
	@Override 
	@SideOnly(Side.CLIENT) 
	public void registerIcons(IIconRegister par1IconRegister) {
		String itemName = HG18Reference.MODID + ":" + getUnlocalizedName(); 
		this.itemIcon = par1IconRegister.registerIcon(itemName); 
		}
*/
	@Override 
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) { 
		if (stack.getItem() == HG18Items.scaleHelmet) { 
			return HG18Reference.modid + ":armor/" + HG18Items.scaleHelmet.getUnlocalizedName() + "_" + (this.armorType == 2 ? "2" : "1") +".png"; 
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
			if(itemStack.getItem()instanceof CustomScaleHelmet) {
				int type = ((ItemArmor)itemStack.getItem()).armorType;
				if(type == 1||type == 3) {
					armorModel = HG18.proxy.getArmorModel(0);
				}
				else {
					armorModel = HG18.proxy.getArmorModel(1);
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
