package kloud;

import kloud.proxy.Common;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = KG.ID, name = KG.NAME, version = KG.VER)
public class KG {
	public static final String ID = "hexxitgear", NAME = "Hexxit Gear Revisited", VER = "x.y.z-1.12.1";
	
	@Mod.Instance
	public static KG instance;
	
	@SidedProxy(serverSide = "kloud.proxy.Common", clientSide = "kloud.proxy.Client")
	public static Common proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}
	
	
	public static class ArmorMaterials {
		public static final ArmorMaterial SCALE = EnumHelper.addArmorMaterial("SCALE", ID + ":scale", 1500, new int[]{3,5,4,2}, 
				20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);
		public static final ArmorMaterial BONE = EnumHelper.addArmorMaterial("TRIBAL", ":tribal", 1500, new int[]{3, 5, 4, 2},
				20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 5.0F);
		public static final ArmorMaterial CLOTH = EnumHelper.addArmorMaterial("THIEF", ":thief", 1500, new int[]{3, 5, 4, 2},
				20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 5.0F);
	}
	
	/*
	 *@SubscribeEvent
	public void login(PlayerLoggedInEvent e) {
		book = new Book("Kloud", "The Dawning");
		book.addPage("Welcome... to Modulation\nThe world of change is upon us.");
		ItemStack booklet = book.get();
		e.player.inventory.addItemStackToInventory(booklet);
	}*/

}
