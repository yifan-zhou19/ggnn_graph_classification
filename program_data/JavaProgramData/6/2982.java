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
		int sum = 0;
		int i;
		int j;
		int p;
		for (p = 0;p < k;p++)
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
		int[][] sz = new int[m][n];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (i = 0,j = 0;j < n;j++)
		{
			sum = sum + sz[i][j];
		}
		for (i = m - 1,j = 0;j < n;j++)
		{
			sum = sum + sz[i][j];
		}
		for (j = 0,i = 0;i < m;i++)
		{
			sum = sum + sz[i][j];
		}
		for (j = n - 1,i = 0;i < m;i++)
		{
			sum = sum + sz[i][j];
		}
		sum = sum - sz[0][0] - sz[m - 1][0] - sz[m - 1][n - 1] - sz[0][n - 1];
		System.out.printf("%d\n",sum);
		sum = 0;
		}
		return 0;
	}
}

