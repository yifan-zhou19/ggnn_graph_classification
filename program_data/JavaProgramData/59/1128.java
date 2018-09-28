package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] b = new int[101][101];
		int i;
		int j;
		int k;
		char[][] a = new char[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= m - 1; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (a[i][j] == '@')
					{
						if (a[i - 1][j] == '.')
						{
							b[i - 1][j] = k;
						}
						if (a[i + 1][j] == '.')
						{
							b[i + 1][j] = k;
						}
						if (a[i][j - 1] == '.')
						{
							b[i][j - 1] = k;
						}
						if (a[i][j + 1] == '.')
						{
							b[i][j + 1] = k;
						}
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (b[i][j] == k)
					{
						a[i][j] = '@';
					}
				}
			}
		}
		k = 0;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] == '@')
				{
					k++;
				}
			}
		}
		System.out.print(k);
		System.out.print("\n");
		return 0;
	}
}

