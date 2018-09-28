package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int m;
		int n;
		int a;
		int b;
		int[][] sz = new int[1000][1000];
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
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
				s += (sz[0][b] + sz[m - 1][b]);
			}
			for (a = 0;a < m;a++)
			{
				s += (sz[a][0] + sz[a][n - 1]);
			}
			s -= (sz[0][0] + sz[m - 1][0] + sz[0][n - 1] + sz[m - 1][n - 1]);
			System.out.printf("%d\n",s);
			s = 0;
		}
		return 0;
	}
}

