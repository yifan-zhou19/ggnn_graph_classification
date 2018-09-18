package <missing>;

public class GlobalMembers
{
	public static int n; //n??????n*n,????sum
	public static int m;
	public static int mymin;
	public static int[][] a = new int[110][110]; //??a
	public static void delmin(int x, int y, int dx, int dy)
	{
		if (x == m || y == m)
		{
			return;
		}
		if (a[x][y] < mymin)
		{
			mymin = a[x][y];
		}
		delmin(x + dx, y + dy, dx, dy);
		a[x][y] -= mymin;
	}
	public static void del()
	{
		int i;
		int j;
		for (i = 0; i < m; i++)
		{
			for (j = 1; j < m; j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (i = 0; i < m; i++)
		{
			for (j = 1; j < m; j++)
			{
				a[j][i] = a[j + 1][i];
			}
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int sum;
		int t;
		for ((n, t = 0; t < n; t++ = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (sum = 0,m = n; m >= 1; m--)
			{
				for (i = 0; i < 2 * m; i++)
				{
					mymin = 10000;
					delmin((i % m) * (1 - i / m), (i % m) * (i / m), i / m, 1 - i / m);
				}
				sum += a[1][1];
				del();
			}
			System.out.print(sum);
			System.out.print("\n");
		}
	}

}

