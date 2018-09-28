package <missing>;

public class GlobalMembers
{
	/*
	 * 115.cpp
	 * ????????????????????????
	 *  Created on: 2012-11-20
	 *      Author: Salforever
	 */



	public static int[] x = new int[10000];
	public static int[] y = new int[10000];
	public static int[] z = new int[100000];
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int temp;
	public static void dq()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	public static void px()
	{
		for (i = 1;i <= m - 1;i++) //??
		{
			for (j = m;j >= i + 1;j--)
			{
				if (x[j] <= x[j - 1])
				{
				temp = x[j];
				x[j] = x[j - 1];
				x[j - 1] = temp;
				}
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			for (j = n;j >= i + 1;j--)
			{
				if (y[j] <= y[j - 1])
				{
				temp = y[j];
				y[j] = y[j - 1];
				y[j - 1] = temp;
				}
			}
		}
	}

	public static void hb()
	{
		for (i = 1;i <= m;i++) //??
		{
			z[i] = x[i];
		}
		for (i = 1;i <= n;i++)
		{
			z[i + m] = y[i];
		}
	}

	public static void xs()
	{
		for (i = 1;i < m + n;i++) //??
		{
			System.out.print(z[i]);
			System.out.print(' ');
		}
		System.out.print(z[m + n]);
		System.out.print("\n");
	}

	public static int Main()
	{
		dq(); //??
		px(); //??
		hb(); //??
		xs(); //??
		return 0; //????
	}

}

