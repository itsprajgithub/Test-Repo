package day3;

import java.util.Scanner;

public class shape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter your principle");
		double principle = sc.nextDouble();
		System.out.println("Enter your interest");
		double noy = sc.nextDouble();
		System.out.println("For How many years");
		double year = sc.nextDouble();
		double youget = (principle * noy * year) / 100;
		System.out.println("Your amount with interest is : " + youget);
	}

}
