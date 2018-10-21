package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[102][102];
		int m;
		int n;
		int i;
		int j;
		int k;
		int p = 0;
		int[][] b = new int[200][200];
		int[][] c = new int[200][200];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= m;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= m;j++)
			{
				if (a[i][j] == '.')
				{
					b[i + 1][j + 1] = 0;
				}
				if (a[i][j] == '#')
				{
					b[i + 1][j + 1] = -10000;
				}
				if (a[i][j] == '@')
				{
					b[i + 1][j + 1] = 1;
				}
			}
		}
		for (i = 2;i <= m + 1;i++)
		{
			for (j = 2;j <= m + 1;j++)
			{
				c[i][j] = 0;
			}
		}
		for (k = 0;k < n - 1;k++)
		{
			for (i = 2;i <= m + 1;i++)
			{
				for (j = 2;j <= m + 1;j++)
				{
					if (b[i][j] > 0)
					{
						c[i][j] = 1;
					}
				}
			}
			for (i = 2;i <= m + 1;i++)
			{
				for (j = 2;j <= m + 1;j++)
				{
					if (c[i][j] == 1)
					{
						b[i][j + 1]++;
						b[i][j - 1]++;
						b[i + 1][j]++;
						b[i - 1][j]++;
					}
				}
			}
		for (i = 2;i <= m + 1;i++)
		{
			for (j = 2;j <= m + 1;j++)
			{
				c[i][j] = 0;
			}
		}
		}
		for (i = 2;i <= m + 1;i++)
		{
				for (j = 2;j <= m + 1;j++)
				{
					if (b[i][j] > 0)
					{
						p++;
					}
				}
		}
		System.out.print(p);
		return 0;
	}
}

