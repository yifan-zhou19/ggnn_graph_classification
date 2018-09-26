package <missing>;

public class GlobalMembers
{
	/*
	 * main.cpp
	 *
	 *  Created on: 2012-11-3
	 *      Author: GC
	 *      ???????N????500???????????????????????????
	 */


	public static int Main()
	{
		int[] a = new int[501];
		int i;
		int k = 0;
		int n;
		int j;
		int x;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x % 2 == 1) //?????????
			{
				k++;
				a[k] = x;
			}
		}
		for (i = 1;i <= k;i++) //????
		{
			for (j = i + 1;j <= k;j++)
			{
				if (a[i] > a[j])
				{
					a[0] = a[i];
					a[i] = a[j];
					a[j] = a[0];
				}
			}
		}
		for (i = 1;i <= k - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(',');
		}
		System.out.print(a[k]);
		System.out.print("\n");
		return 0;
	}
}

