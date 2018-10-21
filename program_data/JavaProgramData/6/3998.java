package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int nums;
		int[][] jz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			nums = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int sum;
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				jz[i][j] = 0;
			}
		}
		for (i = 0;i < nums;i++)
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
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < n;k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						jz[j][k] = Integer.parseInt(tempVar4);
					}
				}
			}

			for (j = 0;j < n;j++)
			{
				sum = sum + jz[0][j];
			}
			if (m - 1 != 0)
			{
				for (j = 0;j < n;j++)
				{
					sum = sum + jz[m - 1][j];
				}
			}
			for (j = 1;j <= m - 2;j++)
			{
				sum = sum + jz[j][0];
			}
			if (n - 1 != 0)
			{
				for (j = 1;j <= m - 2;j++)
				{
					sum = sum + jz[j][n - 1];
				}
			}
			System.out.printf("%d\n",sum);
		}
			return 0;
	}

}

