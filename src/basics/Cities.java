package basics;

public class Cities {
	
	public static void main(String[] args){
		// Declare and define an array (here we implicitly define the size)
		String[] cities = {"New York", "San Francisco", "Honolulu", "Boston"};
		System.out.println(cities[0]);
		
		// Declare and define an array (here we explicitly define the size)
		String[] states = new String[4]; // where [4] declares the size of the array.
		states[0] = "New York";
		states[1] = "California";
		states[2] = "Hawaii";
		states[3] = "Massachusetts";
		System.out.println(states[1]);
		
		// Declare an array
		String[] countries;
		
		// Define an array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Spain";
		countries[2] = "Portugal";
		System.out.println(countries[2]);
		
		System.out.println("++++++++++++");
		// Do loop: enters the loop THEN tests the condition
		int i = 0;
		do {
			System.out.println("From 'do' loop // " + cities[i]);
			i += 1;
		} while(i < cities.length);
		
		System.out.println("++++++++++++");
		// While loop: tests the condition first THEN enters the loop
		int j = 0;
		while (j < states.length) {
			System.out.println("From 'while' loop // " + states[j]);
			j++;
		}
		
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println("At state: " + state);
			if (state == "Hawaii") {
				System.out.println(state + " // STATE FOUND AT: " + n);
				System.out.println("Aloha");
				stateFound = true;
			}
			n++;
		}
		
		System.out.println("\n++++++++++++");
		// For loop: best structure for iterating through an array
		for (int x = 0; x < countries.length; x++) {
			System.out.println("From 'for' loop // " + countries[x]);
		}
		
	}

}
