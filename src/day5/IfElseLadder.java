package day5;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Percentage");
		double Per = sc.nextDouble();
		System.out.println("Your Percentage : " + Per);
		if (Per >= 70 && Per <= 100) {
			System.out.println("Grade 'Distinction'");
			System.out.println("Enter Your Physics Marks");
			double Phy = sc.nextDouble();
			System.out.println("Enter Your Chemistry Marks");
			double chem = sc.nextDouble();
			System.out.println("Enter Your Math Marks");
			double Math = sc.nextDouble();
			double result = Phy + chem + Math / 3;
			System.out.println("Your Avg of PCM Is : " + result);

		} else if (Per >= 60) {
			System.out.println("Grade 'First Class'");
			System.out.println("Enter Your English Marks");
			double english = sc.nextDouble();
			System.out.println("Enter Your Hindi Marks");
			double hindi = sc.nextDouble();
			System.out.println("Enter Your Marathi Marks");
			double Marathi = sc.nextDouble();
			double result2 = english + hindi + Marathi / 3;
			System.out.println("Your Avg Of Languages  : " + result2);

		} else if (Per >= 50 && Per <= 59) {
			System.out.println("Grade 'Second Class'");

		} else if (Per >= 40 && Per <= 49) {
			System.out.println("Grade 'Pass'");

		} else {
			System.out.println("Fail");
		}
		sc.close();

	}

}
