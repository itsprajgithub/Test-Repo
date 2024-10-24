package day2;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your SSC percentage");
		double sscPercentage= sc.nextDouble();
		System.out.println("Enter your HSC percentage");
		double hscPercentage=sc.nextDouble();
		double result=sscPercentage+hscPercentage/2;
		
		System.out.println(result);
		
		
	
	}

}
