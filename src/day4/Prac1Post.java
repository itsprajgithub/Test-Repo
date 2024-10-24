package day4;

import java.util.Scanner;

public class Prac1Post {

	public static void main(String[] args) {
		System.out.println("See Weather The Post Is Talking About You ?");
		Scanner sc = new Scanner(System.in);
		String post = sc.nextLine();
		if (post.toLowerCase().contains("prajwal") || post.toLowerCase().contains("Prajwal")) {
			System.out.println("The Post Is Taling About You :) ");
		} else {
			System.out.println("Sorry Post is Not Talking About You");
		}
		sc.close();

	}

}
