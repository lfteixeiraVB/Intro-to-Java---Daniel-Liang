import java.io.PrintStream;
import java.util.Scanner;

public class Exercise_02_23 {

	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		double distance, milesPerGallon, pricePerGallon, cost;
		
		output.print("Enter the  driving distance: ");
		distance = input.nextDouble();

		output.print("Enter milles per gallon: ");
		milesPerGallon = input.nextDouble();

		output.print("Enter price per gallon: ");
		pricePerGallon = input.nextDouble();
		
		
		double gallon = distance/milesPerGallon;
		cost = gallon*pricePerGallon;
		
		output.printf("The cost of driving is $%.2f", cost);
		input.close();
		
	}
	
	
}
