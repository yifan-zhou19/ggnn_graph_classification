package <missing>;

public class GlobalMembers
{
	/*
	 * h.cpp
	 *
	 *  Created on: 2013-11-1
	 *      Author: Administrator
	 */

	public static char[][] a = new char[105][105];
	public static char[][] b = new char[105][105];
	public static int Main()
	{
		int n = 0;
		int i;
		int j;
		int k;
		int p;
		int q;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 2;k <= m;k++)
		{
			for (i = 1;i <= n;i++)
			{
						for (j = 1;j <= n;j++)
						{
							b[i][j] = a[i][j];
						}
			}
			for (i = 1;i <= n;i++)
			{
					for (j = 1;j <= n;j++)
					{
						if (a[i][j] == '@')
						{
							b[i][j] = '@';
							for (p = -1;p <= 1;p++)
							{
								for (q = -1;q <= 1;q++)
								{
									if (p == q || p == (-q))
									{
										continue;
									}

									if (a[i + p][j + q] == '#')
									{
										b[i + p][j + q] = '#';
									}
									else
									{
										b[i + p][j + q] = '@';
									}

								}
							}
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
		System.out.print("\n");
		return 0;
	}
}

