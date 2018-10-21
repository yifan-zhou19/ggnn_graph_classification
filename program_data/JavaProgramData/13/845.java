package <missing>;

public class GlobalMembers
{
	/*
	 * ????????.cpp
	 *
	 *  Created on: 2011-10-19
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(a[0]);
		for (i = 1;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
				if (a[i] != a[j] && j == (i - 1))
				{
					System.out.print(" ");
					System.out.print(a[i]);
				}
			}
		}
		return 0;
	}
}

