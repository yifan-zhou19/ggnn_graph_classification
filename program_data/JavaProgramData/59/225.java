package <missing>;

public class GlobalMembers
{
	/*
	 * kaoshi4.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */

	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int s = 0;
		int[][] a = new int[101][101];
		char[][] pan = new char[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				pan[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (pan[i][j] == '@')
				{
					a[i][j] = 1;
				}
				else
				{
					a[i][j] = 0;
				}
			}
		}
		while (m > 1)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (pan[i][j] == '@' && a[i][j] == 1)
					{
						if ((i - 1) >= 0 && pan[i - 1][j] == '.')
						{
							pan[i - 1][j] = '@';
						}
						if ((i + 1) < n && pan[i + 1][j] == '.')
						{
							pan[i + 1][j] = '@';
						}
						if ((j - 1) >= 0 && pan[i][j - 1] == '.')
						{
							pan[i][j - 1] = '@';
						}
						if ((j + 1) < n && pan[i][j + 1] == '.')
						{
							pan[i][j + 1] = '@';
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
					for (j = 0;j < n;j++)
					{
						if (pan[i][j] == '@')
						{
							a[i][j] = 1;
						}

					}
			}
			m--;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (pan[i][j] == '@')
				{
					s++;
				}
			}
		}
		System.out.print(s);
		return 0;


	}

}

