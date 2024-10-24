package day12;

import java.util.Scanner;

public class CPSPUsingScenerio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cost price : ");
        double costPrice = scanner.nextDouble();
        System.out.print("Enter the selling price : ");
        double sellingPrice = scanner.nextDouble();
        double percentage = 0;
        calculateProfitOrLossPercentage(costPrice, sellingPrice,percentage);
      

	}

	private static double calculateProfitOrLossPercentage(double costPrice, double sellingPrice, double percentage) {
		percentage=costPrice-sellingPrice;
		System.out.println("Amount : "+percentage);
		if (sellingPrice > costPrice) {
	            percentage = ((sellingPrice - costPrice) / costPrice) * 100;
	            System.out.println("Profit of " + percentage + "%.");
	        } else if (sellingPrice < costPrice) {
	            percentage = ((costPrice - sellingPrice) / costPrice) * 100;
	            System.out.println("Loss of " + percentage + "%.");
	        } else {
	            System.out.println("No profit, no loss.");                                                                  
	        }
	        
	        return percentage;
	}

}
