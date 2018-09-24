package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[n + 2][n + 2];
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (m - 1 != 0)
	{
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == '@')
				{
					if (a[i][j - 1] == '.')
					{
						a[i][j - 1] = '^';
					}
					if (a[i][j + 1] == '.')
					{
						a[i][j + 1] = '^';
					}
					if (a[i - 1][j] == '.')
					{
						a[i - 1][j] = '^';
					}
					if (a[i + 1][j] == '.')
					{
						a[i + 1][j] = '^';
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == '^')
				{
					a[i][j] = '@';
				}
			}
		}
					m--;
	}
	int sum = 0;
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

