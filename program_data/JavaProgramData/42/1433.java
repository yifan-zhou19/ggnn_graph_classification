package <missing>;

public class GlobalMembers
{
	/*
	 * sanchushuzu.cpp
	 *??????????
	 *  Created on: 2012-11-2
	 *      Author: ??
	 */

	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //????
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			if (a[i] != k)
			{
				num++;
			}
		}
		for (i = 0; i < n; i++)
		{
			if (a[i] != k)
			{
				a[j] = a[i];
				j++;
			} //????
		}
		if (a[0] != k)
		{
			System.out.print(a[0]);
		}
		for (i = 1; i < j; i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}
}

