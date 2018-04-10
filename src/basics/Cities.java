package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		// Declare array
		String[] countries;
		
		// Define array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[1]);
		
		System.out.println("*********************");
		
		// Declare the array
		String[] states = new String[5];
		states[0] = "Calfornia";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		
		// Do Loop: Enters the loop and then tests the condition. Code is run at least once.
		do {
			System.out.println("STATE: " + states[i]);
			i++;
		} while(i < states.length);
		
		
		// While Loop: Checks the condition and then runs the code if the condition is true.
		int n = 0;
		boolean stateFound = false;
		
		while (!stateFound) {
			String state = states[n];
			if(state.equals("Texas")) {
				System.out.println("STATE FOUND");
				stateFound = true;
			}
			n++;
		}
		
		// For Loop: Best structure for iterating through an array
		for(int x=0; x<states.length; x++) {
			System.out.println("STATE: " + states[x]);
		}
	}
}
