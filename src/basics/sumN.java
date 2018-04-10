package basics;

public class sumN {

	public static void main(String[] args) {
		System.out.println(fac(10));
	}
	
	public static int fac(int n) {
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return  1; 
		}
		return n * fac(n - 1);
	}
}
