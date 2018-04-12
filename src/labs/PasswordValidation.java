package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordValidation {

	public static void main(String[] args) {
		String filename = "C:\\Users\\Vynle\\Desktop\\PasswordValidation.txt";
		String[] pws = new String[17];
		File file = new File(filename);
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			for(int i=0; i<pws.length; i++) {
				pws[i] = br.readLine();
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file");
			e.printStackTrace();
		}
		
		for(String pw : pws) {
			System.out.println(pw);
			boolean hasLetter = false;
			boolean hasNumber = false;
			boolean hasSpecial = false;
			
			for(int i=0; i<pw.length(); i++) {
				if("abcdefghijklmnopqrstuvwxyz".contains(pw.substring(i, i+1))) {
					hasLetter = true;
				} else if("1234567890".contains(pw.substring(i, i+1))) {
					hasNumber = true;
				} else if("`~!@#$%^&*()-=_+;':,./<>?|".contains(pw.substring(i, i+1))) {
					hasSpecial = true;
				}
 				
			}
			
			try {
				if(!hasLetter) {
					throw new NoLetterException(pw);
				}
				if(!hasNumber) {
					throw new NoNumberException(pw);
				}
				if(!hasSpecial) {
					throw new NoSpecialException(pw);
				}
			} catch (NoLetterException e) {
				System.out.println("ERROR: Password requires a letter.");
				e.toString();
			} catch (NoNumberException e) {
				System.out.println("ERROR: Password requires a number");
				e.toString();
			} catch (NoSpecialException e) {
				System.out.println("ERROR: Password requires a special character");
				e.toString();
			}
			// Seperator
			System.out.println("----");
		}
	}

}


class NoSpecialException extends Exception {
	String pass;
	
	NoSpecialException(String pass) {
		this.pass = pass;
	}
	
	public String toString() {
		return "NoSpecialException: Password does not contain a special character - " + pass;
	}
}

class NoNumberException extends Exception {
	String pass;
	
	NoNumberException(String pass) {
		this.pass = pass;
	}
	
	public String noNumberException() {
		return "NoLetterException: Password does not contain a special character - " + pass;
	}
}

class NoLetterException extends Exception {
	String pass;
	
	NoLetterException(String pass) {
		this.pass = pass;
	}
	
	public String toString() {
		return "NoLetterException: Password does not contain a special character - " + pass;
	
	}
}
