package day5;

import java.util.Scanner;

public class MontlyIncome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Income");
		double Income = sc.nextDouble();
		System.out.println("Your Income : " + Income);
		if (Income >=100000) {
			System.out.println("Excellent");

		} else if (Income >=75000) {
			System.out.println("Very Good");

		} else if (Income >=50000) {
			System.out.println("good");

		} else if (Income >=25000) {
			System.out.println("Okay");

		} else {
			System.out.println("Fresher");
		}
		sc.close();

	}

}
