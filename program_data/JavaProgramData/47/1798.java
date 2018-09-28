package <missing>;

public class GlobalMembers
{
	/*
	 * 3.cpp
	 *????
	 *  Created on: 2012-11-5
	 *      Author: ???
	*/
	public static int Main()
	{
		int N;
		int i;
		int j;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = N;
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[n - 1]);
		for (j = 1;j < n;j++)
		{
			System.out.print(" ");
			System.out.print(a[n - 1 - j]);
		}
	}

}

