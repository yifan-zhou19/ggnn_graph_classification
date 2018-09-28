package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] sz = new int[11][11][5];
		int n;
		int i;
		int k;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sz[5][5][0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (d = 0;d < n;d++)
		{
			for (i = 1;i < 10;i++)
			{
				for (k = 1;k < 10;k++)
				{
					sz[i][k][d + 1] = 2 * sz[i][k][d];
					sz[i][k][d + 1] += sz[i - 1][k][d] + sz[i][k - 1][d] + sz[i + 1][k][d] + sz[i][k + 1][d] + sz[i + 1][k + 1][d] + sz[i - 1][k - 1][d] + sz[i + 1][k - 1][d] + sz[i - 1][k + 1][d];
				}
			}
		}
		for (i = 1;i < 10;i++)
		{
			for (k = 1;k < 9;k++)
			{
				System.out.printf("%d ",sz[i][k][n]);
			}
			System.out.printf("%d\n",sz[i][9][n]);
		}
		return 0;
	}
}

