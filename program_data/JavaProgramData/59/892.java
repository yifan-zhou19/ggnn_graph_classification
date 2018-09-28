package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static char[][] c =
	{
		{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	public static int[][] nextt =
	{
		{1, 0},
		{-1, 0},
		{0, 1},
		{0, -1}
	};
	//. ???# ??@ ???& ????
	public static void flu(int dep)
	{
		int i;
		int j;
		int k;
		if (dep == m)
		{
			return;
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (c[i][j] == '@')
				{
					for (k = 0;k <= 3;k++)
					{
						int x;
						int y;
						x = i + nextt[k][0];
						y = j + nextt[k][1];
						if (c[x][y] == '.')
						{
							c[x][y] = '&';
						}
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (c[i][j] == '&')
				{
					c[i][j] = '@';
				}
			}
		}
		flu(dep + 1);
	}
	public static int Main()
	{
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				c[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		flu(1);
		int total = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (c[i][j] == '@')
				{
					total++;
				}
			}
		}
		System.out.print(total);
		return 0;
	}
}

