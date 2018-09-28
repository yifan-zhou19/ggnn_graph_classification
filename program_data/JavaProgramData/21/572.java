package <missing>;

public class GlobalMembers
{
	/*
	 * 2011-1-9.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int i;
		double m;
		double sum = 0;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		m = sum / n;

		int max = a[0];
		int min = a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
				if (a[i] < min)
				{
					min = a[i];
				}
		}
		if ((max - m) == (m - min))
		{
			System.out.print(min);
			System.out.print(',');
			System.out.print(max);
		}
		if ((max - m) > (m - min))
		{
			System.out.print(max);
		}
		if ((max - m) < (m - min))
		{
				System.out.print(min);
		}
		return 0;

	}

}

