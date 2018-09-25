package <missing>;

public class GlobalMembers
{
	/*
	 * wordedit.cpp
	 *
	 *  Created on: 2013-12-7
	 *      Author: tangqinyi
	 */

	public static int Main()
	{
		char[][] word = new char[503][40];
		int sum = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
				*(word + i) = ConsoleInput.readToWhiteSpace(true);
		}
		System.out.print((word));
		sum = String.valueOfword.length() + 1; //???????????� �
		for (int i = 1;i < n;i++)
		{
			sum = sum + String.valueOf(*(word + i)).length();
		if (sum <= 80)
		{ //?????????80
			   System.out.print(' ');
			   sum++;
		}
		else
		{
			 System.out.print("\n");
			 sum = String.valueOf(*(word + i)).length() + 1; //???????
		}
		System.out.print((word + i));
		}
		return 0;
	}

}

