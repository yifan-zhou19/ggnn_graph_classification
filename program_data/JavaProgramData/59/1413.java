package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][][] a = new char[100][100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[0][i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int d = 1;d < m;d++)
		{
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					a[d][i][j] = a[0][i][j];
				}
			}
		}
		for (int d = 1;d < m;d++)
		{
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					if (a[d - 1][i][j] == '@')
					{
						if (i + 1 <= n)
						{
							if (a[d - 1][i + 1][j] != '#')
							{
								a[d][i + 1][j] = '@';
							}
						}
						if (i - 1 >= 0)
						{
							if (a[d - 1][i - 1][j] != '#')
							{
								a[d][i - 1][j] = '@';
							}
						}
						if (j + 1 <= n)
						{
							if (a[d - 1][i][j + 1] != '#')
							{
								a[d][i][j + 1] = '@';
							}
						}
						if (j - 1 >= 0)
						{
							if (a[d - 1][i][j - 1] != '#')
							{
								a[d][i][j - 1] = '@';
							}
						}
					}
				}
			}
		}
		int p = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (a[m - 1][i][j] == '@')
				{
					p += 1;
				}
			}
		}
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}
}

