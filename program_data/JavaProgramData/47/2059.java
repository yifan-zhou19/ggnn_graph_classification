package <missing>;

public class GlobalMembers
{
	/*
	 * 20121113-8.cpp
	 *
	 *  Created on: 2012-11-20
	 *      Author: ???
	 */



	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1;j <= n;j++)
		{
			b[j] = a[n + 1 - j]; //??
		}
		System.out.print(b[1]);
		for (k = 2;k <= n;k++)
		{
			System.out.print(" ");
			System.out.print(b[k]);
		}
		return 0;
	}

}

