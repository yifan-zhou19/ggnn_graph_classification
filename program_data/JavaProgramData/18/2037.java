package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int min1;
	public static int[][] a = new int[110][110];
	public static void del()
	{
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			for (j = 1;j < m;j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 1;j < m;j++)
			{
				a[j][i] = a[j + 1][i];
			}
		}
	}
	public static void delmin(int x,int y,int dx,int dy)
	{
		if (x == m || y == m)
		{
			return;
		}
		if (a[x][y] < min1)
		{
			min1 = a[x][y];
		}
		delmin(x + dx, y + dy, dx, dy);
		a[x][y] -= min1;
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		int k = 0;
		int sum = 0;
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (sum = 0,m = n;m > 1;m--)
			{
				for (i = 0;i < 2 * m;i++)
				{
					min1 = 10000;
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

