package day2;

import java.util.Scanner;

public class AreaOfREctangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lenght of Rectangle");
		double lenghtofrec = sc.nextDouble();
		System.out.println("Enetr widht of Rectangle");
		double widthofrec = sc.nextDouble();
		double result = lenghtofrec * widthofrec;
		System.out.println("The area of rectangle is : " + result);
	}

}
