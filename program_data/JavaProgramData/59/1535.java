package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
		int m;
		int k;
		char[][] a = new char[102][102];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n + 1;i++)
		{
			for (j = 0;j <= n + 1;j++)
			{
				a[0][j] = '#';
				a[n + 1][j] = '#';
				a[i][0] = '#';
				a[i][n + 1] = '#';
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = m - 1;
		for (k = 0;k < m;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == '.')
					{
						if ((a[i + 1][j] == '@') || (a[i - 1][j] == '@') || (a[i][j + 1] == '@') || (a[i][j - 1] == '@'))
						{
							a[i][j] = '$';
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == '$')
					{
						a[i][j] = '@';
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == '@')
				{
					sum = sum + 1;
				}
			}
		}
		System.out.print(sum);
		return 0;
	}
}

