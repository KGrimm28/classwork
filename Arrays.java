/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kyle Grimm
   Date Due:   10/13/2017
 ******************************************************************************/
import java.util.Scanner;

public class Arrays
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = new int[5];
		int sum = 0;
		
		for (int i = 0; i < 5; i++)
		{
			System.out.print("Please enter a number: ");
			numbers[i] = keyboard.nextInt();
		}	
		for (int i = 0; i < 5; i++)
		{
			sum += numbers[i];
		}
			System.out.printf("The sum of those nums is %d!" , sum);
	}
}