package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  Created on: 2013-1-19
	 *      Author: sony
	 */
	public static int Main()
	{
		int[][] a = new int[30][30];
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < n + 1;j++)
		{
			a[0][j] = 0;
			a[m + 1][j] = 0;

		}
		for (i = 0;i < m + 1;i++)
		{
			a[i][0] = 0;
			a[i][n + 1] = 0;
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m + 1;i++)
		{
			for (j = 0;j < n + 1;j++)
			{
				if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i][j + 1]) && (i != 0) && (i != m + 1) && (j != 0) && (j != n + 1))
				{
					System.out.print(i - 1);
					System.out.print(' ');
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

