import java.io.IOException;
import java.util.Scanner;

public class Exercise_03_18 {

	public static void main(String[] args) throws IOException
	{	
		Scanner input  = new Scanner(System.in);
		double w;
		double C = 0;
		
		System.out.print("Enter the weight of the package: ");
		w = input.nextDouble();
		
		if((w>0) || (w<=1))
		{
			C = 3.5;
			System.out.println("The cost is " +C+ " dollars");
		}
		
		else if((w>1) || (w<=3))
		{
			C = 5.5;
			System.out.println("The cost is " +C+ " dollars");
		}
		
		else if((w>3) || (w<=10))
		{
			C = 8.5;
			System.out.println("The cost is " +C+ " dollars");
		}
		
		else if((w>10) || (w<=20))
		{
			C = 10.5;
			System.out.println("The cost is " +C+ " dollars");
		}
		
		
		else if(w>50)
		{
			System.out.println("The package cannot be shipped");
	
		}
		
		input.close();
		
		
	}

}
