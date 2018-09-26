package <missing>;

public class GlobalMembers
{
	/*
	 * nbp.cpp
	 *
	 *  Created on: 2012-11-6
	 *      Author: Lsj
	 */
	public static int Main()
	{
		int n; //??????n?i
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1000]; //????
		int[] b = new int[1000];
		int[] p = new int[1000];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		if (a[0] >= 90 && a[0] <= 140 && b[0] >= 60 && b[0] <= 90)
		{
			p[0] = 1;
		}
		else
		{
			p[0] = 0; //???????????????p[0]=1????0
		}
		for (i = 1;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
					p[i] = 1 + p[i - 1];
			}
				else
				{
					p[i] = 0; //????????????????????p????????0
				}
		}
		for (i = 1;i < n;i++)
		{
			if (p[i] < p[i - 1])
			{
				p[i] = p[i - 1];
			}
		} //?p[]?????
		System.out.print(p[n - 1]);
		return 0;
	}
}

