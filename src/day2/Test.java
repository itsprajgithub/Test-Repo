package day2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int numberone = sc.nextInt();
		System.out.println("Enter second number");
		int numbertwo = sc.nextInt();
		int result = numberone - numbertwo;
		int result2 = numberone + numbertwo;
		System.out.println(result);
		System.out.println(result2);
		sc.close();

	}

}
