package oops.designPatterns.prototype;


import java.util.HashMap;
import java.util.Map;

import oops.designPatterns.prototype.items.Book;
import oops.designPatterns.prototype.items.Item;
import oops.designPatterns.prototype.items.Movie;

//Singleton
public class Registry {

	private static Map<String, Item> items = new HashMap<String, Item>();
	
	private static Registry registeryInstance = new Registry();
	
	private Registry() {
		loadItems();
	}
	
	public Item createItem (String type) {
		Item item = null;
		
		try {
			item = (Item)(items.get(type)).clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}
	
	private static void loadItems() {
		Movie artmovie = new Movie();
		artmovie.setTitle("Basic Movie");
		artmovie.setPrice(24.99);
		artmovie.setRuntime("2 hours");
		items.put("ArtMovie", artmovie);
		
		Movie shortMovies = new Movie();
		shortMovies.setTitle("Basic Movie");
		shortMovies.setPrice(24.99);
		shortMovies.setRuntime("2 hours");
		items.put("ShortMovie", shortMovies);
		
		Book book = new Book();
		book.setNumberOfPages(335);
		book.setPrice(19.99);
		book.setTitle("Basic Book");
		items.put("Book", book);
	}

	public static Registry getInstance() {
		// TODO Auto-generated method stub
		if(registeryInstance==null)
		{
			registeryInstance = new Registry();
		}
		return registeryInstance;
	}
}
