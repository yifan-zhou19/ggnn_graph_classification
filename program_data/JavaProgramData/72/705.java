package <missing>;

public class GlobalMembers
{
	/*
	 * 4.cpp
	 *
	 *  Created on: 2011-12-27
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int[][] a = new int[25][25];
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= m - 1; i++)
		{
			for (j = 0; j <= n - 1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i <= m - 1; i++)
		{
			for (j = 0; j <= n - 1; j++)
			{
				if ((i == 0 || a[i - 1][j] <= a[i][j]) && (i == m - 1 || a[i + 1][j] <= a[i][j]) && (j == 0 || a[i][j - 1] <= a[i][j]) && (j == n - 1 || a[i][j + 1] <= a[i][j]))
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

