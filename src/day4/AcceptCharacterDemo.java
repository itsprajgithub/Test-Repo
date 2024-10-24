package day4;

import java.util.Scanner;

public class AcceptCharacterDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Gender");
		char gender =sc.next().charAt(1);
//		char gen=gender.charAt(0);
		System.out.println("You Gender is : " + gender);
		if (gender == 'm' || gender == 'M') {

			System.out.println("Hello Mister");

		}else if(gender == 'f' || gender == 'F') {
			System.out.println("Hello Miss");
		}
		else {
			System.out.println("Pls enter valid Gender");
		}
		sc.close();

	}

}
