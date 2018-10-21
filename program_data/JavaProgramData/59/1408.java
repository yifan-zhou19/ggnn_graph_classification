package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int m;
		int x;
		int y;
		int z = 0;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 1;l <= m - 1;l++)
		{
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				if (a[i][j] == '@')
				{
					for (x = -1;x <= 1;x++)
					{
							if ((a[i + x][j] == '.') && (i + x <= n - 1) && (i + x >= 0))
							{
								b[i + x][j] = '@';
							}
					}
					for (y = -1;y <= 1;y++)
					{
							if ((a[i][j + y] == '.') && (j + y <= n - 1) && (j + y >= 0))
							{
								b[i][j + y] = '@';
							}
					}
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				if (b[i][j] == '@')
				{
					a[i][j] = '@';
				}
			}
		}

		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				if (a[i][j] == '@')
				{
					z++;
				}
			}
		}
		System.out.print(z);
		System.in.read();
		System.in.read();
		return 0;
	}


}

