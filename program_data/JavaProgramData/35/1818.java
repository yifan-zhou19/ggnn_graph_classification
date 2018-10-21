package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] sz = new int[99][99];
		int i;
		int j;
		int i1;
		int j1;
		int ri;
		int rj;
		int k;
		int kk = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				k = 0;
				for (i1 = 0;i1 < n;i1++)
				{
					if (i1 == i)
					{
						continue;
					}
					if (sz[i1][j] <= sz[i][j])
					{
						k = 1;
					}
				}
				for (j1 = 0;j1 < m;j1++)
				{
					if (j1 == j)
					{
						continue;
					}
					if (sz[i][j1] >= sz[i][j])
					{
						k = 1;
					}
				}
				if (k == 1)
				{
					continue;
				}
				kk = 1;
				ri = i;
				rj = j;
			}
		}
		if (kk == 0)
		{
			System.out.print("No");
		}
		if (kk == 1)
		{
			System.out.printf("%d+%d",ri,rj);
		}
		return 0;
	}
}

