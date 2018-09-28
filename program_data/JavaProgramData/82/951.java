package <missing>;

public class GlobalMembers
{
	/*
	 * 20121024-4.cpp
	 *
	 *  Created on: 2012-10-26
	 *      Author: ???
	 */



	public static int Main()
	{
		int n;
		int count;
		int number;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		count = 0;
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		c[n] = 0;
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				count = count + 1; //????????????????
				c[i] = count; //???????
			}
			else
			{
				count = 0;
				c[i] = count; //???????0
			}
		}
		number = 0;
		for (i = 1;i <= n;i++)
		{
			if (c[i] > number)
			{
				number = c[i]; //???????????
			}
		}
		System.out.print(number);
		return 0;
	}

}

