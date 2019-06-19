package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// 1. Create/Define a collection
		ArrayList<String> cities = new ArrayList<String>();
		
		// 2. Add elements
		cities.add("NYC");
		cities.add("Toronto");
		cities.add("Honolulu");
		cities.add("Chicago");
		
		// 3. Iterate through the collection
		for (String city : cities){
			System.out.println(city);
		}
		
		// 4. Get the size	
		int size = cities.size();
		System.out.println("There are " + size + " elements in the cities list.");
		
		// 5. Retrieve specific elements
		String element = cities.get(2);
		System.out.println("The got city is " + element);
		
		
		// 6. Remove a city
		String cityRemoved = cities.remove(1);
		System.out.println("City removed: " + cityRemoved + "\nSize now: " + cities.size());
		
	}

}
