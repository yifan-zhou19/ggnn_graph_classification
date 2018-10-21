package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int mini;
	public static int[][] a = new int[110][110];
	public static void findmin(int x, int y, int dx, int dy)
	{
		if (x == m)
		{
			return;
		}
		if (y == m)
		{
			return;
		}
		if (a[x][y] < mini)
		{
			mini = a[x][y];
		}
		findmin(x + dx, y + dy, dx, dy);
		a[x][y] = a[x][y] - mini;
	}
	public static void kill()
	{
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
		for (j = 1;j < m;j++)
		{
		a[j][i] = a[j + 1][i];
		}
		}
		for (i = 0;i < m;i++)
		{
		for (j = 1; j < m; j++)
		{
		a[i][j] = a[i][j + 1];
		}
		}

	}
	public static int Main()
	{
		int i;
		int j;
		int sum;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (sum = 0,m = n;m >= 1;m--)
			{
				for (i = 0;i < 2 * m;i++)
				{
					mini = 10000;
					findmin((i % m) * (1 - i / m), (i % m) * (i / m), i / m, 1 - i / m);
				}
				sum = sum + a[1][1];
				kill();
			}
			System.out.print(sum);
			System.out.print("\n");
		}
	}
}

