import java.io.IOException;
import java.util.Scanner;

public class Exercise_02_03 {

	public static void main(String[] args) throws IOException
	{	
		Scanner input  = new Scanner(System.in);
		
		double feet, meter;
				
		System.out.print("Enter a value for feet: ");
		feet = input.nextDouble();
				
		meter = feet*0.305;

		System.out.print(feet+" feet is " +meter+ " meters");
		
		input.close();
	}
}
