import java.util.Scanner;

public class IT24103214Lab3Q1B {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		// prompt the user for the price per kilogram of rice
		System.out.print("Enter the price of 1kg of rice :");
		double pricePerkg = scanner.nextDouble();
		
		// prompt the user for the number of kilograms they want to buy
		System.out.print("Enter the number of kilogram you want buy:");
		double kgAmount =  scanner.nextDouble();
		
		
		// Calculate the total cost without discount
		double totalCost = pricePerkg*kgAmount;
		
		// Apply a 10% discounnt
		double discountCost = totalCost*0.9;
		
		// Display the total cost after discount
		System.out.println("The total amount with 10% discount is:" +discountCost);

		scanner.close();
	
	}
	
}
		