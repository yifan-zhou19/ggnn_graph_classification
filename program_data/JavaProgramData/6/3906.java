package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] sz = new int[100][100];
		int i;
		int r;
		int sum1;
		int sum2;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int j = 1;j <= k;j++)
		{
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
			for (r = 0;r < n;r++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					sz[i][r] = Integer.parseInt(tempVar4);
				}
			}
		  }
		  sum1 = 0;
		  for (int q = 0;q < n;q++)
		  {
			  sum1 += sz[0][q] + sz[m - 1][q];
		  }
		  sum2 = 0;
		  for (int w = 0;w < m;w++)
		  {
			  sum2 += sz[w][n - 1] + sz[w][0];
		  }
		sum = sum1 + sum2 - sz[0][0] - sz[0][n - 1] - sz[m - 1][0] - sz[m - 1][n - 1];
		System.out.printf("%d\n",sum);
		}
	return 0;
	}





}

