package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[101][101];
		int u;
		int i;
		int j;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (u = 0;u < k;u++)
		{
			sum = 0;
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
					if ((i == 0) || (j == 0) || (i == m - 1) || j == (n - 1))
					{
						sum += a[i][j];
					}
				}
			}
			if (u != k - 1)
			{
				System.out.printf("%d\n",sum);
			}
			else if (u == k - 1)
			{
				System.out.printf("%d",sum);
			}
		}

		return 0;
	}
}

