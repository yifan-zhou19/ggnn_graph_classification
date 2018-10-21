package <missing>;

public class GlobalMembers
{
	//**************************************
	//????:????                   **
	//??????                        **
	//???1100012763                    **
	//???2011.12.31                    **
	//**************************************
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int t;
		int x;
		int y;
		int count;
		int[][] day = new int[102][102];
		char[][] map = new char[102][102];
		int[][] zou =
		{
			{0, 0, 1, -1},
			{1, -1, 0, 0}
		};

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				map[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (map[i][j] == '@')
				{
					day[i][j] = 0;
				}
				else
				{
					day[i][j] = -1;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k < m; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (map[i][j] == '@' && day[i][j] == (k - 1))
					{
						for (t = 0; t <= 3; t++)
						{
							x = i + zou[0][t];
							y = j + zou[1][t];
							if (map[x][y] == '.')
							{
								map[x][y] = '@';
								day[x][y] = k;
							}
						}
					}
				}
			}
		}
		count = 0;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (map[i][j] == '@')
				{
					count++;
				}
			}
		}
		System.out.print(count);
		return 0;
	}
}

