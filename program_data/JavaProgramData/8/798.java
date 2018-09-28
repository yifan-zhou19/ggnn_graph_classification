package <missing>;

public class GlobalMembers
{
	/*
	 * wanyi.cpp
	 *
	 *  Created on: 2012-11-14
	 *      Author: 7
	 */
	public static int n;
	public static int m;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static void in()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < m;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void pai(int[] p, int k)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - i - 1;j++)
			{
				if (p[j] > p[j + 1])
				{
					temp = p[j];
					p[j] = p[j + 1];
					p[j + 1] = temp;
				}
			}
		}
	}
	public static void he()
	{
		int i;
		for (i = 0;i < n;i++)
		{
			c[i] = a[i];
		}
		for (i = 0;i < m;i++)
		{
			c[i + n] = b[i];
		}
	}
	public static void out()
	{
		int i;
		System.out.print(c[0]);
		for (i = 1;i < n + m;i++)
		{
			System.out.print(" ");
			System.out.print(c[i]);
		}
	}
	public static int Main()
	{
		in();
		pai(a, n);
		pai(b, m);
		he();
		out();
	}

}

