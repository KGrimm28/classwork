/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kyle Grimm
   Date Due:   10/13/2017
 ******************************************************************************/
import java.util.Scanner;

public class PrimeFunction
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int num;
		boolean prime = true;

		System.out.println("Give me a number and I'll tell you if it's prime lol");
		num = keyboard.nextInt();

		for(int i = 2; i < num; i++)
		{
			if(num % i == 0) 
			{
				prime = false;
			}
		}
		if(prime)
		{
			System.out.print("It is prime :D");
		}
		else
		{
			System.out.print("It is NOT prime D:");
		}
	}

	static boolean isPrime(int number)
	{
		
		return true; 
	}
}