package <missing>;

public class GlobalMembers
{
	/*
	 * 11055.cpp
	 *
	 *  Created on: 2011-11-5
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int num = 0;
		int dnum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				for (j = i;j < n;j++)
				{
					a[j] = a[j + 1];
				}
				i = i - 1;
				dnum = dnum + 1;
			}
			num = num + 1;
			if (num == n)
			{
				break;
			}
		}
		System.out.print(a[0]);
		for (i = 1;i < n - dnum;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}

}

