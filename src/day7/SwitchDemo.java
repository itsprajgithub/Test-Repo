package day7;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice : ");
		int Choice=sc.nextInt();
		switch(Choice) {
		case 1 : System.out.println("You are routed to London  ");
		break;
		
		case 2 : System.out.println("You are routed to Delhi");
		break;
		
		case 3 : System.out.println("You are routed to Pune");
		break;
		
		default : System.out.println("Enter valid ");
		}
		System.out.println("Thank You Visit Again");
		sc.close();

	}

}
