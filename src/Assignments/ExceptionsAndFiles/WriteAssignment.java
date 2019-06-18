package Assignments.ExceptionsAndFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAssignment {

	public static void main(String[] args) {
		String filename = "C:\\Java-nh\\Files\\AssignmentFile.txt";
		String data = "*as=Hdflv\n7234243&*\n{=5Y9Y7qo\nY1{4?9Tff\n05-;4uLZb\nUnN\n72V$V5jn%\n58.,3USfv\n3{5;9OCnd\n:Q%85pGi1\n/?92QL4sp\n(%6PiX61p\n295+_OIun";
		System.out.println(data);
		
		File file = new File(filename);
		
		try {
			FileWriter writer = new FileWriter(file);
			writer.write(data);
			writer.close();
		} catch (IOException e) {
			System.out.println("ERROR: Could not write file: " + filename);
			e.printStackTrace();
		}	
	}
}
