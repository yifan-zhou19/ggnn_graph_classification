package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[101][101];
		char[][] e = new char[101][101];
		int n;
		int m;
		int i;
		int j;
		int k;
		int count;
		count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				e[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= m; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					s[i][j] = e[i][j];
				}
			}
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (s[i][j] == '@')
					{
						if (i != 1)
						{
							if (s[i - 1][j] != '#')
							{
								e[i - 1][j] = '@';
							}
						}
						if (i != n)
						{
							if (s[i + 1][j] != '#')
							{
								e[i + 1][j] = '@';
							}
						}
						if (j != 1)
						{
							if (s[i][j - 1] != '#')
							{
								e[i][j - 1] = '@';
							}
						}
						if (j != n)
						{
							if (s[i][j + 1] != '#')
							{
								e[i][j + 1] = '@';
							}
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
		System.in.read();
		System.in.read();
		return 0;
	}
}

