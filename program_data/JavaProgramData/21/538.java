package <missing>;

public class GlobalMembers
{
	/*
	 * j1.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */
	public static int Main()
	{
		int n;
		int i;
		int r;
		int p = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double sum = 0.0;
		double[] a = new double[301];
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		double b = sum / n;
		double d = Math.abs(a[0] - b);
		double max = a[0];
		for (i = 1;i < n;i++)
		{
			if (Math.abs(a[i] - b) >= d)
			{
					d = Math.abs(a[i] - b);
					max = a[i];
					r = i;
			}
		}
		for (i = 0;i < r;i++)
		{
			if (Math.abs(a[i] - b) == d)
			{
				p++;
				if (a[i] < max)
				{
					System.out.print(a[i]);
					System.out.print(',');
					System.out.print(max);
				}
				else
				{
					System.out.print(max);
					System.out.print(',');
					System.out.print(a[i]);
				}
			}
		}
		if (p == 0)
		{
			System.out.print(max);
		}
		return 0;
	}
}

