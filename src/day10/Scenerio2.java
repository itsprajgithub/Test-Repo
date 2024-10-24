package day10;

import java.util.Scanner;


public class Scenerio2 {

	public static void main(String[] args) {
		double result1;
		
		result1=totalAvg();
		if(result1>=85) {
			System.out.println("Scholar");
		}else {
			System.out.println("Regular");
		}
		

	}

	private static double totalAvg() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your SSC percentage");
		double sscPercentage= sc.nextDouble();
		System.out.println("Enter your HSC percentage");
		double hscPercentage=sc.nextDouble();
		double result=sscPercentage+hscPercentage/2;
		System.out.println("Total avg is : "+result);
		return result;
		
		
	}

}
