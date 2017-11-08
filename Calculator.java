/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kyle Grimm
   Date Due:   10/13/2017
 ******************************************************************************/
import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int a;
		int b;

		System.out.print("Enter a numbre: ");
		a = keyboard.nextInt();
		System.out.print("Enter a numbre: ");
		b = keyboard.nextInt();

		System.out.println(add(a, b));
		System.out.println(sub(a, b));
		System.out.println(mul(a, b));
		System.out.println(div(a, b));
	} 
	
	static int add(int a, int b)
	{
		return a + b;
	}
	static int sub(int a, int b)
	{
		return a - b;
	}
	static int mul(int a, int b)
	{
		return a * b;
	}
	static int div(int a, int b)
	{
		return a / b;
	}
}