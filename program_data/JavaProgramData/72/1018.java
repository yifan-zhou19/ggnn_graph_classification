package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[][] sz = new int[1000][1000];
		for (a = 1;a < n + 1;a++)
		{
			for (b = 1;b < m + 1;b++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[a][b]) = Integer.parseInt(tempVar3);
				}
			}
		}

		for (a = 0;a < n + 2;a++)
		{
			sz[a][0] = 0;
		}
		for (a = 0;a < n + 2;a++)
		{
			sz[a][m + 1] = 0;
		}
		for (b = 0;b < m + 2;b++)
		{
			sz[0][b] = 0;
		}
		for (b = 0;b < m + 2;b++)
		{
			sz[n + 1][b] = 0;
		}
		for (int c = 1;c < n + 1;c++)
		{
			for (int d = 1;d < m + 1;d++)
			{
					if (sz[c - 1][d] <= sz[c][d] != 0 && sz[c + 1][d] <= sz[c][d] != 0 && sz[c][d - 1] <= sz[c][d] != 0 && sz[c][d + 1] <= sz[c][d])
					{
						System.out.printf("%d %d\n",c - 1,d - 1);
					}
			}
		}

		return 0;
	}
}

