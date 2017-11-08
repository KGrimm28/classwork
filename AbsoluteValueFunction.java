/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kyle Grimm
   Date Due:   10/13/2017
 ******************************************************************************/
import java.util.Scanner;

public class AbsoluteValueFunction
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int value = kb.nextInt();

		System.out.println(abs(value));
	}


	static int abs(int num)
	{
		if(num > 0)
		{
			return num *= 1;
		}
		else
		{
			return num * -1;
		}
	}
}