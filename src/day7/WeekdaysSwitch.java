package day7;

import java.util.Scanner;

public class WeekdaysSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1 : System.out.println("Weekend");
		break;
		case 2 : System.out.println("Weekday");
		break;
		case 3 : System.out.println("Weekday");
		break;
		case 4 : System.out.println("Weekday");
		break;
		case 5 : System.out.println("Weekday");
		break;
		case 6 : System.out.println("Weekday");
		break;
		case 7 : System.out.println("Weekend");
		break;
		default : System.out.println("Enter valid choice");
		}
		sc.close();


	}

}
