/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kyle Grimm
   Date Due:   10/13/2017
 ******************************************************************************/
import java.util.Scanner;

public class PowerFunction
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int swag;
		int boi;
		
		System.out.print("Enter a base number: ");
		swag = keyboard.nextInt();
		System.out.print("Enter an exponent number: ");
		boi = keyboard.nextInt();
		
		System.out.println(power(swag, boi));
		
	}


	static int power(int base, int exponent)
	{
		int runningTotal = 1;

		for (int i = 0; i < exponent; i++)
		{
			runningTotal *= base;
		}

		return runningTotal;
	} 
}