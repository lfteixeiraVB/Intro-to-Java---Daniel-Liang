import java.io.IOException;
import java.util.Scanner;

public class Exercise_02_02 {

	public static void main(String[] args) throws IOException
	{	
		Scanner input  = new Scanner(System.in);
		
		double radius, length;
		double area, volume;
		
		
		System.out.print("Enter the radius and length of a cylinder: ");
		radius = input.nextDouble();
		length = input.nextDouble();
		
		area   = radius*radius*Math.PI;
		volume = area*length;
		
		System.out.printf("The area is %.2f\n", area);
		System.out.printf("The volume is %.2f\n", volume);
	
		input.close();
	}
}
