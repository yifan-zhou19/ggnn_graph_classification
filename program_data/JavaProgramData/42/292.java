package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012861_25.cpp
	 *  Created on: 2010-10-23
	 *      Author: ??
	 *      ???????????
	 */


	public static int Main()
	{
		int m;
		int n;
		int i;
		int num;
		int j;
		int r;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = m;
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		if (a[i] == num)
		{
			for (j = i;j < n;j++)
			{
			a[j] = a[j + 1];
			}
		i = i - 1;
		n = n - 1;
		}
		}

		for (i = 0;i <= n - 2;i++)
		{
		System.out.print(a[i]);
		System.out.print(" ");
		}
		System.out.print(a[i]);
		return 0;
	}
}

