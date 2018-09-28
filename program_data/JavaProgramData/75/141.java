package <missing>;

public class GlobalMembers
{
	/*
	 * zhaopinhuirenshu.cpp
	 *
	 *  Created on: 2011-12-22
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] time = new int[1000];
		int i = 0;
		int k = 0;
		int j;
		int max = 0;
		do
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		} while ((System.in.read()) != '\n');
		do
		{
			b[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k++;
		} while ((System.in.read()) != '\n');
		for (int p = 0;p < i;p++)
		{
			for (j = a[p];j < b[p];j++)
			{
				time[j]++;
			}
		}
		for (int p = 0;p < 1000;p++)
		{
			if (time[p] > max)
			{
				max = time[p];
			}
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

