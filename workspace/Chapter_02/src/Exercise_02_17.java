import java.io.PrintStream;
import java.util.Scanner;

public class Exercise_02_17 {

	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter the side: ");
		double side = input.nextDouble();
		
		double A = (3*Math.sqrt(3)*Math.pow(side, 2))/2;
		
		output.print("The area of the haxagon is "+A);
		
		input.close();
	}
}
