package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int day = 0;
		int num = 0;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[101][101];
		char c;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				c = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (c == '.')
				{
					a[i][j] = -1; //healthy
				}
				else
				{
					if (c == '#')
					{
						a[i][j] = 0; //void
					}
					else
					{
						a[i][j] = 1; //sick
					}
				}
			}
		}
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (day = 2; day <= m; day++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (a[i][j] == day - 1)
					{
						if (i >= 2 && a[i - 1][j] == -1)
						{
							a[i - 1][j] = day;
						}
						if (i <= n - 1 && a[i + 1][j] == -1)
						{
							a[i + 1][j] = day;
						}
						if (j >= 2 && a[i][j - 1] == -1)
						{
							a[i][j - 1] = day;
						}
						if (j <= n - 1 && a[i][j + 1] == -1)
						{
							a[i][j + 1] = day;
						}
					}
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] > 0)
				{
					num++;
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}

}

