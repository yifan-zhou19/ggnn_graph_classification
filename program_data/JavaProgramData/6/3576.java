package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] sz = new int[100][100];
	int m;
	int n;
	int k;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	int i;
	for (int h = 0;h < k;h++)
	{
	int sum = 0;
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
				for (int j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[i][j] = Integer.parseInt(tempVar4);
					}
				}
	}


	for (int j = 0;j < n;j++)
	{
	sum += sz[0][j];
	sum += sz[m - 1][j];
	}

	for (i = 1;i < m - 1;i++)
	{
	sum += sz[i][0];
	sum += sz[i][n - 1];
	}
	System.out.printf("%d\n",sum);
	}
	return 0;
	}
}

