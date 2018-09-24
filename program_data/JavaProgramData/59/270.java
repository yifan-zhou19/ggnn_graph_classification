package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		int p;
		int q;
		p = 0;
		q = 0;
		char[][] a = new char[102][102];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '@')
				{
					p++;
				}
				if (a[i][j] == '#')
				{
					q++;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n + 1;i++)
		{
			for (j = 0;j <= n + 1;j++)
			{
				if (i == 0 || j == 0 || i == n + 1 || j == n + 1)
				{
					a[i][j] = '#';
				}
			}
		}
		for (k = 0;k < m - 1;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if ((a[i][j] == '.') && ((a[i - 1][j] == '@') || (a[i + 1][j] == '@') || (a[i][j - 1] == '@') || (a[i][j + 1] == '@')))
					{
						a[i][j] = '*';
						p++;
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == '*')
					{
						a[i][j] = '@';
					}
				}
			}
		}
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}
}

