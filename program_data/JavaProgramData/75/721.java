package <missing>;

public class GlobalMembers
{
	/*
	 * T22.cpp
	 *
	 *  Created on: 2012-11-10
	 *      Author: weiwan
	 */

	public static int Main()
	{
		int[] x = new int[1010];
		int[] y = new int[1010];
		int[] count = new int[1010];
		int xmin;
		int ymax;
		int countmax;
		int i;
		int j;
		int n = 0;
		char c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(count,0,(Integer.SIZE / Byte.SIZE));
		do
		{
			x[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n++;
			c = System.in.read();
		}while (c != '\n');
		n = 0;
		do
		{
			y[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n++;
			c = System.in.read();
		}while (c != '\n');

		xmin = x[0];
		for (i = 1;i < n;i++)
		{
			if (x[i] < xmin)
			{
				xmin = x[i];
			}
		}

		ymax = y[0];
		for (i = 1;i < n;i++)
		{
			if (y[i] > ymax)
			{
				ymax = y[i];
			}
		}

		for (i = xmin;i <= ymax;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (x[j] <= i != 0 && y[j] > i)
				{
					count[i]++;
				}
			}
		}

		countmax = count[0];
		for (i = xmin;i <= ymax;i++)
		{
			if (count[i] > countmax)
			{
				countmax = count[i];
			}
		}

		System.out.print(n);
		System.out.print(' ');
		System.out.print(countmax);
		System.out.print("\n");

		return 0;
	}
}

