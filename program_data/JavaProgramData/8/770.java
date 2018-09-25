package <missing>;

public class GlobalMembers
{
	/*
	 * T7.cpp
	 *
	 *  Created on: 2012-11-19
	 *      Author:weiwan
	 *      Function:????????????
	 */

	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int A;
	public static int B;
	public static void read() //????????
	{
		int i;
		A = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		B = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < A;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < B;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void sort() //?????????????
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < A - 1;i++)
		{
			for (j = i + 1;j < A;j++)
			{
				if (a[j] < a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 0;i < B - 1;i++)
		{
			for (j = i + 1;j < B;j++)
			{
				if (b[j] < b[i])
				{
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
	}
	public static void conbine() //?????????
	{
		int i;
		for (i = 0;i < A;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		for (i = 0;i < B - 1;i++)
		{
			System.out.print(b[i]);
			System.out.print(' ');
		}
		System.out.print(b[B - 1]);
	}

	public static int Main()
	{
		read(); //??3???
		sort();
		conbine();
		return 0;
	}
}

