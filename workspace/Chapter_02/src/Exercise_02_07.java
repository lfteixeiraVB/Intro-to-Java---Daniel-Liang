import java.io.IOException;
import java.util.Scanner;

public class Exercise_02_07 {

	public static void main(String[] args) throws IOException
	{	
		/*Create an object*/
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
	
		double years =  (minutes/525600);
		double days = (years - (int)years)*365 ;
		
		System.out.printf("%d minutes is approximately %d years and %d days\n", minutes, (int)years, (int)days);

		input.close();
	}
}
