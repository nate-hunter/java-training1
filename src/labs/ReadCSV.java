package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// Read data from a CSV file
		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\Java-nh\\Files\\accounts.csv";
		File file = new File(filename);
		
		String dataRow;
		
		try {
			// Open file
			BufferedReader reader = new BufferedReader(new FileReader(file)); // filename works too, why use File then?
			
			// Read data as long is it is not empty
			while((dataRow = reader.readLine()) != null) {
				// Parse the data by commas
				String[] line = dataRow.split(",");
				
				// Add the data (line) to the collection (data)
				data.add(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for( String[] account : data ) {
			for(String field : account ) {
				System.out.print(" | " + field);
			}
			System.out.println(" | ");
		}

	}

}
