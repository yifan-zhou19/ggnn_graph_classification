package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int[][] sz = new int[100][100];
	int m;
	int n;
	int p;
	int i;
	int j;
	int[] s = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
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
		if (m == 1 && n == 1)
		{
			s[p] = sz[0][0];
		}
		else
		{
		for (j = 0;j < n;j++)
		{
			s[p] = s[p] + sz[0][j] + sz[m - 1][j];
		}
		for (i = 0;i < m;i++)
		{
			s[p] = s[p] + sz[i][0] + sz[i][n - 1];
		}
		s[p] = s[p] - sz[0][0] - sz[0][n - 1] - sz[m - 1][0] - sz[m - 1][n - 1];
		}
	}
	for (p = 0;p < k;p++)
	{
		System.out.printf("%d\n",s[p]);
	}
	return 0;
	}


}

