/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kyle Grimm
   Date Due:   11/14/2017
 ******************************************************************************/
import java.util.Scanner;

public class Shapes
{
	public static void main(String[] args)
	{
		instructions();
		
		
		int swag = getPositiveNum();
		
		triangle(swag);

		
		System.out.print("\n");
		square(swag);
	}




















	
	static void asterisks(int length)
	{
		for(int i = 0; i < length; i++)
		{
			System.out.print("*");
		}
	}
	
	static void instructions()
	{
		System.out.println("Ay! Say a swag number and I'll make a swag triangle and swag square from it lol!");
	}
	static void triangle(int size)
	{
		for(int i = 1; i <= size; i++)
		{
			asterisks(i);
			System.out.print("\n");
		}
	}
	static void square(int size)
	{
		for(int i = 1; i <= size; i++)
		{
			asterisks(size);
			System.out.print("\n");
		}
	}
	static int getPositiveNum()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Give me a positive number: ");
		int swag = keyboard.nextInt();

		while(swag < 0)
		{
			System.out.println("Positive numbers only!");
			swag = keyboard.nextInt();
		}
		return swag;
	}
}