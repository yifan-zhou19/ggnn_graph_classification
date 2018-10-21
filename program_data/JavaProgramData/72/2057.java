package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int m;
		int n;
		int q = 0;
		int[][] sz = new int[22][22];
		int[] mm = new int[100];
		int[] nn = new int[100];
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
		for (i = 1;i < m + 1;i++)
		{
			for (k = 1;k < n + 1;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m + 2;i++)
		{
			for (k = 0;k < n + 2;k++)
			{
		if (i == 0 || i == m + 1 || k == 0 || k == n + 1)
		{
			sz[i][k] = 0;
		}
			}
		}
		  for (i = 1;i < m + 1;i++)
		  {
			for (k = 1;k < n + 1;k++)
			{
					if (sz[i][k] >= sz[i][k + 1] != 0 && sz[i][k] >= sz[i][k - 1] != 0 && sz[i][k] >= sz[i + 1][k] != 0 && sz[i][k] >= sz[i - 1][k])
					{
					mm[q] = i - 1;
					nn[q] = k - 1;
					q++;
					}
			}
		  }
		for (i = 0;i < q;i++)
		{
		System.out.printf("%d %d\n",mm[i],nn[i]);
		}
		return 0;
	}


}

