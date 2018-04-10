package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		// Create a variable defining our career
		
		// Declare a variable
		String career;
		System.out.println("Program is starting");
		
		// Defined a variable
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		// Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Web Developer";
		
		double salary = rate * hoursPerWeek * weeksPerYear;
		
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
		
		// Compute our salary
		// rate * hoursPerWeek * weeksPerYear
		
	}

}
