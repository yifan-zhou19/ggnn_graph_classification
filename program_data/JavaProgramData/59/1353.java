package <missing>;

public class GlobalMembers
{
	/*
	 * ???? .cpp
	 *
	 *  Created on: 2013-1-18
	 *      Author: sony
	 */
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int t = 0;
		char[][] a = new char[110][110];
			char[][] b = new char[110][110];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k++)
		{
					for (i = 0;i < n;i++)
					{
				for (j = 0;j < n;j++)
				{
								b[i][j] = '.';
				}
					}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '@')
					{
						if ((j > 0) && (a[i][j - 1] == '.'))
						{
							b[i][j - 1] = '@';
						}
						if ((j < n - 1) && (a[i][j + 1] == '.'))
						{
							b[i][j + 1] = '@';
						}
						if ((i > 0) && (a[i - 1][j] == '.'))
						{
							b[i - 1][j] = '@';
						}
						if ((i < n - 1) && (a[i + 1][j] == '.'))
						{
							b[i + 1][j] = '@';
						}
					}
				}
			}
					for (i = 0;i < n;i++)
					{
				for (j = 0;j < n;j++)
				{
								if (b[i][j] == '@')
								{
									a[i][j] = '@';
								}
				}
					}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					t++;
				}
			}
		}
		System.out.print(t);
		System.out.print("\n");
		return 0;

	}
}

