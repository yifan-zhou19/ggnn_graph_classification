package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int i;
	int[][] sz = new int[100][100];
	int sum;
	int[] s = new int[100];
	int a;
	int b;
	int m;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= k;i++)
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
		for (a = 0;a < m;a++)
		{
			for (b = 0;b < n;b++)
			{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				sz[a][b] = Integer.parseInt(tempVar4);
			}
			}
		}
		for (b = 0;b < n;b++)
		{
		sum += sz[0][b];
		sum += sz[m - 1][b];
		}
		for (a = 1;a < m - 1;a++)
		{
		sum += sz[a][0];
		sum += sz[a][n - 1];
		}
		s[i] = sum;
	}
	for (i = 1;i <= k;i++)
	{
	System.out.printf("%d\n",s[i]);
	}
	return 0;
	}
}

