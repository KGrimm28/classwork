/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kyle Grimm
   Date Due:   10/13/2017
 ******************************************************************************/
import java.util.Scanner;

public class SumFun
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();

		System.out.println(sum(num1, num2));
	}


	static int sum(int a, int b)
	{
		return a + b;
	}
}