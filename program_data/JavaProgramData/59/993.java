package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		char[][] a = new char[110][110];
		char[][] b = new char[110][110];
		for (i = 0;i < 110;i++)
		{
			for (j = 0;j < 110;j++)
			{
				a[i][j] = '#';
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 110;i++)
		{
				for (j = 0;j < 110;j++)
				{
					b[i][j] = a[i][j];
				}
		}
		for (k = 1;k < m;k++)
		{
			for (i = 1;i <= n;i++)
			{
					for (j = 1;j <= n;j++)
					{
						if (a[i][j] == '@')
						{
							if (a[i][j - 1] != '#')
							{
								b[i][j - 1] = '@';
							}
							if (a[i][j + 1] != '#')
							{
														b[i][j + 1] = '@';
							}
							if (a[i + 1][j] != '#')
							{
														b[i + 1][j] = '@';
							}
							if (a[i - 1][j] != '#')
							{
														b[i - 1][j] = '@';
							}
						}
					}
			}
			for (i = 0;i < 110;i++)
			{
						for (j = 0;j < 110;j++)
						{
							a[i][j] = b[i][j];
						}
			}
		}
		k = 0;
		for (i = 1;i <= n;i++)
		{
					for (j = 1;j <= n;j++)
					{
						if (a[i][j] == '@')
						{
							k++;
						}
					}
		}
		System.out.print(k);
		return 0;
	}

}

