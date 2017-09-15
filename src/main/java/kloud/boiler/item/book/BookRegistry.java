package kloud.boiler.item.book;

import java.util.HashMap;
import java.util.Map;

import kloud.utils.KGLogger;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class BookRegistry {
	
private static Map<ResourceLocation, Book> bookRegistry = new HashMap<ResourceLocation, Book>();
	
	/**Be sure to null check*/
	public static Book getBook(ResourceLocation resLoc) {
		return bookRegistry.get(resLoc);
	}
	
	public static Book registerBook(ResourceLocation resLoc, Book book) {
		return BookRegistry.bookRegistry.put(resLoc, book);
	}
	
	public static ResourceLocation createResourceLocation(String modid, String resLoc) {
		return new ResourceLocation(modid, resLoc);
	}
	
	private static Book addPage(ResourceLocation resLoc, Book book, String page) {
		if(book == null) KGLogger.log("Tried to add a page to a book that does not exsist", true);
		book.addPage(page);
		return BookRegistry.saveBook(resLoc, book);
	}
	
	private static Book saveBook(ResourceLocation resLoc, Book book) {
		return BookRegistry.bookRegistry.replace(resLoc, book);
	}

	public static Book addPage(ResourceLocation resLoc, String page) {
		return addPage(resLoc, BookRegistry.exsists(resLoc) ? BookRegistry.getBook(resLoc) : null, page);
	}
	
	private static boolean exsists(ResourceLocation resLoc) {
		return BookRegistry.bookRegistry.containsKey(resLoc);
	}
	
	public static Book addPages(ResourceLocation resLoc, String...pages) {
		Book book = BookRegistry.getBook(resLoc);
		for(String page : pages) {
			book = addPage(resLoc, page);
		}
		return saveBook(resLoc, book);
	}
	
	public static ItemStack getBooklet(ResourceLocation resLoc) {
		Book book = BookRegistry.getBook(resLoc);
		if(book == null) return null;
		ItemStack booklet = book.get();
		return booklet;
	}
	
	
	
	
	/**
	 *	book = new Book("Kloud", "The Dawning");
		book.addPage("Welcome... to Modulation\nThe world of change is upon us.");
		ItemStack booklet = book.get();
		e.player.inventory.addItemStackToInventory(booklet);*/
	
	
	

}
