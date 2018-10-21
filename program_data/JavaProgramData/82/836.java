package <missing>;

public class GlobalMembers
{
	/*
	 * 4.cpp
	 *?????????????
	 *  Created on: 2012-10-19
	 *      Author: ??
	 */

	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] d = new int[n];
		for (i = 0;i < n;i++)
		{
			d[i] = 0; //?????0??????????
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (90 <= a[i] != 0 && a[i] <= 140 && 60 <= b[i] != 0 && b[i] <= 90)
			{
				c[i] = 1;
			}
			else
			{
				c[i] = 0; //?????1?????0
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] == 1)
			{
				d[j] = d[j] + 1;
			}
			else
			{
				j++; //???????????????j????
			}
		}
		int tmax = 0;
		for (j = 0;j < n;j++)
		{
			if (tmax < d[j])
			{
				tmax = d[j]; //????
			}
		}
		System.out.print(tmax);
		return 0;
	}
}

