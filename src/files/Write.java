package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// 1. Define the file path that we want to write to.
		String filename = "C:\\Users\\Vynle\\Desktop\\JavaWrite.txt";
		String message = "I am writing data that will be placed in a file";
		
		// 2. Create the file in Java
		File file = new File(filename);
		
		// 3. Open the file
		try {
			FileWriter fw = new FileWriter(file);
			
			// 4. Write to the file
			fw.write(message);
			
			// 5. Close the resources
			fw.close();
		} catch (IOException e) {
			System.out.println("ERORR: Could not modify file: " + filename);
			e.printStackTrace();
		} finally { 
			System.out.println("Closing the File Writer");
		}
		

	}

}
