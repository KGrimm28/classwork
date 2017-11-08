/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kyle Grimm
   Date Due:   10/13/2017
 ******************************************************************************/
import java.util.Scanner;

public class Geometry
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int num;

		System.out.println("How big of a line do you want?");
		num = keyboard.nextInt();

		for (int i = 1; i <= num; i++)
		{
			System.out.print("-");
			for (int j = 1; i <= num; i++)
			{
				System.out.print("-");
				for (int o = 1; i <= num; i++)
				{
					System.out.print("-");
				}
			}
		}

	}
}