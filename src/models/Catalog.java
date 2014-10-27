package models;

import java.util.ArrayList;
import java.util.List;



public class Catalog {

	private static ArrayList<Gold> inventory = new ArrayList<Gold>();

	
	public static List<Gold> getList()
	{
		return inventory;
	}
	
	public static boolean add(Gold gold) {
		return inventory.add(gold);
	}
	
	public static Gold get(String type) {
		return inventory.get(inventory.indexOf(type));
	}
	
	public static boolean remove(Gold gold) {
		return inventory.remove(gold);
	}
	
	public static boolean remove(String type) {
		return remove(get(type));
	}
}
