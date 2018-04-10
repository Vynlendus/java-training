package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		System.out.println(multiplyNumbers(numA, numB));
	}

	static void printName() {
		System.out.println("My name is Ryan");
	}
	
	static void addNumbers(int a, int b) { 
		// This function will add two numbers
		System.out.println(a + b);
	}
	
	static int multiplyNumbers(int a, int b) {
		return a*b; 
	}
	
}
