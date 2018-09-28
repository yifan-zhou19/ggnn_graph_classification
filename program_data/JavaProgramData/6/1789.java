package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int p;
		int sum1;
		int sum2;
		int sum3;
		int sum4;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			int[][] sz = new int[100][100];
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
				for (p = 0;p < n;p++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[j][p] = Integer.parseInt(tempVar4);
					}
				}
			}
			if (m != 1 && m != 2 && n != 1 && n != 2)
			{
				sum1 = sum2 = sum3 = sum4 = 0;
				for (p = 0;p < n;p++)
				{
					sum1 += sz[0][p];
				}
				for (p = 0;p < n;p++)
				{
					sum2 += sz[m - 1][p];
				}
				for (j = 0;j < m;j++)
				{
					sum3 += sz[j][0];
				}
				for (j = 0;j < m;j++)
				{
					sum4 += sz[j][n - 1];
				}
				System.out.printf("%d\n",sum1 + sum2 + sum3 + sum4 - sz[0][0] - sz[0][n - 1] - sz[m - 1][0] - sz[m - 1][n - 1]);
			}
			else
			{
				sum = 0;
				for (j = 0;j < m;j++)
				{
					for (p = 0;p < n;p++)
					{
						sum += sz[j][p];
					}
				}
				System.out.printf("%d\n",sum);
			}
		}
		return 0;
	}







}

