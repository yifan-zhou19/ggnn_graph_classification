package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum;
		int m;
		int t;
		char[][] a = new char[200][200];
		char[][] b = new char[200][200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 0;
		for (i = 0; i <= n + 1; i++)
		{
			for (j = 0; j <= n + 1; j++)
			{
				if (i == 0 || i == n + 1 || j == 0 || j == n + 1)
				{
					a[i][j] = '#';
				}
				else
				{
					a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				}
			}
		}
		for (i = 0; i <= n + 1; i++)
		{
			for (j = 0; j <= n + 1; j++)
			{
				b[i][j] = a[i][j];
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 1; t < m; t++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (a[i][j] == '@')
					{
						if (a[i - 1][j] == '.')
						{
							b[i - 1][j] = '@';
						}
						if (a[i + 1][j] == '.')
						{
							b[i + 1][j] = '@';
						}
						if (a[i][j - 1] == '.')
						{
							b[i][j - 1] = '@';
						}
						if (a[i][j + 1] == '.')
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
					a[i][j] = b[i][j];
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
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

