package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int x;
		int m;
		int n;
		int i;
		int j;
		int k;
		int[] sum = new int[10000];
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < m;j++)
			{
					for (k = 0;k < n;k++)
					{
						String tempVar4 = ConsoleInput.scanfRead();
						if (tempVar4 != null)
						{
							sz[j][k] = Integer.parseInt(tempVar4);
						}
					}
			}
			if ((m > 2) && (n > 2))
			{
				for (j = 0;j < m;j++)
				{
					sum[i] = sum[i] + sz[j][0] + sz[j][n - 1];
				}
			  for (k = 0;k < n;k++)
			  {
					sum[i] = sum[i] + sz[0][k] + sz[m - 1][k];
			  }
			  sum[i] = sum[i] - sz[0][0] - sz[0][n - 1] - sz[m - 1][0] - sz[m - 1][n - 1];
			}
			else
			{
				for (j = 0;j < m;j++)
				{
						for (k = 0;k < n;k++)
						{
							sum[i] = sum[i] + sz[j][k];
						}
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}

}

