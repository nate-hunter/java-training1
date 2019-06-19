package datastructures;

import java.util.Arrays;

public class ArrayLecture {

	public static void main(String[] args) {
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g"};
		
		System.out.println("For Loop (Hardcoded):");
		// For loop (hardcoded)
		for(int i = 0; i < 5; i++){
			System.out.print(alphabet[i] + ", ");
		}
		
		System.out.println("\n\nFor Loop:");
		
		// For loop 
		for(int j = 0; j < alphabet.length; j++){
			System.out.print(alphabet[j] + ", ");
		}
		
		System.out.println("\n\nFor-Each Loop:");
		
		// For-Each loop
		for(String letter : alphabet){
			System.out.print(letter + ", ");
		}
		
		System.out.println("\n\nArray Class: " + Arrays.toString(alphabet));
		
		System.out.println("\n\nFor-Each Loop, double array:");
		
		String[][] users = {
				{"Jon", "Williams", "jw@test.com", "brown"},
				{"Sara", "Owl", "os@test.com", "white"},
				{"Panda", "Boogie", "pb@test.com", "pink"}
		};
		
		for (int u = 0; u < users.length; u++){
			System.out.print("[ ");
			for (int p = 0; p < users[0].length; p++){
				System.out.print(users[u][p] + ", ");
			}
			System.out.println(" ]");
		}
		
		System.out.println("\nFor-Each Loop, double array:");
		
		for (String[] user : users){
			System.out.print("[ ");
			for (String element : user ) {
				System.out.print(element + " | ");
			}
			System.out.println(" ]");

		}
	}

}
