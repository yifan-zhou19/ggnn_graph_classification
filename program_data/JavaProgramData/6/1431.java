package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] sz = new int[LEN][LEN];
	int j;
	int n;
	int k;
	int i;
	int m;
	int l;
	int sum;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (l = 0;l < k;l++)
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
				(sz[i][j]) = Integer.parseInt(tempVar4);
			}
		}
	}
	i = 0;
	for (j = 0;j < n;j++)
	{
		sum += sz[0][j];
	}
	i = m - 1;
	for (j = 0;j < n;j++)
	{
		sum += sz[m - 1][j];
	}
	j = 0;
	for (i = 1;i < m - 1;i++)
	{
		sum += sz[i][0];
	}
	j = n - 1;
	for (i = 1;i < m - 1;i++)
	{
		sum += sz[i][n - 1];
	}

	System.out.printf("%d\n",sum);
	}


	return 0;
	}
}

