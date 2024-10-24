package day4;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value in dollar");
			double dollar = sc.nextDouble();
			double converRate = 83.914;
			double inr = converRate * dollar;
			System.out.println("Dollar : " + dollar);
			System.out.println("INR  : " + Math.ceil(inr));
			if(inr>=10000) {
				System.out.println("Your currency in inr is : "+inr);
				System.out.println("Good");
			}
			if(inr<10000) {
				System.out.println("Your balance : "+inr +"\nYour balance is low!");
				System.out.println("Better luck next time");
			}
			sc.close();

		}
	}

