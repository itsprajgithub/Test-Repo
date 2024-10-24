package day7;

import java.util.Scanner;

public class CollegeRecommend {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Field");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("You Chosed Science");
			System.out.println("Recommended College For Science Stream : ");
			System.out.println("DR.DY PATIL COLLEGE PUNE");
			break;
		case 2:
			System.out.println("You Chosed Commerce");
			System.out.println("Recommended College For Commerce Stream : ");
			System.out.println("FURGUSSEN COLLEGE PUNE");
			break;
		case 3:
			System.out.println("You Chosed Arts");
			System.out.println("Recommended College For Arts Stream : ");
			System.out.println("MODERN COLLEGE PUNE");
			break;

		default:
			System.out.println("Enter valid stream");
		}
		sc.close();

	}

}
