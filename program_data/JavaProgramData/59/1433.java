package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] m = new int[102][102];
		int d;
		int ans = 0;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				char x;
				x = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (x == '.')
				{
					m[i][j] = 0;
				}
				if (x == '@')
				{
					m[i][j] = 1;
				}
				if (x == '#')
				{
					m[i][j] = -1;
				}
			}
		}
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k < d; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (m[i][j] == 1)
					{
						if (m[i - 1][j] == 0)
						{
							m[i - 1][j] = 2;
						}
						if (m[i + 1][j] == 0)
						{
							m[i + 1][j] = 2;
						}
						if (m[i][j - 1] == 0)
						{
							m[i][j - 1] = 2;
						}
						if (m[i][j + 1] == 0)
						{
							m[i][j + 1] = 2;
						}
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (m[i][j] == 2)
					{
						m[i][j] = 1;
					}
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
				for (j = 1; j <= n; j++)
				{
					if (m[i][j] == 1)
					{
						ans++;
					}
				}
		}
		System.out.print(ans);
		return 0;
	}
}

