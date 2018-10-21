package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int h;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int[][] sum = new int[100][3];
		int n;
		int k;
		for (h = 1;h <= a;h++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
			int[][] sz = new int[100][100];
			sum[h][1] = 0;
			sum[h][2] = 0;
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= k;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[i][j] = Integer.parseInt(tempVar4);
					}
					sum[h][1] = sum[h][1] + sz[i][j];
				}
			}
			if (n > 1 && k > 1)
			{
				for (i = 2;i < n;i++)
				{
					for (j = 2;j < k;j++)
					{
						sum[h][2] = sum[h][2] + sz[i][j];
					}
				}
			}
			sum[h][3] = sum[h][1] - sum[h][2];
		}
		for (i = 1;i <= a;i++)
		{
			System.out.printf("%d\n",sum[i][3]);
		}
		return 0;
	}
}

