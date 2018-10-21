package <missing>;

public class GlobalMembers
{
	/*
	 * 1234.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */
	public static int Main()
	{
		int i;
		int c = 0;
		int t = 0;
		int n;
		double sum = 0;
		double[] a = new double[301];
		double[] b = new double[301];
		double s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			sum += a[i];
		}
		s = sum / n;
		double max = 0;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(s - a[i]) >= max)
			{
			max = Math.abs(s - a[i]);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(s - a[i]) == max)
			{
				b[t++] = a[i];
			c++;
			}
		}
		for (i = 0;i < c - 1;i++)
		{
			System.out.print(b[i]);
			System.out.print(",");
		}
		System.out.print(b[c - 1]);
		System.out.print("\n");

		return 0;
	}


}

