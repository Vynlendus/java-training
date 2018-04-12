package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class TextEditor {

	public static void main(String[] args) {
		// Create variable for File Name and number of lines.
		String fn = "";
		int lines = 0;
		
		// Print instructions
		System.out.print("Enter your file name: ");
		
		// Instantiate a new scanner
		Scanner sc = new Scanner(System.in);
		
		// Set fn equal to the next line provided by the scanner.
		fn = sc.nextLine();

		
		// Create a new file in Java with the provided file name
		File file = new File(fn);
		
		// Attempt to run the following code
		try {
			
			// Create a new LineNumberReader
			LineNumberReader ln = new LineNumberReader(new FileReader(file));
			
			// Skip to the last character in the page.
			ln.skip(Long.MAX_VALUE);
			
			// Set lines equal to the line number of the last character and close the line reader.
			lines = ln.getLineNumber() + 1;
			ln.close();
		} catch (FileNotFoundException e) {
			
			// If the file provided is not found, print that it is not found and provide error information
			System.out.println("ERROR: File not found: " + fn);
			e.printStackTrace();
		} catch (IOException e) {
			
			// If the file provided cannot be read, print that it cannot be read and provide error information 
			System.out.println("ERROR: Cannot read file: " + fn);
			e.printStackTrace();
		}
		
		// Create a new array with an open value for every line.
		String[] txt = new String[lines];
		
		try {
			
			// Create a new BufferedReader to read each line provided in the new FileReader. FileReader should read the provided file.
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			// If the file is empty, provide throw an exception stating that the file is empty and close the BufferedReader
			if(lines == 0) {
				br.close();
				throw new NoLinesException(lines);
			}
			
			// Assign each element in txt the String from your provided file and print it to the console.
			for(int i=0; i<txt.length; i++) {
				txt[i] = br.readLine();
				System.out.println((i+1) + " " + txt[i]);
			}
			
			// Close the BufferedReader
			br.close();
			
		} catch (FileNotFoundException e) {
			
			
			// Error catching, similar to above.
			System.out.println("ERROR: File not found: " + fn);
			e.printStackTrace();
		} catch (NoLinesException e) {
			System.out.println("ERROR: The file ''" + fn + "'' is empty.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Cannot read file: " + fn);
			e.printStackTrace();
		}
		// Print instructions
		System.out.print("Line to edit (number): ");
		
		// Create int en and assign it to the provided int from user input
		// Created String SEN to store the int that you want to use in a String, and then parse the Int from Integer.parseInt due to a bug in java
		String sen = sc.nextLine();
		int en = Integer.parseInt(sen);
		// close the scanner
		
		try {
			// Open a new FileWriter to edit the provided file
			FileWriter fw = new FileWriter(file);
			Scanner asd = new Scanner(System.in);
			
			// Print instructions
			System.out.print("New message: ");
			
			// Assign message to the user provided input
			String msg = sc.nextLine();
			
			for(int i=0;i<txt.length;i++) {
				if(i == en-1) {
					fw.write(msg + "\n");
				} else if (i==txt.length-1){
					fw.write(txt[i]);
				} else {
					fw.write(txt[i] + "\n");
				}
			}
			fw.close();
			asd.close();
			
		} catch (IOException e) {
			System.out.println("ERROR: File not found: " + file);
			e.printStackTrace();
		}
		sc.close();
		
		
	}
}

class NoLinesException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4097387270626819683L;
	int lines = 0;
	
	NoLinesException(int lines) {
		this.lines = lines;
	}
}
