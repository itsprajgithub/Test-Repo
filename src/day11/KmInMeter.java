package day11;

import java.util.Scanner;

public class KmInMeter {

	public static void main(String[] args) {
		int result1;
		result1=kmMeter();
		System.out.println("The distance in meter is : "+result1);

	}

	private static int kmMeter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Distance In KM : ");
		int Distance =sc.nextInt();
		int result=Distance*1000;
		return result;
		
		
	}

}
