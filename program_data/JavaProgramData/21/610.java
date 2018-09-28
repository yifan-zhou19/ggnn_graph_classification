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
		int max;
		int min;
		double sum;
		double k;
		int[] a = new int[305];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		max = min = a[0];
		sum = a[0];
		for (i = 1; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
			if (a[i] > max)
			{
				max = a[i];
			}
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		k = (double)sum / n;
		if ((max - k) > (k - min))
		{
			System.out.print(max);
		}
		else if ((max - k) < (k - min))
		{
			System.out.print(min);
		}
		else
		{
			System.out.print(min);
			System.out.print(",");
			System.out.print(max);
		}
		return 0;
	}

}

