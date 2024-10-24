package day8;

import java.util.Scanner;

public class NestedSwitchDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("In Which Language You Want To Proceed ? ");
		System.out.println("Press 1: For English ");
		System.out.println("Press 2: For Arabic ");
		System.out.println("Press 0: For Exit ");
		System.out.println("Enter Which Language You Want To Go With ?");

		choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Press 1: For UK ");
			System.out.println("Press 2: For US ");
			System.out.println("Press 0: For Exit ");
			System.out.println("Enter Which Country You Want To Call ?");

			choice = sc.nextInt();
			switch(choice) {
			case 1 : System.out.println("Call Routed to london");
			break;
			case 2 : System.out.println("Call Routed to NewYork");
			break;
			case 0 : System.out.println("Thanks to visit us !");
			break;
			default : System.out.println("Enter Valid choice"); 
			}
			break;
		case 2: 
			System.out.println("Press 1: For Qatar ");
			System.out.println("Press 2: For Oman ");
			System.out.println("Press 0: For Exit ");
			System.out.println("Enter Which Country You Want To Go ?");

			choice = sc.nextInt();
			switch(choice) {
			case 1 : System.out.println("Call Routed to Doha ");
			break;
			case 2 : System.out.println("Call Routed to NewYork");
			break;
			case 0 : System.out.println("Thanks to visit us !");
			break;
			default : System.out.println("Enter Valid choice"); 
			}
			
		

			
			
			

	}

}}
