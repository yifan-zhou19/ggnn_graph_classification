package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012761_26.cpp
	 *??n????n???????????????10-100???
	???????????????????????????????????????????
	 *  Created on: 2010-10-29
	 *      Author:1000012761
	 */

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 1 || n>20000)
		{
			return 0;
		}
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a[i] < 10 || a[i] >= 100)
		{
			return 0;
		}
		}
		for (j = 0;j < n - s;j++)
		{
			for (i = n - 1 - s;i > j;i--)
			{
					if (a[j] == a[i])
					{
					s = s + 1;
					for (k = i;k < n - s;k++)
					{
						a[k] = a[k + 1];
					}
					}
			}
		}
		for (i = 0;i < n - s;i++) //????????
		{
					if (i != n - s - 1)
					{
				System.out.print(a[i]);
				System.out.print(" ");
					}
				else
				{
				System.out.print(a[i]);
				}
		}

			return 0;
	}

}

