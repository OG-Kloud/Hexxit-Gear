package kloud.item;

import kloud.KG;
import kloud.boiler.item.ItemArmorBase;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ScaleArmor extends ItemArmorBase{

	public ScaleArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String name) {
		super(materialIn, renderIndexIn, equipmentSlotIn, name);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return KG.ID + ":armor/" + ResourceLocation.splitObjectName(stack.getItem().getRegistryName().toString())[1] + ".png";
	}
	
}
