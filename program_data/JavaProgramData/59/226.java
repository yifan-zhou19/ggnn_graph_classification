package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[101][101];
	public static char[][] b = new char[101][101];

	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		int count = 0;
		for (i = 1; i <= 100; i++)
		{
			for (j = 1; j <= 100; j++)
			{
				a[i][j] = '0';
				b[i][j] = '0';
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k < m; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (a[i][j] == '@')
					{
						b[i][j] = '@';
						if (a[i - 1][j] != '#')
						{
							b[i - 1][j] = '@';
						}
						if (a[i + 1][j] != '#')
						{
							b[i + 1][j] = '@';
						}
						if (a[i][j - 1] != '#')
						{
							b[i][j - 1] = '@';
						}
						if (a[i][j + 1] != '#')
						{
							b[i][j + 1] = '@';
						}
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (b[i][j] == '@')
					{
						a[i][j] = b[i][j];
					}
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] == '@')
				{
					count++;
				}
			}
		}
		System.out.print(count);
		return 0;
	}
}

