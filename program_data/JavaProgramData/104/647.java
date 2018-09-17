package <missing>;

public class GlobalMembers
{
	/*
	 * 111110_03_tree.cpp
	 *
	 *  Created on: 2011-11-10
	 *      Author: Alfalfa
	 */
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int[] k1 = new int[1000];
		int[] k2 = new int[1000];
		int m = 0;
		int n = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;x >= 1;i++) //??????x?????? ????k1
		{
			k1[i] = x;
			x = (x - x % 2) / 2;
			m++;
		}
		for (i = 0;y >= 1;i++) //y????k2
		{
			k2[i] = y;
			y = (y - y % 2) / 2;
			n++;
		}
		for (i = 0;i < m;i++) //?k1 k2???????
		{
			for (j = 0;j < n;j++)
			{
				if (k1[i] == k2[j])
				{
					System.out.print(k1[i]);
					i = 1001;
				}
			}
		}
		return 0;
	}

}

