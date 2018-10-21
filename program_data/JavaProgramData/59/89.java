package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 1100012870 liwenpeng
	 */
	public static char[][] c = new char[101][101];
	public static char[][] a = new char[101][101];
	public static int n;

	public static void flu(int x,int y)
	{
		if (x != 0 && c[x - 1][y] == '.')
		{
			c[x - 1][y] = '@';
		}
		if (y != 0 && c[x][y - 1] == '.')
		{
			c[x][y - 1] = '@';
		}
		if (x != n - 1 && c[x + 1][y] == '.')
		{
			c[x + 1][y] = '@';
		}
		if (y != n - 1 && c[x][y + 1] == '.')
		{
			c[x][y + 1] = '@';
		}
	}

	public static int Main()
	{
		int j;
		int i;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				c[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				a[i][j] = a[i][j];
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1;k <= m;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '@')
					{
						flu(i, j);
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = c[i][j];
				}
			}
		}
		int ans = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (c[i][j] == '@')
				{
					ans++;
				}
			}
		}
		System.out.print(ans);
		return 0;
	}
}

