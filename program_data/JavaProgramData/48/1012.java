package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][][] sz = new int[9][9][5];
		int n;
		int m;
		int i;
		int j;
		int k;
		int p;
		int q;
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 5;k++)
				{
					sz[i][j][k] = 0;
				}
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		sz[4][4][0] = n;
		for (k = 0;k < m;k++)
		{
			for (i = 1;i < 8;i++)
			{
				for (j = 1;j < 8;j++)
				{
					if (sz[i][j][k] != 0)
					{
						sz[i - 1][j - 1][k + 1] += sz[i][j][k];
						sz[i - 1][j][k + 1] += sz[i][j][k];
						sz[i - 1][j + 1][k + 1] += sz[i][j][k];
						sz[i][j - 1][k + 1] += sz[i][j][k];
						sz[i][j][k + 1] += sz[i][j][k] * 2;
						sz[i][j + 1][k + 1] += sz[i][j][k];
						sz[i + 1][j - 1][k + 1] += sz[i][j][k];
						sz[i + 1][j][k + 1] += sz[i][j][k];
						sz[i + 1][j + 1][k + 1] += sz[i][j][k];
					}
				}
			}
		}
		for (i = 0;i < 9;i++)
		{
			System.out.printf("%d",sz[i][0][m]);
			for (j = 1;j < 9;j++)
			{
				System.out.printf(" %d",sz[i][j][m]);
			}
			System.out.print("\n");
		}

	}
}

