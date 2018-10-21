package <missing>;

public class GlobalMembers
{
	/*
	 * xiao1.cpp
	 *
	 *  Created on: 2010-12-24
	 *      Author: l
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
	int j;
	for (j = 0;j < n;j++)
	{
		a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}

		int i;
		int k;
		int s;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			if (a[i] > a[j])
			{
				s = a[i];
				a[i] = a[j];
				a[j] = s;
			}
			}
		}
		for (k = 0;k < i;k++)
		{
			if ((a[k] % 2) == 1)
			{
		System.out.print(a[k]);
		break;
			}
		}
		for (i = k + 1;i < n;i++)
		{
			if ((a[i] % 2) == 1)
			{
				System.out.print(',');
				System.out.print(a[i]);
			}
		}
		System.out.print("\n");

		return 0;
	}

}

