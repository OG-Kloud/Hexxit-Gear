package kloud.item;

import java.util.List;

import kloud.KG;
import kloud.utils.KGUtils;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class TribalHelm extends TribalArmor{
	
	private int count = 0;

	public TribalHelm(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String name) {
		super(materialIn, renderIndexIn, equipmentSlotIn, name);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return KG.ID + ":armor/skullhelm.png";
	}
	
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot,
			ModelBiped defaultModel) {
		
		ModelBiped armorModel = KG.proxy.getArmorModel(1);
		
		armorModel.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
		armorModel.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
		armorModel.bipedBody.showModel = (armorSlot == EntityEquipmentSlot.CHEST)
				|| (armorSlot == EntityEquipmentSlot.CHEST);
		armorModel.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
		armorModel.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
		armorModel.bipedRightLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS)
				|| (armorSlot == EntityEquipmentSlot.FEET);
		armorModel.bipedLeftLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS)
				|| (armorSlot == EntityEquipmentSlot.FEET);

		armorModel.isSneak = defaultModel.isSneak;
		armorModel.isRiding = defaultModel.isRiding;
		armorModel.isChild = defaultModel.isChild;
		armorModel.rightArmPose = defaultModel.rightArmPose;
		armorModel.leftArmPose = defaultModel.leftArmPose;
		
		return armorModel;
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		NonNullList<ItemStack> armors = player.inventory.armorInventory;
		for(ItemStack is : armors) {
			if(!is.isEmpty() && ((ItemArmor)is.getItem()).getArmorMaterial() == KG.ArmorMaterials.BONE) {
				count++;
			}
		}
		if(count == 4 && !player.world.isRemote) {
			List<PotionEffect> effects = KGUtils.getTribalEffects();
			for(PotionEffect pe : effects) {
				player.addPotionEffect(pe);
			}
		}
		count = 0;
	}

}
