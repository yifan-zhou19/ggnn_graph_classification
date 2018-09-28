package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[21][21];
		int i;
		int j;
		int x;
		int m;
		int n;
		int S = 0;
		int C = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= m + 1;i++)
		{
			for (j = 0;j <= n + 1;j++)
			{
				sz[i][j] = 0;
			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x = Integer.parseInt(tempVar3);
				}
				sz[i][j] = x;
			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if (sz[i][j] >= sz[i - 1][j] != 0 && sz[i][j] >= sz[i + 1][j] != 0 && sz[i][j] >= sz[i][j - 1] != 0 && sz[i][j] >= sz[i][j + 1])
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
		return 0;
	}



}

