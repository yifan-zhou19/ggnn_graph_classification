package <missing>;

public class GlobalMembers
{
	/*
	 * main.cpp
	 *
	 *  Created on: 2012-11-11
	 *      Author: ??
	 *      ????
	 */


	public static int Main()
	{
		char[][] a = new char[110][110];
		char[][] b = new char[110][110];
		int i;
		int j;
		int n;
		int m;
		int sum = 0;
		int t;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n + 1;i++)
		{
			a[0][i] = '#';
			a[n + 1][i] = '#';
			a[i][0] = '#';
			a[i][n + 1] = '#';
		}
		for (t = 1;t < m;t++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == '.')
					{
						if ((a[i][j - 1] == '@') || (a[i][j + 1] == '@') || (a[i - 1][j] == '@') || (a[i + 1][j] == '@'))
						{
							b[i][j] = '@';
						}
						else
						{
							b[i][j] = '.';
						}
					}
					else
					{
						b[i][j] = a[i][j];
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					a[i][j] = b[i][j];
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == '@')
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		return 0;
	}
}

