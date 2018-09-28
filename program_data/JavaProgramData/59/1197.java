package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int sum = 0;
		char[][] a = new char[102][102];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		for (i = 0; i <= n + 1; i++)
		{
			a[0][i] = ' ';
			a[i][0] = ' ';
			a[n + 1][i] = ' ';
			a[i][n + 1] = ' ';
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
						if (a[i - 1][j] == '.')
						{
							a[i - 1][j] = '+';
						}
						if (a[i + 1][j] == '.')
						{
							a[i + 1][j] = '+';
						}
						if (a[i][j - 1] == '.')
						{
							a[i][j - 1] = '+';
						}
						if (a[i][j + 1] == '.')
						{
							a[i][j + 1] = '+';
						}
					}
					else
					{
						continue;
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (a[i][j] == '+')
					{
						a[i][j] = '@';
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
					sum++;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
	}
}

