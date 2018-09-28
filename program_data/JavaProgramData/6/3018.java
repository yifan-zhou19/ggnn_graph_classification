package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int zong;
		int[][] sz = new int[100][100];
		int m;
		int n;
		int k;
		int i;
		int j;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zong = Integer.parseInt(tempVar);
		}
		for (k = 0;k < zong;k++)
		{
			int sum = 0;
			sum1 = 0;
			sum2 = 0;
			sum3 = 0;
			sum4 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < m;i++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					sz[0][i] = Integer.parseInt(tempVar4);
				}
				sum1 += sz[0][i];
			}
			//printf("%d\n",sum1);
			for (i = 1;i < n - 1;i++)
			{
				for (j = 0;j < m;j++)
				{
					String tempVar5 = ConsoleInput.scanfRead();
					if (tempVar5 != null)
					{
						sz[i][j] = Integer.parseInt(tempVar5);
					}
				}
			}
			for (i = 0;i < m;i++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					sz[n - 1][i] = Integer.parseInt(tempVar6);
				}
				sum2 += sz[n - 1][i];
			}
			//printf("%d\n",sum2);
			for (i = 1;i < n - 1;i++)
			{
				sum3 += sz[i][0];
			}
			//printf("%d\n",sum3);
			for (i = 1;i < n - 1;i++)
			{
				sum4 += sz[i][m - 1];
			}
			//printf("%d\n",sum4);
			sum = sum1 + sum2 + sum3 + sum4;
			System.out.printf("%d\n",sum);
			sum = 0;
		}
		return 0;
	}

}

