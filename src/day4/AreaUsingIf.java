package day4;

import java.util.Scanner;

public class AreaUsingIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lenght of Rectangle");
		double lenght = sc.nextDouble();
		System.out.println("Enetr widht of Rectangle");
		double width = sc.nextDouble();
		double area = lenght * width;
		System.out.println("Lenght is : " + lenght + " | Width is : " + width);
		System.out.println("So Your Area Is : " + area);
		if (area >= 500) {
			System.out.println("Your Room is Big");
		} else {
			System.out.println("Your Room is small");
		}
		sc.close();

	}

}
