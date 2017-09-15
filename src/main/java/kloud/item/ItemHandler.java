package kloud.item;

import kloud.KG;
import kloud.boiler.item.IModelProvider;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(KG.ID)
public class ItemHandler {
	
	public static Item scaleHelm = new ScaleHelm(KG.ArmorMaterials.SCALE, 5,EntityEquipmentSlot.HEAD, "scalehelmet");
	public static Item scaleChest = new ScaleArmor(KG.ArmorMaterials.SCALE, 5, EntityEquipmentSlot.CHEST, "scalechest");
	public static Item scaleLegs = new ScaleArmor(KG.ArmorMaterials.SCALE, 5, EntityEquipmentSlot.LEGS, "scalelegs");
	public static Item scaleBoots = new ScaleArmor(KG.ArmorMaterials.SCALE, 5, EntityEquipmentSlot.FEET, "scaleboots");
	
	public static Item tribalHelm = new TribalHelm(KG.ArmorMaterials.BONE, 6, EntityEquipmentSlot.HEAD, "tribalhelmet");
	public static Item tribalChest = new ScaleArmor(KG.ArmorMaterials.BONE, 6, EntityEquipmentSlot.CHEST, "tribalchest");
	public static Item tribalLegs = new ScaleArmor(KG.ArmorMaterials.BONE, 6, EntityEquipmentSlot.LEGS, "triballegs");
	public static Item tribalBoots = new ScaleArmor(KG.ArmorMaterials.BONE, 6, EntityEquipmentSlot.FEET, "tribalboots");
	
	public static Item thiefHelm = new ThiefHelm(KG.ArmorMaterials.CLOTH, 6, EntityEquipmentSlot.HEAD, "thiefhelmet");
	public static Item thiefChest = new ThiefArmor(KG.ArmorMaterials.CLOTH, 6, EntityEquipmentSlot.CHEST, "thiefchest");
	public static Item thiefLegs = new ThiefArmor(KG.ArmorMaterials.CLOTH, 6, EntityEquipmentSlot.LEGS, "thieflegs");
	public static Item thiefBoots = new ThiefArmor(KG.ArmorMaterials.CLOTH, 6, EntityEquipmentSlot.FEET, "thiefboots");
	
	public static Item hexEssence = new KGItemGeneric("hexessence");
	public static Item hexDiamond = new KGItemGeneric("hexdiamond");
	public static Item hexibiscusItem = new ItemHexibiscus("hexibiscus");
	
	public static Item dummyItem = new Item().setRegistryName(KG.ID, "dummy");
	
	private static Item[] itemCollection = new Item[] {scaleHelm, scaleChest, scaleLegs, scaleBoots, tribalHelm, tribalChest,
			tribalLegs, tribalBoots, thiefHelm, thiefChest, thiefLegs, thiefBoots, hexEssence, hexDiamond, hexibiscusItem, dummyItem};
	
	
	@Mod.EventBusSubscriber
	public static class ModelHandler {
		@SubscribeEvent
		public static void registerAllModels(ModelRegistryEvent e) {
			final Item[] items = ItemHandler.itemCollection;
			
			for(Item item : items) {
				if(item instanceof IModelProvider) {
					((IModelProvider)item).registerItemModel(item);
				}
			}
		}
	}
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> e) {
//			Logger.info("Initializing Items...");
			
			final Item[] items = ItemHandler.itemCollection;
			
			IForgeRegistry<Item> registry = e.getRegistry();
			for(final Item item : items) {
				registry.register(item);
			}
			
		}
	}

}
