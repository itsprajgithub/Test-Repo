package day4;

import java.util.Scanner;

public class AvgUsingIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your SSC percentage");
		double sscPercentage = sc.nextDouble();
		System.out.println("Enter your HSC percentage");
		double hscPercentage = sc.nextDouble();
		double result1 = sscPercentage + hscPercentage;
		double result = sscPercentage + hscPercentage / 2;
		System.out.println("Your SSC and HSC Per Total : " + result1);

		System.out.println("Your SSC and HSC Average is : " + result);
		if (result >= 80) {
			System.out.println("Scholar Student");
		} else {
			System.out.println("Regular Student");
		}
		System.out.println("Thankyou!");
		sc.close();

	}

}
