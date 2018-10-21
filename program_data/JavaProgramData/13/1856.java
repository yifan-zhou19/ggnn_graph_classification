package <missing>;

public class GlobalMembers
{
	/*
	 * unseennum.cpp
	 *
	 *  Created on: 2013-11-5
	 *      Author: ???
	 */

	public static int Main()
	{
		int[] a = new int[20000];
	int n;
	int i;
	int j;
	int l;
	int k;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	l = n;
	for (i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}

	for (i = 0;i < l - 1;i++)
	{
		for (j = i + 1;j < l;j++)
		{
			if (a[i] == a[j])
			{
				for (k = j;k < l - 1;k++)
				{
				a[k] = a[k + 1];
				}
			j--;
			l--;
			}
		}

	}
	System.out.print(a[0]);

	for (i = 1;i < l;i++)
	{
		System.out.print(' ');
		System.out.print(a[i]);
	}
	return 0;

	}

}

