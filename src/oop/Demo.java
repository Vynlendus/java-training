package oop;

class Person { 
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "Joe@email.net";
		person1.phone = "+979321654";
		
		// Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
		/* Person-
		
		// Attributes, variables, adjectives, descriptors.
		String name = "Ryan";
		String email = "vynlendus@gmail.com";
		String phone = "5551055195";

		// Action, activity, behavior
		// System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		// What if we wanted to do this for another person?
		String name2 = "John";
		String email2 = "john@gmail.com";
		String phone2 = "5551094851";

		// Action, activity, behavior
		// System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
		
		// What about binding attributes and properties together?
		
		
	}
	
	// Enhance by adding functions to minimize code
	
	static void walking(String name) {
		System.out.println(name + " is walking");
	*/
	}
	

}
