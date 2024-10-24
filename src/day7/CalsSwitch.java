package day7;

import java.util.Scanner;

public class CalsSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();
		System.out.println("Enter Your Mathematical Operation you want : ");
		char choice = sc.next().charAt(0);
		int result = 0;
		switch (choice) {
		case '+':
			System.out.println("You enter to add numbers");
			result = num1 + num2;
			System.out.println("Addition of num1 + num2 is : " + result);
			break;
		case '*':
			System.out.println("You enter to multiply numbers");
			result = num1 * num2;
			System.out.println("Multiplication of num1 * num2 is : " + result);
			break;
		case '-':
			System.out.println("You enter to Subtract numbers");
			result = num1 - num2;
			System.out.println("Subtraction of num1 - num2 is : " + result);
			break;
		case '/':
			System.out.println("You enter to divide numbers");
			result = num1 / num2;
			System.out.println("Division of num1 / num2 is : " + result);
			break;
		default:
			System.out.println("Enter valid operations");

		}
		System.out.println("Thankyou!!");

	}
}
