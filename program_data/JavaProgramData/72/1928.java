package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
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
		int[][] sz = new int[m][n];
		int[][] zs = new int[m][n];
		for (int i = 0;i < m;i++)
		{
			for (int x = 0;x < n;x++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][x] = Integer.parseInt(tempVar3);
				}
				zs[i][x] = 1;
			}
		}
		for (int i = 0;i < m;i++)
		{
			if (i == 0)
			{
				for (int x = 0;x < n;x++)
				{
					if (sz[i][x] >= sz[i + 1][x])
					{
						zs[i][x] = zs[i][x] * 1;
					}
					else
					{
						 zs[i][x] = zs[i][x] * 0;
					}
				}
			}
			if (i > 0 && i < m - 1)
			{
				for (int x = 0;x < n;x++)
				{
					if (sz[i][x] >= sz[i + 1][x])
					{
						zs[i][x] = zs[i][x] * 1;
					}
					else
					{
						 zs[i][x] = zs[i][x] * 0;
					}
					if (sz[i][x] >= sz[i - 1][x])
					{
						zs[i][x] = zs[i][x] * 1;
					}
					else
					{
						 zs[i][x] = zs[i][x] * 0;
					}
				}
			}
			if (i == m - 1)
			{
				for (int x = 0;x < n;x++)
				{
					if (sz[i][x] >= sz[i - 1][x])
					{
						zs[i][x] = zs[i][x] * 1;
					}
					else
					{
						 zs[i][x] = zs[i][x] * 0;
					}
				}
			}
		}
		for (int x = 0;x < n;x++)
		{
			if (x == 0)
			{
				for (int i = 0;i < m;i++)
				{
					if (sz[i][x] >= sz[i][x + 1])
					{
						zs[i][x] = zs[i][x] * 1;
					}
					else
					{
						 zs[i][x] = zs[i][x] * 0;
					}
				}
			}
			if (x > 0 && x < n - 1)
			{
				for (int i = 0;i < m;i++)
				{
					if (sz[i][x] >= sz[i][x + 1])
					{
						zs[i][x] = zs[i][x] * 1;
					}
					else
					{
						 zs[i][x] = zs[i][x] * 0;
					}
					if (sz[i][x] >= sz[i][x - 1])
					{
						zs[i][x] = zs[i][x] * 1;
					}
					else
					{
						 zs[i][x] = zs[i][x] * 0;
					}
				}
			}
			if (x == n - 1)
			{
				for (int i = 0;i < m;i++)
				{
					if (sz[i][x] >= sz[i][x - 1])
					{
						zs[i][x] = zs[i][x] * 1;
					}
					else
					{
						 zs[i][x] = zs[i][x] * 0;
					}
				}
			}
		}
		for (int i = 0;i < m;i++)
		{
			for (int x = 0;x < n;x++)
			{
				if (zs[i][x] == 1)
				{
					System.out.printf("%d %d\n",i,x);
				}
			}
		}
	return 0;
	}

}

