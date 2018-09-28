package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[] sum = new int[100];
		int k;
		int m;
		int n;
		int i;
		int j;
		int t;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (t = 0;t < k;t++)
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
			sum[t] = 0;
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (i = 0;i < m;i++)
			{
				sum[t] += a[i][0] + a[i][n - 1];
			}
			for (j = 0;j < n;j++)
			{
				sum[t] += a[0][j] + a[m - 1][j];
			}
			sum[t] -= a[0][0] + a[0][n - 1] + a[m - 1][0] + a[m - 1][n - 1];
		}

		for (t = 0;t < k;t++)
		{
			if (t != k - 1)
			{
				System.out.printf("%d\n",sum[t]);
			}
			else
			{
				System.out.printf("%d",sum[t]);
			}
		}

		return 0;
	}


}

