package <missing>;

public class GlobalMembers
{
	public static final int[] dx = {0, 1, 0, -1};
	public static final int[] dy = {1, 0, -1, 0};
	public static int n;
	public static int m;
	public static int[][] a = new int[110][110];
	public static int[][] v = new int[110][110];

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; ++i)
		{
			for (int j = 0; j < m; ++j)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int x = 0;
		int y = 0;
		int cnt = 0;
		int now = 0;
		while (cnt < n * m)
		{
			++cnt;
			v[x][y] = 1;
			System.out.print(a[x][y]);
			System.out.print("\n");
			if (x + dx[now] < 0 || x + dx[now] >= n != 0 || y + dy[now] < 0 || y + dy[now] >= m)
			{
				now = (now + 1) % 4;
			}
			else
			{
				if (v[x + dx[now]][y + dy[now]] == 1)
				{
					now = (now + 1) % 4;
				}
			}
			x += dx[now];
			y += dy[now];
		}
		return 0;
	}


}

