package <missing>;

public class GlobalMembers
{
	public static void find(int[][] s, int x, int y, int m, int n)
	{
		if (x == 0 && y == 0)
		{
			if ((s[x][y] >= s[x + 1][y]) && (s[x][y] >= s[x][y + 1]))
			{
				System.out.print(x);
				System.out.print(' ');
				System.out.print(y);
				System.out.print("\n");
			}
			return;
		}
		if (x == m && y == n)
		{
			if ((s[x][y] >= s[x - 1][y]) && (s[x][y] >= s[x][y - 1]))
			{
				System.out.print(x);
				System.out.print(' ');
				System.out.print(y);
				System.out.print("\n");
			}
			return;
		}
		if (x == m && y == 0)
		{
			if ((s[x][y] >= s[x][y + 1]) && (s[x][y] >= s[x - 1][y]))
			{
				System.out.print(x);
				System.out.print(' ');
				System.out.print(y);
				System.out.print("\n");
			}
			return;
		}
		if (x == 0 && y == n)
		{
			if ((s[x][y] >= s[x + 1][y]) && (s[x][y] >= s[x][y - 1]))
			{
				System.out.print(x);
				System.out.print(' ');
				System.out.print(y);
				System.out.print("\n");
			}
			return;
		}
		if (x == 0)
		{
			if ((s[x][y] >= s[x][y + 1]) && (s[x][y] >= s[x][y - 1]) && (s[x][y] >= s[x + 1][y]))
			{
				System.out.print(x);
				System.out.print(' ');
				System.out.print(y);
				System.out.print("\n");
			}
			return;
		}
		if (y == 0)
		{
			if ((s[x][y] >= s[x][y + 1]) && (s[x][y] >= s[x + 1][y]) && (s[x][y] >= s[x - 1][y]))
			{
						System.out.print(x);
						System.out.print(' ');
						System.out.print(y);
						System.out.print("\n");
			}
					return;
		}
		if (x == m)
		{
			if ((s[x][y] >= s[x][y + 1]) && (s[x][y] >= s[x][y - 1]) && (s[x][y] >= s[x - 1][y]))
			{
						System.out.print(x);
						System.out.print(' ');
						System.out.print(y);
						System.out.print("\n");
			}
					return;
		}
		if (y == n)
		{
			if ((s[x][y] >= s[x][y - 1]) && (s[x][y] >= s[x + 1][y]) && (s[x][y] >= s[x - 1][y]))
			{
								System.out.print(x);
								System.out.print(' ');
								System.out.print(y);
								System.out.print("\n");
			}
							return;
		}
		if ((s[x][y] >= s[x - 1][y]) && (s[x][y] >= s[x + 1][y]) && (s[x][y] >= s[x][y - 1]) && (s[x][y] >= s[x][y + 1]))
		{
			System.out.print(x);
			System.out.print(' ');
			System.out.print(y);
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[22][22];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				find(a, i, j, m - 1, n - 1);
			}
		}
		return 0;
	}

}

