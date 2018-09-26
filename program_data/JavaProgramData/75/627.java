package <missing>;

public class GlobalMembers
{
	/*
	 *@file 5.cpp
	 *@author ???
	 *@date 11?1?
	 *@description ?????
	 */

	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] t = new int[1000];
		int max;
		int i;
		int j;
		int k;
		max = 0;
		char ch;
		for (i = 0; ; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			if (ch != ',')
			{
				break;
			}
		}
		for (i = 0; ; i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			if (ch != ',')
			{
				break;
			}
		}
		for (j = 0; j <= i; j++)
		{
			for (k = x[j]; k < y[j]; k++)
			{
				t[k] = t[k] + 1;
				if (t[k] > max)
				{
					max = t[k];
				}
			}
		}

		System.out.print(i + 1);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}
}

