package programsproject;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlingException {

	public static void main(String[] args) {

		        try {
		            readFile();
		        } catch (FileNotFoundException e) {
		            System.out.println("File not found: " + e.getMessage());
		        }
		    }
		    
		    static void readFile() throws FileNotFoundException {
		        try {
		            FileReader fileReader = new FileReader("example.txt");
		            // Perform file operations
		        } catch (FileNotFoundException e) {
		            throw e; // Propagate the exception
		        }
		    }
		}

			