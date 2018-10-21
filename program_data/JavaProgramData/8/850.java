package <missing>;

public class GlobalMembers
{
	/*
	 * mokuai.cpp
	 *
	 *  Created on: 2012-11-25
	 *      Author: wangyinzhi
	 */

	public static int f(int x,int y)
	{
		int[] a = new int[x];
		int[] b = new int[y];
		int t;
		int i;
		int j;
		for (i = 0;i < x;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < y;j++)
		{
				b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //??

		for (i = 0;i < x - 1;i++)
		{
			for (j = 0;j < x - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t; //????
				}
			}
		}
		for (i = 0;i < y - 1;i++)
		{
			for (j = 0;j < y - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t; //????
				}
			}
		}
		for (i = 0;i < x;i++)
		{
			if (i == 0)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
		for (i = 0;i < y;i++)
		{
		   System.out.print(" ");
		   System.out.print(b[i]);
		}
	}

	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(x, y); //??
		return 0;
	}

}

