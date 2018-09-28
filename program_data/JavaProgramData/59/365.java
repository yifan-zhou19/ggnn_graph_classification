package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int t = 0;
		int k;
		char[][] a = new char[102][102];
		char[][] b = new char[102][102];
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
		for (k = 0;k < m - 1;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (b[i][j] == '@')
					{
						if (b[i - 1][j] != '#')
						{
							a[i - 1][j] = '@';
						}
						if (b[i + 1][j] != '#')
						{
							a[i + 1][j] = '@';
						}
						if (b[i][j - 1] != '#')
						{
							a[i][j - 1] = '@';
						}
						if (b[i][j + 1] != '#')
						{
							a[i][j + 1] = '@';
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					b[i][j] = a[i][j];
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
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

