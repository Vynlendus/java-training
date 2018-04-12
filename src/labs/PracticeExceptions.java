package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class PracticeExceptions {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your full file location (Must contain 50 lines): ");
		String fn = scanner.nextLine();
		scanner.close();
		int lines = 0;
		File file = new File(fn);
		try {
			// Create a Line Number Reader
			LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));
			
			lineNumberReader.skip(Long.MAX_VALUE);
			lines = lineNumberReader.getLineNumber() + 1;
			lineNumberReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: Cannot find the found: " + file);
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		  String[] txt = new String[lines];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			if(lines < 50) {
				br.close();
				throw new NotEnoughLinesException(lines);
			}
			System.out.println("Beginning of File");
			for(int i=0; i<txt.length; i++) {
				txt[i] = br.readLine();
				System.out.println("" + (i+1) + ": " + txt[i]);
			}
			br.close();
			System.out.println("End of File");
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: Cannot find the file: " + file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Cannot read from file: " + file);
			e.printStackTrace();
		} catch (NotEnoughLinesException e) {
			System.out.println("ERROR: Not enough lines.");
			e.printStackTrace();
		}
	
	}

}

class NotEnoughLinesException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7483930103986361516L;
	int count = 0;
	
	NotEnoughLinesException(int lines) { 
		this.count = lines;
	}
	
	public String toString() {
		return "Must be at least 50 lines. Provided: " + count;
	}

}