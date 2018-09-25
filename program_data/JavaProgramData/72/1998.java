package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int x;
		int y;
		int i;
		int j;
		int[][] sz = new int[N][N];
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
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0,j = 0;j <= n + 1;j++)
		{
			sz[0][j] = 0;
		}
		for (i = m + 1,j = 0;j <= n + 1;j++)
		{
			sz[m + 1][j] = 0;
		}
		for (i = 0,j = 0;i <= m + 1;i++)
		{
			sz[i][0] = 0;
		}
		for (i = 0,j = n + 1;i <= m + 1;i++)
		{
			sz[i][n + 1] = 0;
		}

		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (sz[i][j - 1] <= sz[i][j] != 0 && sz[i][j + 1] <= sz[i][j] != 0 && sz[i - 1][j] <= sz[i][j] != 0 && sz[i + 1][j] <= sz[i][j])
				{
					x = i - 1;
					y = j - 1;
					System.out.printf("%d %d\n",x,y);
				}
			}
		}
		return 0;
	}
}

