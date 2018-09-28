package <missing>;

public class GlobalMembers
{
	/********************************************
	 *@file   5.cpp                             *
	 *@author ??                              *
	 *@date   2013-11-1                         *
	 *@description                              *
	 *??????6??????                 *
	 ********************************************
	 */
	public static int Main()
	{
		int[] x = new int[1010];
		int[] y = new int[1010];
		int[] flag = new int[1010];
		int n;
		int k;
		int m;
		int p;
		int i = 1;
		int j = 1;
		int max = 0;
		char ch;
		x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ch = System.in.read();
		while (ch == ',')
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			ch = System.in.read();
		}


		y[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ch = System.in.read();
		while (ch == ',')
		{
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j++;
			ch = System.in.read();
		}
		n = i;
		for (k = 0; k < n; k++)
		{
			for (m = x[k]; m < y[k]; m++)
			{
				flag[m]++;
			}
		}
		for (p = 0; p < 1000; p++)
		{
			if (flag[p] > max)
			{
				max = flag[p];
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}
}

