import java.io.IOException;
import java.util.Scanner;

public class Exercise_02_01 {

	public static void main(String[] args) throws IOException
	{	
		double celsius, fahr;
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Insert the temperature in Celsius: ");
		celsius = input.nextDouble();
		
		fahr = (9.0/5)*celsius + 32;
		
		System.out.print(celsius + " Celsius correspond to " +fahr+ " Fahrenheit");
		
		input.close();
	}
	
	
}
