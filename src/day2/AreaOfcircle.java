package day2;

import java.util.Scanner;

public class AreaOfcircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of cirlce");
		double radius = sc.nextDouble();
		double result = 3.14 * radius * radius;
		System.out.println(result);

	}

}
