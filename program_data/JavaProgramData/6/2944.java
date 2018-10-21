package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int M;
		int i;
		int j;
		int[] sum = new int[1000];
		int[] row = new int[1000];
		int[] col = new int[1000];
		int[][] sz = new int[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			M = Integer.parseInt(tempVar);
		}
		for (m = 0;m < M;m++)
		{
			sum[m] = 0;
			for (i = 0;i < row[m];i++)
			{
				for (j = 0;j < col[m];j++)
				{
					sz[i][j] = 0;
				}
			}

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				row[m] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				col[m] = Integer.parseInt(tempVar3);
			}

			for (i = 0;i < row[m];i++)
			{
				for (j = 0;j < col[m];j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}

			for (j = 0;j < col[m];j++)
			{
				sum[m] += sz[0][j];
				sum[m] += sz[row[m] - 1][j];
			}
			for (i = 0;i < row[m];i++)
			{
				sum[m] += sz[i][0];
				sum[m] += sz[i][col[m] - 1];
			}
			sum[m] = sum[m] - sz[0][0] - sz[row[m] - 1][col[m] - 1] - sz[0][col[m] - 1] - sz[row[m] - 1][0];

		}
		for (m = 0;m < M;m++)
		{
			System.out.printf("%d\n",sum[m]);
		}
		return 0;
	}
}

