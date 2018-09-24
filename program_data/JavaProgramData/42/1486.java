package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *????????
	 *  Created on: 2012-11-6
	 *      Author: ???
	 */
	public static int Main()
	{
		int N;
		int k;
		int i;
		int j;
		int m;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = N;
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < n;j++)
		{
			if (a[j] != k)

			{
				System.out.print(a[j]);
				m = j + 1;
				break; //????????k?????????
			}
		}
		for (m;m < n;m++)
		{
			if (a[m] != k)
			{
				System.out.print(" ");
				System.out.print(a[m]);
			}
		}

	}

}

