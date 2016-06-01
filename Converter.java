import java.util.Scanner;
public class Converter
{	
	public static void main(String [] agrs)
	{

		//Variable declaration for feet, inches and centimeters
		int feet, inches, centimeters;
		
		//String declarations for input
		String p1 = "Input feet: ";
		String p2 = "Input inches: ";
		String p3 = "Centimeters: ";
		
		//Scanner declartion to get user input
		Scanner a = new Scanner(System.in);
		
		//Display messege, take keyboard inoput and store
		//in variable
		System.out.print(p1);	//For feet
		feet = a.nextInt();
		System.out.print(p2); //For inches
		inches = a.nextInt();
		
		//Convert to centimeters
		double converted;
		converted = ((feet * 12) + inches)*2.54;
		
		//Display conversion to output
		System.out.print(p3);
		System.out.print(converted);	
	}
}