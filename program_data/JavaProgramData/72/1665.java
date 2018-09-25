package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[21][21];
		int n;
		int m;
		int i;
		int j;
		int s = 0;
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0;j <= m + 1;j++)
		{
			sz[0][j] = 4;
			sz[n + 1][j] = 4;
		}
		for (j = 0;j <= n + 1;j++)
		{
			sz[j][0] = 4;
			sz[j][m + 1] = 4;
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				if ((sz[i][j] >= sz[i - 1][j]) && (sz[i][j] >= sz[i + 1][j]) && (sz[i][j] >= sz[i][j - 1]) && (sz[i][j] >= sz[i][j + 1]))
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
		return 0;
	}
}

