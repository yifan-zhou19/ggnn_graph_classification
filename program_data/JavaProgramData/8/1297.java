package <missing>;

public class GlobalMembers
{
	/*
	 * step.cpp
	 *
	 *  Created on: 2013-12-1
	 *      Author: ???1300012996
	 */
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static int i;
	public static int j;
	public static int m;
	public static int n;
	public static void read()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return;
	}
	public static void place()
	{
		int s;
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < m - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					s = a[j];
					a[j] = a[j + 1];
					a[j + 1] = s;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					s = b[j];
					b[j] = b[j + 1];
					b[j + 1] = s;
				}
			}
		}
		return;
	}
	public static void together()
	{
		for (i = 0;i < m;i++)
		{
			c[i] = a[i];
		}
		for (i = m;i < m + n;i++)
		{
			c[i] = b[i - m];
		}
		return;
	}
	public static void put()
	{
		for (i = 0;i < m + n;i++)
		{
			if (i == 0)
			{
				System.out.print(c[i]);
			}
			else
			{
				System.out.print(' ');
				System.out.print(c[i]);
			}
		}
		return;
	}


	public static int Main()
	{
		read();
		place();
		together();
		put();
		return 0;
	}

}

