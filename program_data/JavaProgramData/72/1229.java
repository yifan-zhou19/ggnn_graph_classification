package <missing>;

public class GlobalMembers
{
	public static void sr(int[][] a)
	{
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
	}
	public static int sd(int i, int j, int[][] a)
	{
		int s = 0;
		if (i == 0)
		{
			if (j == 0)
			{
			if (a[i][j] < a[0][1] || a[i][j] < a[1][0])
			{
				s = 1;
			}
			}
			else if (j == n - 1)
			{
				if (a[i][j] < a[0][n - 2] || a[i][j] < a[1][n - 1])
				{
					s = 1;
				}
			}
			else if (a[i][j] < a[i][j - 1] || a[i][j] < a[i][j + 1] || a[i][j] < a[1][j])
			{
				s = 1;
			}
		}
		else if (i == m - 1)
		{
			if (j == 0)
			{
				if (a[i][j] < a[i - 1][j] || a[i][j] < a[i][j + 1])
				{
					s = 1;
				}
			}
			else if (j == n - 1)
			{
				if (a[i][j] < a[i][j - 1] || a[i][j] < a[i - 1][j])
				{
					s = 1;
				}
			}
			else if (a[i][j] < a[i][j - 1] || a[i][j] < a[i][j + 1] || a[i][j] < a[i - 1][j])
			{
				s = 1;
			}
		}
		else
		{
			if (j == 0)
			{
				if (a[i][j] < a[i - 1][j] || a[i][j] < a[i + 1][j] || a[i][j] < a[i][j + 1])
				{
					s = 1;
				}
			}
			else if (j == n - 1)
			{
				if (a[i][j] < a[i][j - 1] || a[i][j] < a[i - 1][j] || a[i][j] < a[i + 1][j])
				{
					s = 1;
				}
			}
			else if (a[i][j] < a[i][j - 1] || a[i][j] < a[i][j + 1] || a[i][j] < a[i - 1][j] || a[i][j] < a[i + 1][j])
			{
				s = 1;
			}
		}
		return s;
	}
	public static int n;
	public static int m;
	public static int Main()
	{
		int[][] a = new int[20][20];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		sr(a);
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sd(i, j, a) == 0)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
		return 0;
	}
}

