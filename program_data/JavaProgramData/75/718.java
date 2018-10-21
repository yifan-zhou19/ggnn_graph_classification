package <missing>;

public class GlobalMembers
{
	/*
	 * wanyi.cpp
	 *
	 *  Created on: 2012-11-10
	 *      Author: 7
	 */
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		char a;
		int i = 0;
		int j;
		int num = 0;
		int max = 0;
		int n;
		int minx = 10000;
		int maxy = 0;
		while ((x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (x[i] < minx)
			{
				minx = x[i];
			}
			i++;
			cin.get(a);
			if (a == '\n')
			{
				break;
			}
		}
		n = i;
		i = 0;
		while ((y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (y[i] > maxy)
			{
				maxy = y[i];
			}
				i++;
				cin.get(a);
				if (a == '\n' || i > n)
				{
					break;
				}
		}
		for (i = minx;i < maxy;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i >= x[j] != 0 && i < y[j])
				{
					num++;
					if (num > max)
					{
						max = num;
					}
				}
			}
			num = 0;
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
	}

}

