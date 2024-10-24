package day6;

import java.util.Scanner;

public class MonthlyIcome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your CTC");
		double CTC = sc.nextDouble();
		double finalIncome = 0;
		if (CTC <= 750000) {
			finalIncome = CTC / 12;

		} else if (CTC <= 1000000) {

			finalIncome = (CTC - 750000) * .10;

		} else if (CTC <= 1500000) {

			finalIncome = (250000) * .10 + (CTC - 1000000) * .20;

		} else if (CTC > 1500000) {

			finalIncome = (250000) * .10 + (500000) * .20 + (CTC - 1500000) * .30;
		}
		System.out.println("Your CTC Is : " + CTC);
		System.out.println("The Tax You Pay : " + finalIncome);
		double result = (CTC - finalIncome) / 12;
		System.out.println("Monthly Income : " + result);

		sc.close();

	}

}
