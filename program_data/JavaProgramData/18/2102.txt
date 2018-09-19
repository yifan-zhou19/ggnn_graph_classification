package <missing>;

public class GlobalMembers
{
	public static int minrow(int[][] a, int i, int m)
	{
		int b = a[i][0];
		int j;
		for (j = 0;j < m;j++)
		{
			if (a[i][j] < b)
			{
				b = a[i][j];
			}
		}
		return b;
	}
	public static int mincolumn(int[][] a, int j, int m)
	{
		int b = a[0][j];
		int i;
		for (i = 0;i < m;i++)
		{
			if (a[i][j] < b)
			{
				b = a[i][j];
			}
		}
		return b;
	}
	public static void row(int[][] a, int m)
	{
		int i;
		int j;
		int b;
		for (i = 0;i < m;i++)
		{
			b = minrow(a, i, m);
			for (j = 0;j < m;j++)
			{
				a[i][j] = a[i][j] - b;
			}
		}
	}
	public static void column(int[][] a, int m)
	{
		int i;
		int j;
		int b;
		for (j = 0;j < m;j++)
		{
			b = mincolumn(a, j, m);
			for (i = 0;i < m;i++)
			{
				a[i][j] = a[i][j] - b;
			}
		}
	}
	public static void del(int[][] a, int m)
	{
		int i;
		int j;
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 1;j < m;j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
	}
	public static void print(int[][] a, int m)
	{
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[100][100];
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int b = 0;
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
			m = n;
			for (j = 0;j < n - 1;j++)
			{
				row(a, m);
				column(a, m);
				b = b + a[1][1];
				del(a, m);
				m--;
			}
			System.out.printf("%d\n",b);
		}
		return 0;
	}
}

