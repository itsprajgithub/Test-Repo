package day7;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice : ");
		int Choice = sc.nextInt();
		switch (Choice) {
		case 1:
			System.out.println("You choose to calculate area of circle!! ");
			System.out.println("Enter Radius : ");
			double radius = sc.nextDouble();
			double result = 3.14 * radius * radius;
			System.out.println(result);
			break;

		case 2:
			System.out.println("You choose to calculate area of Rectangle!!");
			System.out.println("Enter lenght : ");
			double len = sc.nextDouble();
			System.out.println("Enter Breath : ");
			double bth = sc.nextDouble();
			double rec = len * bth;
			System.out.println(rec);
			break;

		case 3:
			System.out.println("You choose to calculate area of Traingle!!");
			System.out.println("Enter Base : ");
			double Base = sc.nextDouble();
			System.out.println("Enter Height : ");
			double Height = sc.nextDouble();
			double Traingle =(Base*Height)/2;
			System.out.println(Traingle);

			break;

		default:
			System.out.println("Enter valid ");
		}
		System.out.println("Thank You Visit Again");
		sc.close();

	}

}
