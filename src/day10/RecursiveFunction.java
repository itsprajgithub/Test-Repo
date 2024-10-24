package day10;

import java.util.Scanner;

public class RecursiveFunction {

	public static void main(String[] args) {
		System.out.println("Hii");
		avgBoardPer();
		convertCurrency();
		electricBill();
		System.out.println("ThankYou");

	}

	private static void electricBill() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Units");
		int Units=sc.nextInt();
		double totalamount=0;
		if(Units<=50)
		{
			totalamount=Units*3.5;
		}
		else if(Units<=150)
		{
			totalamount=50*3.5 + (Units-50)*4;
		}
		else if(Units<=250)
		{
			totalamount=50*3.5 + 100*4 +(Units-150)*5.2;
		}
		else
		{
			totalamount=50*3.5 + 100*4 + 100*5.2 +(Units-250)*6.5;
		}
		
		totalamount=totalamount+150;
		
		System.out.println("Total Bill is "+ totalamount);
		sc.close();
		
	}

	private static void convertCurrency() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value in dollar");
		double dollar = sc.nextDouble();
		double converRate = 83.914;
		double inr = converRate * dollar;
		System.out.println("Dollar : " + dollar);
		System.out.println("INR  : " + Math.ceil(inr));
		sc.close();

		
	}

	private static void avgBoardPer() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your SSC percentage");
		double sscPercentage= sc.nextDouble();
		System.out.println("Enter your HSC percentage");
		double hscPercentage=sc.nextDouble();
		double result=sscPercentage+hscPercentage/2;
		
		System.out.println("The average is : "+result);
		sc.close();
		
	}

}
