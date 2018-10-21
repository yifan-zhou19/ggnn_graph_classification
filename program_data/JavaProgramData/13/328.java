package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012730_26.cpp
	 *  ????????
	 *  Created on: 2010-10-29
	 *      Author: ???
	 */

	public static int Main()
	{
		int n;
		int i;
		int m = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 1;i <= n;i++) //??????a[i]
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[1]);
		for (i = 2;i <= n;i++)
		{
				m = 1; //???????????m
			for (int j = i - 1;j > 0;j--)
			{
				if (a[i] == a[j])
				{
					m = 0;
				}
			}
			if (m == 1)
			{
				System.out.print(' ');
				System.out.print(a[i]);
			}
		}
		return 0;
	}

}

