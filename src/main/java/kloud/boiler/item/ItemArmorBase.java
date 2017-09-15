package kloud.boiler.item;

import kloud.KG;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemArmorBase extends ItemArmor implements IModelProvider{
	
	protected final String name;

	public ItemArmorBase(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String name) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.name = name;
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
	}

	@Override
	public void registerItemModel(Item item) {
		KG.proxy.registerItemRenderer(item, 0, this.name);
	}

	@Override
	public ItemArmorBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		super.onArmorTick(world, player, itemStack);
	}
	
	

	
	
	

}
