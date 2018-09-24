package <missing>;

public class GlobalMembers
{
	/*
	 * exam.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[500];
		int i;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		double average = (double)sum / n;
		double[] b = new double[500];
		int[] c = new int[500];
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(average - a[i]);
		}
		double max = 0;
		int k = 0;
		for (i = 0;i < n;i++)
		{
			if (max < b[i])
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (max == b[i])
			{
				c[k++] = a[i];
			}
		}
		int j;
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - i - 1;j++)
			{
				if (c[j] > c[j + 1])
				{
					int temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.print(c[i]);
			System.out.print(",");
		}
		System.out.print(c[i]);
		System.out.print("\n");
		return 0;
	}

}

