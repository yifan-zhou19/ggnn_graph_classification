package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int t;
		int m;
		int n;
		int x;
		int sum;
		int[][][] a = new int[100][105][105];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= x;i++)
		{
			sum = 0;
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
			for (j = 1;j <= m;j++)
			{
				for (k = 1;k <= n;k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j][k] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (t = 1;t <= n;t++)
			{
				if (m != 1)
				{
					sum = sum + a[i][1][t] + a[i][m][t];
				}
				if (m == 1)
				{
					sum = sum + a[i][1][t];
				}
			}
			for (t = 2;t <= m - 1;t++)
			{
				if (n != 1)
				{
					sum = sum + a[i][t][1] + a[i][t][n];
				}
				if (n == 1)
				{
					sum = sum + a[i][t][1];
				}
			}
			System.out.printf("%d\n",sum);
		}
	}

}

