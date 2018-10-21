package <missing>;

public class GlobalMembers
{
	/*
	 * reverse.cpp
	 *
	 *  Created on: 2012-10-26
	 *      Author: 12001
	 */



	public static int Main()
	{
		int n;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n / 2;i++)
		{
			int tmp = a[i];
			a[i] = a[n - 1 - i];
			a[n - 1 - i] = tmp;
		}
		for (int i = 0;i < n;i++)
		{
			System.out.print(a[i]);
			if (i == n - 1)
			{
				System.out.print("\n");
			}
			else
			{
				System.out.print(' ');
			}
		}
		return 0;
	}

}

