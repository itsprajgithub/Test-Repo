package day9;

public class functionDemo1 {

	public static void main(String[] args) {
	System.out.println("i am in main");
	brazil();
	System.out.println("I am finally back in main");

	}

	private static void brazil() {
		System.out.println("i am in brazil");
		argentina();
		System.out.println("i am back in brazil");
		
	}

	private static void argentina() {
		System.out.println("i am in argentina");
		
	}

}
