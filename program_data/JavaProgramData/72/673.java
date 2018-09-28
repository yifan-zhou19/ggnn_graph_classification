package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-12-25
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[50][50];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i + 1][j] > a[i][j])
				{
					continue;
				}
				if (a[i][j + 1] > a[i][j])
				{
					continue;
				}
				if (i != 0 && a[i - 1][j] > a[i][j])
				{
					continue;
				}
				if (j != 0 && a[i][j - 1] > a[i][j])
				{
					continue;
				}
				System.out.print(i);
				System.out.print(' ');
				System.out.print(j);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

