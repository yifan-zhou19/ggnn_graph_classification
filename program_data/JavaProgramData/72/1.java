package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] sz = new int[m + 2][n + 2];
		for (a = 0,b = 0;b < n + 2;b++)
		{
			sz[a][b] = 0;
		}
		for (a = m + 1,b = 0;b < n + 2;b++)
		{
			sz[a][b] = 0;
		}
		for (a = 1,b = 0;a < m + 1;a++)
		{
			sz[a][b] = 0;
		}
		for (a = 1,b = n + 1;a < m + 1;a++)
		{
			sz[a][b] = 0;
		}
		for (a = 1;a <= m;a++)
		{
			for (b = 1;b <= n;b++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[a][b]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (a = 1;a <= m;a++)
		{
			for (b = 1;b <= n;b++)
			{
				if (sz[a][b] >= sz[a - 1][b] != 0 && sz[a][b] >= sz[a + 1][b] != 0 && sz[a][b] >= sz[a][b + 1] != 0 && sz[a][b] >= sz[a][b - 1])
				{
					System.out.printf("%d %d\n",a - 1,b - 1);
				}
			}
		}
		return 0;
	}



}

