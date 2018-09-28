package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int m;
		int n;
		int k;
		int i;
		int j;
		int q;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] sum = new int[k];
		s = 0;

		for (q = 0;q < k;q++)
		{
			sum[q] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}

			for (i = 0;i < n;i++)
			{
				sum[q] += sz[0][i];
			}
			for (i = 0;i < m;i++)
			{
				sum[q] += sz[i][0];
			}
			for (i = 0;i < n;i++)
			{
				sum[q] += sz[m - 1][i];
			}
			for (i = 0;i < m;i++)
			{
				sum[q] += sz[i][n - 1];
			}
			sum[q] -= sz[0][0];
			sum[q] -= sz[0][n - 1];
			sum[q] -= sz[m - 1][0];
			sum[q] -= sz[m - 1][n - 1];

			System.out.printf("%d\n",sum[q]);

		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sum);
	return 0;

	}
}

