package <missing>;

public class GlobalMembers
{
	/*
	 * 1000010175_fe1.cpp
	 *
	 *  Created on: 2010-12-24
	 *      Author: ???
	 *      function:??????
	 */



	public static int Main()
	{
		int n; //num??????,odd???????,oddnum???????
		int[] num = new int[500];
		int[] odd = new int[500];
		int oddnum = 0;
		int i;
		int j;
		int k = 0;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //??????????
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num[i] % 2 == 1)
			{
				odd[oddnum] = num[i];
				oddnum++;
			}
		}
		for (i = 0;i < oddnum;i++) //???????
		{
			for (j = 0;j < oddnum - i - 1;j++)
			{
				if (odd[j] > odd[j + 1])
				{
					temp = odd[j];
					odd[j] = odd[j + 1];
					odd[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < oddnum;i++) //??
		{
			System.out.print((k++?",":""));
			System.out.print(odd[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

