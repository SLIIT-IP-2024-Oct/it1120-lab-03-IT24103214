import java.util.Scanner;

public class IT24103214Lab3Q3 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//prompt for the rupee amount
		System.out.print("Enter the amount inn rupes:");
		int  amount = scanner.nextInt();
		
		//Define denominations
		int[] denominations = {5000,1000,500,200,100,50,20,10,5,2,1};
		int[] counts =new int[denominations.length];
		
		//calculate the number of notes/coins for each denomination
		for (int i = 0;i< denominations.length; i++) {
			counts[i]= amount/ denominations[i];
			amount %= denominations[i];
		}
		
		//Display results
		System.out.println("Denomination breakdown:");
		for (int i = 0;i< denominations.length;i++) {
			System.out.println(denominations[i]+"Notes - "+ counts[i]);
		}

		scanner.close();
	}
}
	