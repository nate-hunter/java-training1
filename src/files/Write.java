package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// 1. Define the path that we want to write
		String filename = "C:\\Java-nh\\Files\\FileToWrite.txt";
		String message = "This data will be placed in the file to write file";
		
		
		// 2. Create the file in Java
		File file = new File(filename);
		
		try {
			// 3. Open the file
			FileWriter writer = new FileWriter(file);

			// 4. Write to the file
			writer.write(message);
			
			// 5. Close the resources
			writer.close();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the filewriter");
		}
		
		

	}

}
