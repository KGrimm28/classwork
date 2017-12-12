/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Kyle Grimm
   Date Due:   10/13/2017
 ******************************************************************************/
public class Ayyy
{
	public static void main(String[] args)
	{
		int[] swag = {1, 3, 5, 9, 11};
		printArray(swag);

		printArray(swag[0] += 5);
		printArray(swag);
	}

	static void printArray(int[] nums)
	{
		for(int i = 0; i < nums.length; i++)
		{
			System.out.println(nums[i]);
		}
	}
}