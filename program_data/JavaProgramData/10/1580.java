package <missing>;

public class GlobalMembers
{
	/*
	 * lanjiedaodan.cpp
	 *
	 *  Created on: 2010-9-29
	 *      Author: lz
	 */

	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[k];
		int[] num = new int[k];
		int i;
		int j;
		for (i = 0;i < k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num[i] = 1;
		}
	for (i = 0;i < k;i++)
	{
		for (j = 0;j < i;j++)
		{
			if (a[j] >= a[i])
			{
				if (num[i] < num[j] + 1)
				{
					num[i] = num[j] + 1;
				}
			}
		}
	}
	int max = 1;
	for (i = 0;i < k;i++)
	{
		if (num[i] > max)
		{
			max = num[i];
		}
	}
	System.out.print(max);
	return 0;

	}

}

