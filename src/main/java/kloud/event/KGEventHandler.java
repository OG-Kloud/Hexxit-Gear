package kloud.event;

import kloud.boiler.item.book.BookRegistry;
import kloud.item.book.BookHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class KGEventHandler {

	@SubscribeEvent
	public void onEvent(LivingEquipmentChangeEvent e) {
		
	}
	
	@SubscribeEvent
	public void login(PlayerLoggedInEvent e) {
		EntityPlayer player = e.player;
		if(!player.inventory.hasItemStack(BookRegistry.getBooklet(BookHandler.loreBookResource)))
			player.addItemStackToInventory(BookRegistry.getBooklet(BookHandler.loreBookResource));
	}
	
}
