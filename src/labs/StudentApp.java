package labs;

public class StudentApp {

	public static void main(String[] args) {
 	Student stu = new Student("Ryan", "971316481", 1000);
 	Student stu2 = new Student("John", "197318381", 2000);
	
	System.out.println(stu.toString());
	System.out.println(stu2.toString());
	stu.showCourses();
	}
}

class Student { 
	private static int id = 1;
	private String userID;
	private String name;
	private String ssn;
	private String email;
	private String state;
	private String city;
	private String phone;
	double balance;
	
	public Student(String name, String ssn, double initDeposit) {
		this.name = name;
		this.ssn = ssn;
		this.email = name + id + "@school.com";
		int random = (int) (Math.random() * 10000);
		this.userID = "" + id + random + ssn.substring(ssn.length() - 4, ssn.length());
		
		this.balance += initDeposit;
		id++;
	}
	
	public void enroll() {
		System.out.println("Congratulations, " + name + " you are now enrolled in school!");
	}
	
	public void pay(double amount) { 
		balance -= amount;
		System.out.println("You have paid: $" + amount);
		checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("[Balance: $" + balance + "]");
	}
	
	public void showCourses() { 
		System.out.print("Courses are: [Java] | [C++] | [Ruby] | [Python]");
		
	}
	
	
	// Getters and Setters
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void getPhone() { 
		System.out.println(phone);
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void getCity() { 
		System.out.println(city);
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void getState() { 
		System.out.println(state);
	}
	
	
	
	@Override
	public String toString() { 
		return "[" + name + "]\n[" + userID + "]\n[" + email + "]\n[" + balance + "]";
	}
	
}