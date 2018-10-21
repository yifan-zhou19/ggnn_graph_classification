package <missing>;

public class GlobalMembers
{
	/*
	 * asd.cpp
	 *
	 *  Created on: 2011-10-25
	 *      Author: dell
	 */

	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int x;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];

		// ?????????n?????????
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		// ?????????X?
		// ??????X????????????????
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < n; k++)
		{
			if (a[k] == x)
			{
				m = m + 1;
				for (j = k; j < n; j++)
				{
					a[j] = a[j + 1];
				}
				k--;
			}
		}

		// ???????
		for (k = 0; k < (n - m); k++)
		{
			if (k != (n - m - 1))
			{
				System.out.print(a[k]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(a[k]);
			}
		}

		return 0;
	}

}

