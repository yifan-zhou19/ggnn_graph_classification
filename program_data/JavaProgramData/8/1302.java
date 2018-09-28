package <missing>;

public class GlobalMembers
{
	/*
	 * function2.7.cpp
	 *
	 *  Created on: 2013-12-1
	 *      Author: st
	 */

	public static int[] a = new int[20];
	public static int[] b = new int[20];
	public static int[] c = new int[40];
	public static void read(int x1,int x2)
	{
		int i;
		for (i = 0;i < x1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < x2;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return;
	}
	public static void sort1(int n)
	{
		int k;
		int j;
		int tem;
		for (k = 1;k < n;k++)
		{
			for (j = 0;j < n - k;j++)
			{
				if (a[j] > a[j + 1])
				{
						tem = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tem;
				}
			}
		}
		return;
	}
	public static void sort2(int n)
	{
		int k;
		int j;
		int tem;
			for (k = 1;k < n;k++)
			{
				for (j = 0;j < n - k;j++)
				{
					if (b[j] > b[j + 1])
					{
							tem = b[j];
						b[j] = b[j + 1];
						b[j + 1] = tem;
					}
				}
			}
			return;
	}
	public static void combine(int n1,int n2)
	{
		int i;
	for (i = 0;i < n1;i++)
	{
		c[i] = a[i];
	}
		for (i = n1;i < n1 + n2;i++)
		{
			c[i] = b[i - n1];
		}
		return;
	}

	public static void arraycout(int n1,int n2)
	{
		int i;
		System.out.print(c[0]);
		for (i = 1;i < n1 + n2;i++)
		{
			System.out.print(" ");
			System.out.print(c[i]);
		}
		return;

	}
	public static int Main()
	{
		int n1;
		int n2;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		read(n1, n2);
		sort1(n1);
		sort2(n2);
		combine(n1, n2);
		arraycout(n1, n2);
		return 0;

	}

}

