package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-12-19
	 *      Author: 1100012870
	 */
	public static int Main()
	{
		int[] x = new int[1001];
		int[] y = new int[1001];
		int[] a = new int[1001];
		int i;
		int ans;
		int l = 1;
		char p;
		p = System.in.read();
		while (p != '\n')
		{
			if (p == ',')
			{
				p = System.in.read();
				l++;
			}
			x[l] = x[l] * 10 + p - '0';
			p = System.in.read();
		}
		System.out.print(l);
		System.out.print(' ');
		l = 1;
		p = System.in.read();
		while (p != '\n')
		{
			if (p == ',')
			{
				p = System.in.read();
				l++;
			}
			y[l] = y[l] * 10 + p - '0';
			p = System.in.read();
		}
		for (i = 1;i <= l;i++)
		{
			for (int j = x[i];j < y[i];j++)
			{
				a[j]++;
			}
		}
		ans = 0;
		for (i = 0;i <= 1000;i++)
		{
			if (ans < a[i])
			{
				ans = a[i];
			}
		}
		System.out.print(ans);
		return 0;
	}
}
