package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int m = 0;
		int n = 0;
		int x = 0;
		int[] b = new int[400];
		int[] c = new int[400];
		int[][] a = new int[20][20];
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
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i == 0 && j == 0)
				{
					if (a[0][0] >= a[0][1] != 0 && a[0][0] >= a[1][0])
					{
						b[x] = i;
						c[x] = j;
						x++;
					}
				}
				if (i == 0 && j == n - 1)
				{
					if (a[0][n - 1] >= a[0][n - 2] != 0 && a[0][n - 1] >= a[1][n - 1])
					{
						b[x] = i;
						c[x] = j;
						x++;
					}
				}
				if (i == 0 && j != 0 && j != n - 1)
				{
					if (a[0][j] >= a[0][j - 1] != 0 && a[0][j] >= a[0][j + 1] != 0 && a[0][j] >= a[1][j])
					{
						b[x] = i;
						c[x] = j;
						x++;
					}
				}
				if (j == 0 && i != 0 && i != m - 1)
				{
					if (a[i][0] >= a[i - 1][0] != 0 && a[i][0] >= a[i + 1][0] != 0 && a[i][0] >= a[i][1])
					{
						b[x] = i;
						c[x] = j;
						x++;
					}
				}
				if (j == 0 && i == m - 1)
				{
					if (a[m - 1][0] >= a[m - 2][0] != 0 && a[m - 1][0] >= a[m - 1][1])
					{
						b[x] = i;
						c[x] = j;
						x++;
					}
				}
				if (i == m - 1 && j != 0 && j != n - 1)
				{
					if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
					{
						b[x] = i;
						c[x] = j;
						x++;
					}
				}
				if (i == m - 1 && j == n - 1)
				{
					if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j])
					{
						b[x] = i;
						c[x] = j;
						x++;
					}
				}
				if (j == n - 1 && i != 0 && i != m - 1)
				{
					if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1])
					{
						b[x] = i;
						c[x] = j;
						x++;
					}
				}
				if (i != 0 && j != 0 && i != m - 1 && j != n - 1)
				{
					if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
					{
						b[x] = i;
						c[x] = j;
						x++;
					}
				}
			}
		}
		for (i = 0;i < x;i++)
		{
			System.out.printf("%d %d",b[i],c[i]);
			if (i != x - 1)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}

}

