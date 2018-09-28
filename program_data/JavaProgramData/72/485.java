package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[20][20];
		int i;
		int u;
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
			for (u = 0;u < n;u++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][u] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (u = 0;u < n;u++)
			{
				if (i != 0 && u != 0 && i != m - 1 && u != n - 1)
				{
					if (a[i][u] >= a[i + 1][u] != 0 && a[i][u] >= a[i - 1][u] != 0 && a[i][u] >= a[i][u + 1] != 0 && a[i][u] >= a[i][u - 1])
					{
						System.out.printf("%d %d\n",i,u);
					}
				}
				else if (i == 0 && u != 0 && u != n - 1)
				{
					if (a[i][u] >= a[i + 1][u] != 0 && a[i][u] >= a[i][u + 1] != 0 && a[i][u] >= a[i][u - 1])
					{
						System.out.printf("%d %d\n",i,u);
					}
				}
				else if (i == m - 1 && u != 0 && u != n - 1)
				{
					if (a[i][u] >= a[i - 1][u] != 0 && a[i][u] >= a[i][u + 1] != 0 && a[i][u] >= a[i][u - 1])
					{
						System.out.printf("%d %d\n",i,u);
					}
				}
				else if (u == 0 && i != 0 && i != m - 1)
				{
					if (a[i][u] >= a[i + 1][u] != 0 && a[i][u] >= a[i - 1][u] != 0 && a[i][u] >= a[i][u + 1])
					{
						System.out.printf("%d %d\n",i,u);
					}
				}
				else if (u == n - 1 && i != 0 && i != m - 1)
				{
					if (a[i][u] >= a[i + 1][u] != 0 && a[i][u] >= a[i - 1][u] != 0 && a[i][u] >= a[i][u - 1])
					{
						System.out.printf("%d %d\n",i,u);
					}
				}
				else if (i == 0 && u == 0)
				{
					if (a[i][u] >= a[i + 1][u] != 0 && a[i][u] >= a[i][u + 1])
					{
						System.out.printf("%d %d\n",i,u);
					}
				}
				else if (i == 0 && u == n - 1)
				{
					if (a[i][u] >= a[i + 1][u] != 0 && a[i][u] >= a[i][u - 1])
					{
						System.out.printf("%d %d\n",i,u);
					}
				}
				else if (u == 0 && i == m - 1)
				{
					if (a[i][u] >= a[i - 1][u] != 0 && a[i][u] >= a[i][u + 1])
					{
						System.out.printf("%d %d\n",i,u);
					}
				}
				else
				{
					if (a[i][u] >= a[i - 1][u] != 0 && a[i][u] >= a[i][u - 1])
					{
						System.out.printf("%d %d\n",i,u);
					}
				}
			}
		}
		return 0;
	}
}

