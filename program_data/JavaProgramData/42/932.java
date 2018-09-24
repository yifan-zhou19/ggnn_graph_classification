package <missing>;

public class GlobalMembers
{
	/*
	 * 2222.cpp
	 *
	 *  Created on: 2011-10-21
	 *      Author: 11281
	 */
	public static int Main()
	{
		int n;
		int b;
		int c;
		int i;
		int j;
		int q;
		int k = 0;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (j = 0;j < n;j++)
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[j] = b;
		}
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] == c)
			{
				k = k + 1;
		for (q = i + 1;q <= n;q++)
		{
			a[q - 1] = a[q];
		}
		i = i - 1;
			}
		else
		{
			continue;
		}
		}
		for (s = 0;s < n - k - 1;s++)
		{
			System.out.print(a[s]);
			System.out.print(" ");
		}
		System.out.print(a[n - k - 1]);
		System.out.print("\n");
	return 0;
	}

}

