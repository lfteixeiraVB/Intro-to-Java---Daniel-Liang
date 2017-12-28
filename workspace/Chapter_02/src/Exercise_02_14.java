import java.io.PrintStream;
import java.util.Scanner;

public class Exercise_02_14 {

	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		double weight_KG = weight*0.45359237;
		double height_M = height*0.0254;
		
		
		double BMI = weight_KG/(Math.pow(height_M, 2)); 
		
		output.println("BMI is " +BMI);
	
		input.close();
	}
}
