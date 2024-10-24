package day11;

import java.util.Scanner;

public class AgeScenerio2 {

	public static void main(String[] args) {
		
			
			System.out.println(ifelligibleornot());

		}

		private static String ifelligibleornot() {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			
			if(age >=18){
				return "Eligible for vote";
			}
			else {
				return "Not Eligible for vote";
			}
			
		
	}

	

}
