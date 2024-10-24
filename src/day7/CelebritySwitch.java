package day7;

import java.util.Scanner;

public class CelebritySwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vowel");
		char choice=sc.next().toLowerCase().charAt(0);
		switch(choice) {
		case 'a' : System.out.println("Amitabh Bacchan");
		break;
		case 'e' : System.out.println("engine"); 
		break;
		case 'i' : System.out.println("Imran");
		break;
		case 'o' : System.out.println("Ompuri");
		break;
		case 'u' : System.out.println("Uganda");
		break;
		default : System.out.println("Enter valid vowel");
		}
		

	}

}
