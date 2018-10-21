package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] sz = new int[number][number];
		int[][] sz1 = new int[number][number];
		int k;
		int i;
		int l;
		int a;
		int b;
		int j;
		int mc;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= 8;i++)
		{
			for (j = 0;j <= 8;j++)
			{
				sz[i][j] = 0;
				sz1[i][j] = 0;
			}
		}
		sz[4][4] = n;
		for (l = 1;l <= k;l++)
		{
			for (i = 0;i <= 8;i++)
			{
				for (j = 0;j <= 8;j++)
				{
					if (sz[i][j] != 0)
					{
						sz1[i - 1][j - 1] = sz1[i - 1][j - 1] + sz[i][j];
						sz1[i - 1][j] = sz1[i - 1][j] + sz[i][j];
						sz1[i - 1][j + 1] = sz1[i - 1][j + 1] + sz[i][j];
						sz1[i][j - 1] = sz1[i][j - 1] + sz[i][j];
						sz1[i][j] = sz1[i][j] + 2 * sz[i][j];
						sz1[i][j + 1] = sz1[i][j + 1] + sz[i][j];
						sz1[i + 1][j - 1] = sz1[i + 1][j - 1] + sz[i][j];
						sz1[i + 1][j] = sz1[i + 1][j] + sz[i][j];
						sz1[i + 1][j + 1] = sz1[i + 1][j + 1] + sz[i][j];
					}
				}
			}
			for (i = 0;i <= 8;i++)
			{
				for (j = 0;j <= 8;j++)
				{
					sz[i][j] = sz1[i][j];
					sz1[i][j] = 0;
				}
			}
		}
		for (i = 0;i <= 8;i++)
		{
			for (j = 0;j <= 8;j++)
			{
				if (j == 8)
				{
					System.out.printf("%d\n", sz[i][j]);
				}
				else
				{
					System.out.printf("%d ", sz[i][j]);
				}
			}
		}
		return 0;
	}
}

