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
		int[] num = new int[300];
		int t = 0;
		int k = 0;
		double average;
		double sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + num[i];
		}
		average = sum / n;
		for (i = 0;i < n;i++)
		{
			if ((average - num[i]) > (average - num[t]))
			{
				t = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((num[i] - average) > (num[k] - average))
			{
				k = i;
			}
		}
		if ((num[k] - average) == (average - num[t]))
		{
			System.out.print(num[t]);
			System.out.print(',');
			System.out.print(num[k]);
			System.out.print("\n");
		}
		else if ((num[k] - average) > (average - num[t]))
		{
			System.out.print(num[k]);
			System.out.print("\n");
		}
		else
		{
			System.out.print(num[t]);
		}
		return 0;
	}

}

