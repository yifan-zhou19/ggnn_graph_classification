package <missing>;

public class GlobalMembers
{
	/*
	 * shanchuyuansu.cpp
	 *
	 *  Created on: 2013-10-30
	 *      Author:???1300012996
	 */
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = m;
		}
		int k;
		int j = 1;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int ii = 0;ii < n;ii++)
		{
			if (a[ii] != k && j == 1)
			{
					System.out.print(a[ii]);
					j += 1;
			}
			else if (a[ii] != k && j != 1)
			{
				System.out.print(' ');
				System.out.print(a[ii]);
			}
		}
		return 0;
	}

}

