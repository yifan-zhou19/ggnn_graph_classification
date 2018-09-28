package <missing>;

public class GlobalMembers
{
	public static int due(int[][] high, int i, int j)
	{
		int z = 1;
		if (high[i][j] >= high[i][j - 1] != 0 && high[i][j] >= high[i][j + 1] != 0 && high[i][j] >= high[i + 1][j] != 0 && high[i][j] >= high[i - 1][j])
		{
			z = 0;
		}
		return (z);
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[][] high = new int[22][22];
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
					high[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0;j <= n + 1;j++)
		{
			high[0][j] = 0;
		}
		for (i = 0;i <= m + 1;i++)
		{
			high[i][0] = 0;
		}
		for (j = 0;j <= n + 1;j++)
		{
			high[m + 1][j] = 0;
		}
		for (i = 0;i <= m + 1;i++)
		{
			high[i][n + 1] = 0;
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (due(high, i, j) == 0)
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
	}


}

