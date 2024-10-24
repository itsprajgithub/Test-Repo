package day12;

import java.util.Scanner;

public class FunctionScenerio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius Of Circle : ");
		double radius=sc.nextDouble();
		double result=Calradius(radius);
		System.out.println("Area of circle is : "+result);
		

	}

	private static double Calradius(double radius) {
		double result=3.14*radius*radius;
		return result;
	}

}
