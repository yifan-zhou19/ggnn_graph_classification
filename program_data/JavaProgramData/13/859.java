package <missing>;

public class GlobalMembers
{
	/*
	 * ????????.cpp
	 *
	 *  Created on: 2011-10-21
	 *      Author: sony
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		int q = 0;
		int[] a = new int[20000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n - q;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					q++;
					i--;
				}
			}
		}
		for (i = 0;i < n - q - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - q - 1]);
		return 0;
	}
}

