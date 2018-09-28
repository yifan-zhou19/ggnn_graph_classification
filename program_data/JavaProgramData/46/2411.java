package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[101][101];
		int[][] f = new int[101][101];
		final int[] dx = {0, 1, 0, -1};
		final int[] dy = {1, 0, -1, 0};
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i <= m + 1; i++)
		{
			for (int j = 0; j <= n + 1; j++)
			{
				f[i][j] = 1;
			}
		}
		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				f[i][j] = 0;
			}
		}
		int x = 1;
		int y = 1;
		int p = 0;
		for (int i = 1; i <= m * n; i++)
		{
			System.out.print(a[x][y]);
			System.out.print("\n");
			f[x][y] = 1;
			if (f[x + dx[p]][y + dy[p]] == 0)
			{
				x += dx[p];
				y += dy[p];
			}
			else
			{
				p++;
				if (p == 4)
				{
					p = 0;
				}
				x += dx[p];
				y += dy[p];
			}
		}
		return 0;
	}

}

