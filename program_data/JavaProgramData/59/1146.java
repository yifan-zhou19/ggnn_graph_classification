package <missing>;

public class GlobalMembers
{
	/*
	 * homework3.cpp
	 *
	 *  Created on: 2012-12-4
	 *      Author: Lixurong
	 */

	public static int Main()
	{
		int n;
		int m;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			char[][] a = new char[n][n];
			int[][] b = new int[n][n];
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
					if (a[i][j] == '.')
					{
						b[i][j] = 0;
					}
					else if (a[i][j] == '#')
					{
						b[i][j] = -1;
					}
					else
					{
						b[i][j] = 1;
					}
				}
			}
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m--;
		for (int k = 1; k <= m; k++)
		{
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if (b[i][j] == k)
					{
						if (b[i][j - 1] == 0 && j - 1 >= 0)
						{
							b[i][j - 1] = k + 1;
						}
						if (b[i][j + 1] == 0 && j + 1 < n)
						{
							b[i][j + 1] = k + 1;
						}
						if (b[i - 1][j] == 0 && i - 1 >= 0)
						{
							b[i - 1][j] = k + 1;
						}
						if (b[i + 1][j] == 0 && i + 1 < n)
						{
							b[i + 1][j] = k + 1;
						}
					}
				}
			}
		}
		int s = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (b[i][j] > 0)
				{
					s++;
				}
			}
		}
		System.out.print(s);
		return 0;
	}

}

