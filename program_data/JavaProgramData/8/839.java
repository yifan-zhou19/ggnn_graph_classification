package <missing>;

public class GlobalMembers
{
	/*
	 * XII7.cpp
	 *
	 *  Created on: 2012-11-23
	 *      Author:???
	 *       ??????????????????????????
	 */
	public static int[] a = new int[100];
	public static void ranking(int n,int m)
	{ //??????????n?m??????
		int i;
		int j;
		int p;
		for (i = n;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = n;j < m - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
				p = a[j];
				a[j] = a[j + 1];
				a[j + 1] = p;
				} //?????
			}
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ranking(0, n);
		ranking(n, n + m); //????????
		System.out.print(a[0]);
		for (i = 1;i < m + n;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
	}

}

