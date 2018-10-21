package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */


	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int num = 1;
		int[] a = new int[500];
		double aver;
		double c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		aver = 1.0 * sum / n;
		c = Math.abs(aver - a[0]);
		for (i = 1;i < n;i++)
		{
			if (Math.abs(aver - a[i]) == c)
			{
				num++;
			}
			if (Math.abs(aver - a[i]) > c)
			{
				c = Math.abs(aver - a[i]);
				num = 1;
			}
		}
		if (num == 1)
		{
			for (i = 0;i < n;i++)
			{
				if (c == Math.abs(aver - a[i]))
				{
					System.out.print(a[i]);
				}
			}
		}
		if (num > 1)
		{
			int g = 0;
			int h = 0;
			for (i = 0;i < n;i++)
			{
				if (c == (aver - a[i]))
				{
					g = 1;
					System.out.print(a[i]);
					break;
				}
			}
			i++;
			for (;i < n;i++)
			{
				if (c == (aver - a[i]))
				{
					System.out.print(",");
					System.out.print(a[i]);
				}
			}
			if (g != 1)
			{
				for (i = 0;i < n;i++)
				{
					if (c == (a[i] - aver))
					{
						h = 1;
						System.out.print(a[i]);
						break;
					}
				}
			}
			if (h == 1)
			{
				i++;
			}
			if (g == 1)
			{
				i = 0;
			}
			for (;i < n;i++)
			{
				if (c == (a[i] - aver))
				{
					System.out.print(",");
					System.out.print(a[i]);
				}
			}
		}
		return 0;
	}

}

