package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int m;
	int n;
	int[][] sz = new int[100][100];
	int i;
	int j;
	int l;
	int sum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (l = 0;l < k;l++)
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
					sz[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			sum = sum + sz[0][j];
		}
		for (i = 1;i < m;i++)
		{
			sum = sum + sz[i][n - 1];
		}
		for (j = 0;j < n - 1;j++)
		{
			sum = sum + sz[m - 1][j];
		}
		for (i = 1;i < m - 1;i++)
		{
			sum = sum + sz[i][0];
		}
		System.out.printf("%d\n",sum);
		sum = 0;

	}

		return 0;
	}


}

