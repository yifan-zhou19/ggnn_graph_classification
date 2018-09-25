package <missing>;

public class GlobalMembers
{
	/*
	 * modular.cpp
	 * ?? - ????????????????????????
	 * ????????????????????????
	a)  ???????????????????
	b)  ???????????
	c)  ??????????
	d)  ?????????
	??????????????????????????
	 *
	 *  Created on: 2013-11-20
	 *      Author: ???
	 */
	public static int m;
	public static int n;
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static void input()
	{ // ??
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < m; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i < n; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void sequence()
	{ // ????
		for (int i = 0; i < m - 1; i++)
		{
			for (int j = m - 1; j > i; j--)
			{
				if (a[j - 1] > a[j])
				{
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = n - 1; j > i; j--)
			{
				if (b[j - 1] > b[j])
				{
					int temp = b[j - 1];
					b[j - 1] = b[j];
					b[j] = temp;
				}
			}
		}
	}
	public static void combination()
	{ // ? b ??? a
		for (int i = m; i < m + n; i++)
		{
			a[i] = b[i - m];
		}
	}
	public static void output()
	{ // ??
		System.out.print(a[0]);
		for (int i = 1; i < m + n; i++)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		input();
		sequence();
		combination();
		output();
		return 0;
	}

}

