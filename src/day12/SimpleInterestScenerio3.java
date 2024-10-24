package day12;

import java.util.Scanner;

public class SimpleInterestScenerio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle : ");
		double principle = sc.nextDouble();
		System.out.println("Enter your Interest :");
		double interest = sc.nextDouble();
		System.out.println("For Year : ");
		double year = sc.nextDouble();
		double Siminterest=simpleInt(principle,interest,year);
		System.out.println("Your amount with interest is : " + Siminterest);
		
	}

	private static double simpleInt(double principle, double interest, double year) {
		double Siminterest = (principle * interest * year) / 100;
		return Siminterest;
		

		
	}

}
