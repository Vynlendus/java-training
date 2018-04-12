package datastructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		// A loop that will only work if the array is larger than the provided size.
		System.out.println("Static array");
		for(int i=0; i < 5; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
		
		// A loop that will print the entire array regardless of size.
		System.out.println("\n\nDynamic Array");
		int size = alphabet.length;
		for(int i=0; i<size; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
		// A For Each loop that will print the entire array
		System.out.println("\n\nFor-Each Array");
		for(String letter : alphabet) {
			System.out.print(letter + " ");
		}
		
		// Traversing multi-dimensional arrays
		System.out.println("\n\nMulti-Dimensional Arrays");
		String[][] users = { 
				{"John", "Williams", "jw@test.net", "28103781238"},
				{"Sarah", "Jackson", "sj@test.net", "17237919237"},
				{"Rachel", "Wallace", "rw@test.net", "127391723913"}
		};
		// Get the size of the array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number of users: " + numOfUsers);
		System.out.println("Number of fields: " + numOfFields);
		
		//Traversing the arrays with no knowledge
		
		for(int i=0; i<numOfUsers; i++) {
			for(int j=0; j<numOfFields; j++) {
				System.out.print(users[i][j]);
			}
		}
		
		// Traversing the arrays with knowledge of field #s
		for (int i=0; i<numOfUsers;i++) {
				String firstName = users[i][0];
				String lastName = users[i][1];
				String email = users[i][2];
				String phone = users[i][3];
				System.out.println(firstName + " " + lastName + " " + email + " " + phone);
		}
		
		System.out.println("\n\nUsing For Each");
		
		for(String[] user : users) {
			System.out.print("[ ");
			for(String field : user) {
				System.out.print(field + " ");
			}
			System.out.print(" ]");
		}
		
	}

}
