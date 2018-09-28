package <missing>;

public class GlobalMembers
{
	/*
	 * shuzunixu.cpp
	 *???????
	 *  Created on: 2012-11-3
	 *      Author: ??
	 */

	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i <= 0.5 * (n - 1); i++)
		{
			swap(a[i], a[n - 1 - i]); //??
		}
		System.out.print(a[0]);
		for (i = 1; i < n; i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}
}

