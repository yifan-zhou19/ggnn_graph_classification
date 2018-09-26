package <missing>;

public class GlobalMembers
{
	/*
	 * findpoint.cpp
	 * ????
	 *  Created on: 2012-11-18
	 *      Author: ???
	 */
	public static int max(int x, int y)
	{
		if (x >= y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int min(int x, int y)
	{
		if (x <= y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int Main()
	{
		int i;
		int k;
		int[][] a = new int[6][6];
		int Y = 0;
		int[] max1 = new int[6];
		int[] min1 = new int[6];
		for (i = 1; i <= 5; i++)
		{
			for (k = 1; k <= 5; k++)
			{
				a[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= 5; i++)
		{
			max1[i] = max(a[i][1], max(a[i][2], max(a[i][3], max(a[i][4], a[i][5]))));
		}
		for (k = 1; k <= 5; k++)
		{
			min1[k] = min(a[1][k], min(a[2][k], min(a[3][k], min(a[4][k], a[5][k]))));
		}
		for (i = 1; i <= 5; i++)
		{
			for (k = 1; k <= 5; k++)
			{
				if (max1[i] == min1[k])
				{
					Y = 1;
					System.out.print(i);
					System.out.print(' ');
					System.out.print(k);
					System.out.print(' ');
					System.out.print(a[i][k]);
					System.out.print("\n");
				}
			}
		}
		if (Y == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

