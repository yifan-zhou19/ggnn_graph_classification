package <missing>;

public class GlobalMembers
{
	public static int row(int[][] a, int l, int m)
	{
		int i;
		int min = a[m][0];
		for (i = 0;i < l + 1;i++)
		{
			if (min > a[m][i])
			{
				min = a[m][i];
			}
		}
		return min;
	}
	public static int line(int[][] a, int l, int m)
	{
		int i;
		int min = a[0][m];
		for (i = 0;i < l + 1;i++)
		{
			if (min > a[i][m])
			{
				min = a[i][m];
			}
		}
		return min;
	}
	public static void move(int[][] a, int l)
	{
		int i;
		int j;
		for (i = 1;i < l + 1;i++)
		{
			a[0][i] = a[0][i + 1];
			a[i][0] = a[i + 1][0];
		}
		for (i = 1;i < l + 1;i++)
		{
			for (j = 1;j < l + 1;j++)
			{
			a[i][j] = a[i + 1][j + 1];
			}
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			int l;
			int[][] a = new int[100][100];
			int sum = 0;
			int x;
			int y;
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[j][k] = Integer.parseInt(tempVar2);
					}
				}
			}
			for (l = n - 1;l >= 0;l--)
			{
				for (x = 0;x < l + 1;x++)
				{
					int d = row(a, l, x);
					for (y = 0;y < l + 1;y++)
					{
						a[x][y] = a[x][y] - d;
					}
				}
				for (x = 0;x < l + 1;x++)
				{
					int e = line(a, l, x);
					for (y = 0;y < l + 1;y++)
					{
						a[y][x] = a[y][x] - e;
					}
				}
				sum += a[1][1];
				move(a, l);
			}
			System.out.printf("%d\n",sum);
		}
	}

}

