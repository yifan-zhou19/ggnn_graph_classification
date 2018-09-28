package <missing>;

public class GlobalMembers
{
	/*
	 * 2.cpp
	 *
	 *  Created on: 2013-12-13
	 *      Author: g199
	 */

	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] shan = new int[m + 2][n + 2];
		for (int i = 0; i <= m + 1; i++)
		{
			for (int j = 0; j <= n + 1; j++)
			{
				shan[i][j] = 0;
			}
		}
		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				shan[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (shan[i][j] >= shan[i - 1][j] != 0 && shan[i][j] >= shan[i + 1][j] != 0 && shan[i][j] >= shan[i][j - 1] != 0 && shan[i][j] >= shan[i][j + 1])
				{
					System.out.print(i - 1);
					System.out.print(" ");
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

