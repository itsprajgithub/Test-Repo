package day4;

import java.util.Scanner;

public class ifConditionalAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your age : ");
		int student=sc.nextInt();
		if(student >=18) {
			System.out.println("You entered age : "+ student);
			System.out.println("You are adult");
		}
		System.out.println("Thankyou!");

	}

}
