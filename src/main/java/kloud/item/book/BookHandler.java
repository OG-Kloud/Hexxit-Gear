package kloud.item.book;

import kloud.KG;
import kloud.boiler.item.book.Book;
import kloud.boiler.item.book.BookRegistry;
import net.minecraft.util.ResourceLocation;

public class BookHandler {
	
	
	private static final Book lore = new Book();
	public static final ResourceLocation loreBookResource = new ResourceLocation(KG.ID, "lorebook");
	
	
	public static void init() {
		lore.setAuthor("Kloudspace Productions");
		lore.setTitle("Legend of Exetria(WIP)");
		BookRegistry.registerBook(loreBookResource, lore);
		BookRegistry.addPage(loreBookResource, "It is said that a long time ago that blocksmiths\n" +
				"and shammens from the land of Exetria once infused\n " +
				"a precious gem with the mystical powers of the \n" +
				"Hexxical-Deity's. Many treasure hunters have searched for\n" +
				"the remnents of the anciant gems for centuries,\n" +
				"but to no avail there seems to be no evidence\n" +
				"that the knowlege prior will ever be recovered.\n");
		
		BookRegistry.addPage(loreBookResource, "Coming Soon!");
	}

	
}
