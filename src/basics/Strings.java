package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if(bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word ring.");
		}
		
		String browser = "ChRoMe";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Ryan";
		String lastName = "McKenna";
		String SSN = "1927397";
		
		System.out.println("There are "  + SSN.length() + " digits in your SSN");
		
		// Print initials + last four digits of SSN
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		System.out.println(SSN.substring(SSN.length()-4, SSN.length()));
		
	}

}
