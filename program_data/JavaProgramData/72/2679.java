package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[20][20];
		int m;
		int n;
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
		for (int j = 0;j < m;j++)
		{
			for (int k = 0;k < n;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[j][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int i = 0;i < m;i++)
		{
			for (int t = 0;t < n;t++)
			{
				if ((i != 0) && (i != m - 1) && (t != 0) && (t != n - 1))
				{
					if ((sz[i][t] >= sz[i - 1][t]) && (sz[i][t] >= sz[i + 1][t]) && (sz[i][t] >= sz[i][t - 1]) && (sz[i][t] >= sz[i][t + 1]))
					{
						System.out.printf("%d %d\n",i,t);
					}
				}
				else if ((i == 0) && (t == 0))
				{
					if ((sz[0][0] >= sz[0][1]) && (sz[0][0] >= sz[1][0]))
					{
						System.out.printf("%d %d\n",i,t);
					}
				}
				else if ((i == 0) && (t == n - 1))
				{
					if ((sz[0][n - 1] >= sz[0][n - 2]) && (sz[0][n - 1] >= sz[1][n - 1]))
					{
						System.out.printf("%d %d\n",i,t);
					}
				}
				else if ((i == m - 1) && (t == 0))
				{
					if ((sz[m - 1][0] >= sz[m - 2][0]) && (sz[m - 1][0] >= sz[m - 1][1]))
					{
						System.out.printf("%d %d\n",i,t);
					}
				}
				else if ((i == m - 1) && (t == n - 1))
				{
					if ((sz[m - 1][n - 1] >= sz[m - 1][n - 2]) && (sz[m - 1][n - 1] >= sz[m - 2][n - 1]))
					{
						System.out.printf("%d %d\n",i,t);
					}
				}
				else if (i == 0)
				{
					if ((sz[i][t] >= sz[i + 1][t]) && (sz[i][t] >= sz[i][t - 1]) && (sz[i][t] >= sz[i][t + 1]))
					{
						System.out.printf("%d %d\n",i,t);
					}
				}
				else if (i == m - 1)
				{
					if ((sz[i][t] >= sz[i - 1][t]) && (sz[i][t] >= sz[i][t - 1]) && (sz[i][t] >= sz[i][t + 1]))
					{
						System.out.printf("%d %d\n",i,t);
					}
				}
				else if (t == 0)
				{
					if ((sz[i][t] >= sz[i - 1][t]) && (sz[i][t] >= sz[i + 1][t]) && (sz[i][t] >= sz[i][t + 1]))
					{
						System.out.printf("%d %d\n",i,t);
					}
				}
				else if (t == n - 1)
				{
					if ((sz[i][t] >= sz[i - 1][t]) && (sz[i][t] >= sz[i + 1][t]) && (sz[i][t] >= sz[i][t - 1]))
					{
						System.out.printf("%d %d\n",i,t);
					}
				}
			}
		}
		return 0;
	}
}

