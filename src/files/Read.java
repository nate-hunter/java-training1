package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
	public static void main(String[] args){
		
		String text = null;
		
		// 1. Define the file (path) that we want to read
		String filename = "C:\\Java-nh\\Files\\FileToRead.txt";
		
		// 2. Create the file in Java
		File file = new File(filename);
		
		try {
			// 3. Open the file
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			// 4. Read the file
			text = reader.readLine();
			
			// 5. Close the resources
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the data: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file");
		}
		
		System.out.println(text);
		
	}
}
