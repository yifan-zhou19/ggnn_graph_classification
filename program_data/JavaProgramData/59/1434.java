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
		int p;
		int q;
		int y = 0;
		char[][] a = new char[101][101];
		char[][] b = new char[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				b[i][j] = a[i][j];
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == '@' && b[i][j] == '@')
					{
							if (a[i][j - 1] == '.')
							{
								a[i][j - 1] = '@';
							}
							if (a[i][j + 1] == '.')
							{
								a[i][j + 1] = '@';
							}
							if (a[i - 1][j] == '.')
							{
								a[i - 1][j] = '@';
							}
							if (a[i + 1][j] == '.')
							{
								a[i + 1][j] = '@';
							}
					}
				}
			}
			for (p = 1;p <= n;p++)
			{
				for (q = 1;q <= n;q++)
				{
					b[p][q] = a[p][q];
				}
			}
		}
		for (p = 1;p <= n;p++)
		{
				for (q = 1;q <= n;q++)
				{
					if (a[p][q] == '@')
					{
						y = y + 1;
					}
				}
		}
		System.out.print(y);
		return 0;
	}
}

