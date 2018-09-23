package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int the_min;
	public static int[][] a = new int[110][110];

	public static void reduce_min(int x, int y, int dx, int dy)
	{
		if (x == m || y == m)
		{
			return;
		}
		if (a[x][y] < the_min)
		{
			the_min = a[x][y];
		}
		reduce_min(x + dx, y + dy, dx, dy);
		a[x][y] -= the_min;
	}

	public static void reduce()
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
		int t;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (t = 0; t < n; t++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i][j] = Integer.parseInt(tempVar2);
					}
				}
			}
			sum = 0;
			for (m = n; m >= 1; m--)
			{
				for (i = 0; i < 2 * m; i++)
				{
					the_min = 10000;
					reduce_min((i % m) * (1 - i / m), (i % m) * (i / m), i / m, 1 - i / m);
				}
				sum += a[1][1];
				reduce();
			}
			System.out.printf("%d\n", sum);
		}
	}
}

