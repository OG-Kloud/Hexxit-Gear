package kloud.item;

import kloud.KG;
import kloud.boiler.item.IModelProvider;
import net.minecraft.item.Item;

public class KGItemGeneric extends Item implements IModelProvider{
	
	private final String name;
	
	public KGItemGeneric(String n) {
		this.name = n;
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
	}

	@Override
	public void registerItemModel(Item item) {
		KG.proxy.registerItemRenderer(item, 0, this.name);
	}

}
