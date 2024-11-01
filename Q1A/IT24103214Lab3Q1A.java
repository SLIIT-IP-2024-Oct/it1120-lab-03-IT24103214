import java.util.Scanner;
public class IT24103214Lab3Q1A {
	
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice:");
		double pricePerkg = Scanner.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy");
		double quantity = Scanner.nextDouble();
		
		double totalAmount = pricePerkg*quantity;
		
		System.out.println("The total amount is:" + totalAmount);
	
	}
	
}
