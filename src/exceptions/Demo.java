package exceptions;

public class Demo {

	// Main method also causes an error due to calling doMath, which calls answer, which is dividing by zero, therefore creating an erorr.
	public static void main(String[] args) {
		System.out.println("Program Starts");
		doMath(12, 0);
		System.out.println("Program Continues");
	}
	
	// This method uses Answer to provide the results the provided numbers, and also causes an error due to division by 0.
	public static void doMath(int a, int b) {
		answer(a,b);
	}
	
	// Error occurs here when dividing by zero.
	public static double answer(int x, int y) {
		// Catch error here.
		return x / y;
	}

}
