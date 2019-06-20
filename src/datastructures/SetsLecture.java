package datastructures;

import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsLecture {

	public static void main(String[] args) {
		// 1. Define the collection
		Set<String> animals = new TreeSet<String>();	
		// HashSet 			-> returned in random order
		// LinkedHashSet	-> returned in order they were entered
		// TreeSet			-> returned in alphabetical order
		
		// 2. Add elements
		animals.add("panda");
		animals.add("dog");
		animals.add("monkey");
		animals.add("shark");
		animals.add("beaver");
		
//		System.out.println(animals.size() + " " + animals);	// HashSet is random order
		
		animals.add("monkey");
		animals.add("pig");
		animals.add("shark");
		
		System.out.println(animals.size() + " " + animals);
		
		// Create a new set that can be used for comparison
		Set<String> farmAnimals = new HashSet<String>();
		
		farmAnimals.add("chicken");
		farmAnimals.add("cow");
		farmAnimals.add("horse");
		farmAnimals.add("pig");
		farmAnimals.add("dog");
		
		// What is the INTERSECTION of animals and farmAnimals?				-AND-
		// 1. Copy existing set into a new set
		Set<String> intersectedSet = new HashSet<String>(animals); // either animals or farmAnimals can be passed into constructor
		System.out.println(animals.size() + " " + intersectedSet);
		
		// 2. Retain only the elements that are shared by the (2) sets
		intersectedSet.retainAll(farmAnimals);
		System.out.println("INTERSECTION: " + intersectedSet);
		
		// What is the UNION? (will take all unique values, not copies)		-OR-
		Set<String> unionAnimals = new HashSet<String>(farmAnimals);
		unionAnimals.addAll(animals);
		System.out.println("UNION: " + unionAnimals);

		// What is the DIFFERENCE between the two sets? 					-NOT-
		Set<String> differentAnimals = new HashSet<String>(animals);
		differentAnimals.removeAll(farmAnimals);
		System.out.println("DIFFERENCE: " + differentAnimals);
	}

}
