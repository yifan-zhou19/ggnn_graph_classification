package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012763_26.cpp
	 *
	 *  Created on: 2010-11-3
	 *      Author: ??
	 *      ???????
	 */

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		//????????????
		for (i = n - 1; i > 0; i--)
		{
			for (k = i - 1; k >= 0; k--)
			{
				//??????????????0
				if (a[i] == a[k])
				{
					if (i == n - 1)
					{
						a[i] = 0;
						num++;
						break;
						//???????????
					}
					else
					{
						for (j = i; j < n - 1; j++)
						{
							a[j] = a[j + 1];
						}
						a[j] = 0;
						num++;
						break;
					}
				}
			}
		}
		//????????????0 ???
		System.out.print(a[0]);
		for (i = 1; i < n - num; i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

