package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-11-19
	 *      Author: ???
	 *      Function??????????????????????
	 *
	 */

	public static int temp;
	public static int m;
	public static int n;
	public static int[] a = new int[100];
	public static int[] b = new int[100];

	public static void scanf()
	{ //??
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
	public static void bubblesorta()
	{ //???????????
		for (int i = 0; i < m; i++)
		{
			for (int j = 1; j < m - i; j++)
			{
				if (a[j] < a[j - 1])
				{
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}

	}
	public static void bubblesortb()
	{ //???????????
		for (int i = 0; i < n; i++)
		{
			for (int j = 1; j < n - i; j++)
			{
				if (b[j] < b[j - 1])
				{
					temp = b[j];
					b[j] = b[j - 1];
					b[j - 1] = temp;
				}
			}
		}

	}

	public static void printf()
	{ //??
		for (int i = 0; i < m; i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(a[i]);
			}
		}
			for (int i = 0; i < n; i++)
			{
				System.out.print(" ");
				System.out.print(b[i]);
			}
	}
		public static int Main()
		{

			scanf();
			bubblesorta();
			bubblesortb();
			printf();
			return 0;
		}

}

