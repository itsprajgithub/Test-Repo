package day5;

import java.util.Scanner;

public class ElectricityBillCalculaation {

	public static void main(String[] args) {
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
}