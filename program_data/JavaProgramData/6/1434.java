package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[max][max];
		int k;
		int m;
		int n;
		int i;
		int j;
		int b;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (b = 0;b < k;b++)
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
			for (i = 0;i < m;i++)
			{
				sum = sum + a[i][0];
			}
			for (i = 0;i < m;i++)
			{
				sum = sum + a[i][n - 1];
			}
			for (j = 1;j < n - 1;j++)
			{
				sum = sum + a[0][j];
			}
			for (j = 1;j < n - 1;j++)
			{
				sum = sum + a[m - 1][j];
			}
			System.out.printf("%d\n",sum);
			sum = 0;
		}
		return 0;
	}

}

