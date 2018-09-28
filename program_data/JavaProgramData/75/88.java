package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2013-1-13
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int[] x = new int[2200];
		int[] y = new int[1100];
		int max = 0;
		int t = 0;
		int cnt = 0;
		int i;
		int j = 0;
		int k = 0;
		int len = 0;
		while ((x[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			char c = System.in.read();
			if (c == '\n')
			{
				cnt++;
			}
			k++;
			if (cnt == 2)
			{
				break;
			}
		}
		for (i = k / 2; i < k; i++)
		{
			y[j] = x[i];
			j++;
		}
		len = k / 2;
		System.out.print(len);
		System.out.print(" ");
		for (i = 0; i < len; i++)
		{
			t = 0;
			for (j = 0; j < len; j++)
			{
				if (x[j] <= x[i] != 0 && y[j] > x[i])
				{
					t++;
				}
			}
			if (max < t)
			{
				max = t;
			}
			t = 0;
			for (j = 0; j < len; j++)
			{
				if (x[j] <= y[i] != 0 && y[j] > y[i])
				{
					t++;
				}
			}
			if (max < t)
			{
				max = t;
			}
		}
		System.out.print(max);
		System.out.print("\n");
	}

}

