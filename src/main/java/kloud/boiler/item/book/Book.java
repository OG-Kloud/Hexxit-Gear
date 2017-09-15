package kloud.boiler.item.book;

import java.util.ArrayList;
import java.util.List;

import kloud.utils.KGLogger;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class Book {
	
	private List<String> pages;
	private String author;
	private String title;
	
	public Book(){
		this.pages = new ArrayList<String>();
	}
	
	public Book(String author, String title){
		this.pages = new ArrayList<String>();
		this.author = author;
		this.title = title;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void addPage(String page){
		if(page == null | page.isEmpty()) return;
		KGLogger.log("pageLength : " + page.length(), true);
		if(page.length() > 220) {
			for(int i = 0; i < page.length(); i+=220) {
				pages.add(page.substring(i, (i + (page.length()-i>220 ? 220 : page.length()-i))));
			}
		} else this.pages.add(page);
	}
	
	public ItemStack get(){
		ItemStack book = new ItemStack(Items.WRITTEN_BOOK, 1);
		
		NBTTagList nbtPages = new NBTTagList();
		
		for(String page : this.pages){
			ITextComponent text = new TextComponentString(page);
			String json = ITextComponent.Serializer.componentToJson(text);
			NBTTagString nbtPage = new NBTTagString(json);
			nbtPages.appendTag(nbtPage);
		}
		
		book.setTagInfo("pages", nbtPages);
		book.setTagInfo("author", new NBTTagString(this.author == null ? "Anonymous" : this.author));
		book.setTagInfo("title", new NBTTagString(this.title == null ? "Book" : this.title));
		
		
		return book;
	}


}
