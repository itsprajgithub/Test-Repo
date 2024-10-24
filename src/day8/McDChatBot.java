package day8;

import java.util.Random;
import java.util.Scanner;

public class McDChatBot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Random rand=new Random();
		int bill=rand.nextInt(50);
		int number=rand.nextInt(100);
		System.out.println("Enter Your Good Name :");
		String name=sc.next();
		System.out.println("Welcome To MacDonalds "+name+"\n");
		System.out.println(name+ " Browse Through Our Menu");
		System.out.println("1 : Burger");
		System.out.println("2 : Pizza");
		System.out.println("3 : Sofdrinks\n");
		System.out.println("Enter Choice : ");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("\nMenu For Burger :");
			System.out.println("1 : VEG Burger");
			System.out.println("2 : NON-VEG Burger");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\nAvailable Burger In VEG :");
				System.out.println("1 : MacAlooTikki Veg Burger");
				System.out.println("2 : MaharajaMac Veg Burger");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("\n\t\t\t\t\t\tOrder Summary!");
					System.out.println("\nMr/Ms :"+name);
					System.out.println("\nCurrent Order : "+ (number-1));
					System.out.println("\nYour Order Number : "+number);
					System.out.println("\nOrder Bill : "+bill+"$");
					System.out.println("\nYour MacAlooTikki Veg Burger Will Be Ready soon");
					break;
				case 2:
					System.out.println("\n\t\t\t\t\t\tOrder Summary!");
					System.out.println("\nMr/Ms :"+name);
					System.out.println("\nCurrent Order : "+ (number-1));
					System.out.println("\nYour Order Number : "+number);
					System.out.println("\nOrder Bill : "+bill+"$");
					System.out.println("Your MaharajaMac Veg Burger Will Be Ready soon");
					break;
				default:
					System.out.println("Enter Valid Choice");
				}
				break;

			case 2:
				System.out.println("Available Burger In NON-VEG :");
				System.out.println("1 : Chikken MacAlooTikki Burger");
				System.out.println("2 : Chikken MaharajaMac Burger");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("\n\t\t\t\t\t\tOrder Summary!");
					System.out.println("\nMr/Ms :"+name);
					System.out.println("\nCurrent Order : "+ (number-1));
					System.out.println("\nYour Order Number : "+number);
					System.out.println("\nOrder Bill : "+bill+"$");
					System.out.println("Your Chikken MacAlooTikki Veg Burger Will Be Ready soon");
					break;
				case 2:
					System.out.println("\n\t\t\t\t\t\tOrder Summary!");
					System.out.println("\nMr/Ms :"+name);
					System.out.println("\nCurrent Order : "+ (number-1));
					System.out.println("\nYour Order Number : "+number);
					System.out.println("\nOrder Bill : "+bill+"$");
					System.out.println("Your Chikken MaharajaMac Veg Burger Will Be Ready soon");
					break;
				default:
					System.out.println("Enter Valid Choice");
				}
				System.out.println("ThnakYou Visit Again");
				

			}
			break;
		case 2:
			System.out.println("Menu For Pizza :");
			System.out.println("1 : VEG Pizza");
			System.out.println("2 : NON-VEG Pizza");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Available Pizza In VEG :");
				System.out.println("1 : Corn Veg Pizza");
				System.out.println("2 : onion Veg Pizza");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("\n\t\t\t\t\t\tOrder Summary!");
					System.out.println("\nMr/Ms :"+name);
					System.out.println("\nCurrent Order : "+ (number-1));
					System.out.println("\nYour Order Number : "+number);
					System.out.println("\nOrder Bill : "+bill+"$");
					System.out.println("Your Corn Veg Pizzar Will Be Ready soon");
					break;
				case 2:
					System.out.println("\n\t\t\t\t\t\tOrder Summary!");
					System.out.println("\nMr/Ms :"+name);
					System.out.println("\nCurrent Order : "+ (number-1));
					System.out.println("\nYour Order Number : "+number);
					System.out.println("\nOrder Bill : "+bill+"$");
					System.out.println("Your onion Veg Pizza Will Be Ready soon");
					break;
				default:
					System.out.println("Enter Valid Choice");
				}
				break;
			case 2:
				System.out.println("Available Pizza In NON-VEG :");
				System.out.println("1 : Chikken Corn Burger");
				System.out.println("2 : Chikken onion Burger");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("\n\t\t\t\t\t\tOrder Summary!");
					System.out.println("\nMr/Ms :"+name);
					System.out.println("\nCurrent Order : "+ (number-1));
					System.out.println("\nYour Order Number : "+number);
					System.out.println("\nOrder Bill : "+bill+"$");
					System.out.println("Your Chikken Corn Burger Will Be Ready soon");
					break;
				case 2:
					System.out.println("\n\t\t\t\t\t\tOrder Summary!");
					System.out.println("\nMr/Ms :"+name);
					System.out.println("\nCurrent Order : "+ (number-1));
					System.out.println("\nYour Order Number : "+number);
					System.out.println("\nOrder Bill : "+bill+"$");
					System.out.println("Your Chikken onion Burger Will Be Ready soon");
					break;
				default:
					System.out.println("Enter Valid Choice");
				}
			}
			System.out.println("ThnakYou Visit Again");
			break;
		case 3:
			System.out.println("Menu For SoftDrinks :");
			System.out.println("1 : Cola");
			System.out.println("2 : Sprite");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("\n\t\t\t\t\t\tOrder Summary!");
				System.out.println("\nMr/Ms :"+name);
				System.out.println("\nCurrent Order : "+ (number-1));
				System.out.println("\nYour Order Number : "+number);
				System.out.println("\nOrder Bill : "+bill+"$");
				System.out.println("Your cola will be serve soon");
				break;
			case 2:
				System.out.println("\n\t\t\t\t\t\tOrder Summary!");
				System.out.println("\nMr/Ms :"+name);
				System.out.println("\nCurrent Order : "+ (number-1));
				System.out.println("\nYour Order Number : "+number);
				System.out.println("\nOrder Bill : "+bill+"$");
				System.out.println("Your sprite will be serve soon");
			}

			System.out.println("ThnakYou Visit Again");

		}

	}

}
