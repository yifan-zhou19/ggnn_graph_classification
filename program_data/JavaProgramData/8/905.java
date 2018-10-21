package <missing>;

public class GlobalMembers
{
	/*
	 * 007.cpp
	 *
	 *  Created on: 2012-11-28
	 *      Author: asus
	 */

	public static int m = 0;
	public static int n = 0;
	public static int[] a = new int[20];
	public static int[] b = new int[20];
	public static int[] c = new int[40];
	public static void input()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= m; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 1; j <= n; j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	public static void sort()
	{
		for (int j = 1; j < m; j++)
		{
			for (int i = 1; i <= m - j; i++)
			{
				if (a[i] > a[i + 1])
				{
					int p = a[i];
					a[i] = a[i + 1];
					a[i + 1] = p;
				}
			}
		}
		for (int j = 1; j < n; j++)
		{
				for (int i = 1; i <= n - j; i++)
				{
					if (b[i] > b[i + 1])
					{
						int p = b[i];
						b[i] = b[i + 1];
						b[i + 1] = p;
					}
				}
		}
	}

	public static void combine()
	{
		for (int i = 1; i <= m; i++)
		{
			c[i] = a[i];
		}
		for (int j = 1; j <= n; j++)
		{
			c[m + j] = b[j];
		}
	}

	public static void print()
	{
		for (int i = 1; i < m + n; i++)
		{
			System.out.print(c[i]);
			System.out.print(" ");
		}
		System.out.print(c[m + n]);
		System.out.print("\n");
	}

	public static int Main()
	{
		input();
		sort();
		combine();
		print();
		return 0;
	}
}

