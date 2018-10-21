package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] map = new int[200][200];
		int[][] b = new int[200][200];
		int[] dx = {0, -1, 0, 1};
		int[] dy = {-1, 0, 1, 0};
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				char ch;
				ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (ch == '.')
				{
					map[i][j] = 0;
				}
				else if (ch == '#')
				{
					map[i][j] = -1;
				}
				else
				{
					map[i][j] = 1;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m--;
		while (m != 0)
		{
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					b[i][j] = map[i][j];
				}
			}
			m--;

			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (map[i][j] == 1)
					{
						for (int k = 0;k < 4;k++)
						{
							int tx = i + dx[k];
							int ty = j + dy[k];
							if (map[tx][ty] == 0)
							{
								b[tx][ty] = 1;
							}
						}
					}
				}
			}
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					map[i][j] = b[i][j];
				}
			}
		}
		int ans = 0;
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (map[i][j] == 1)
				{
					ans++;
				}
			}
		}
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}
}

