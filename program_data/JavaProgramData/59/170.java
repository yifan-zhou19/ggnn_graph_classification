package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int count = 0;
		char[][] s = new char[102][102];
		for (i = 0; i < 102; i++)
		{
			for (j = 0; j < 102; j++)
			{
				s[i][j] = '#';
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				s[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k < m; k++)
		{
			int[][] a = new int[102][102];
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (s[i][j] == '@' && a[i][j] == 0)
					{
						if (s[i - 1][j] == '.')
						{
							s[i - 1][j] = '@';
							a[i - 1][j] = 1;
						}
						if (s[i + 1][j] == '.')
						{
							s[i + 1][j] = '@';
							a[i + 1][j] = 1;
						}
						if (s[i][j - 1] == '.')
						{
							s[i][j - 1] = '@';
							a[i][j - 1] = 1;
						}
						if (s[i][j + 1] == '.')
						{
							s[i][j + 1] = '@';
							a[i][j + 1] = 1;
						}
					}
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (s[i][j] == '@')
				{
					count++;
				}
			}
		}
		System.out.print(count);
		System.out.print("\n");
		return 0;
	}

}

