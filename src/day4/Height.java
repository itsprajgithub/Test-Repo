package day4;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Height : ");
		double candidate = sc.nextDouble();
		if (candidate >= 6.1) {
			System.out.println("Candidate Height : " + candidate);
			System.out.println("You are eligible for next round");
		}
		System.out.println("Thankyou!");
		sc.close();

	}

}
