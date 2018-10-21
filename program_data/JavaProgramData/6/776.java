package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int e;
		int[] sum = new int[100];
		for (e = 0;e < k;e++)
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
				for (j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (j = 0;j < n;j++)
			{
				sum[e] = sum[e] + a[0][j];
			}
			 for (i = 1;i < m;i++)
			 {
				sum[e] = sum[e] + a[i][n - 1];
			 }
			 for (j = n - 2;j >= 0;j--)
			 {
				sum[e] = sum[e] + a[m - 1][j];
			 }
			for (i = m - 2;i > 0;i--)
			{
				sum[e] = sum[e] + a[i][0];
			}
		}
		for (e = 0;e < k;e++)
		{
			System.out.printf("%d\n",sum[e]);
		}
		return 0;
	}
}

