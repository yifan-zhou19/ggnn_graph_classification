package <missing>;

public class GlobalMembers
{
	/*
	 * fx06.cpp
	 *
	 *  Created on: 2013-1-12
	 *      Author: SONY
	 */
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int c = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[n][n];
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (m > 1)
	{
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					if (a[i + 1][j] == '.' && i + 1 < n)
					{
						a[i + 1][j] = '*';
					}
					if (a[i - 1][j] == '.' && i - 1 >= 0)
					{
						a[i - 1][j] = '*';
					}
					if (a[i][j + 1] == '.' && j + 1 < n)
					{
						a[i][j + 1] = '*';
					}
					if (a[i][j - 1] == '.' && j - 1 >= 0)
					{
						a[i][j - 1] = '*';
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '*')
				{
					a[i][j] = '@';
				}
			}
		}
		m--;
	}
	for (i = 0;i < n;i++)
	{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					c++;
				}
			}
	}
	System.out.print(c);
	return 0;
	}
}

