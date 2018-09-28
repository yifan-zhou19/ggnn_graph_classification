package <missing>;

public class GlobalMembers
{
	// ????.cpp : Defines the entry point for the console application.
	//
	public static int Main()
	{
		int he;
		int m;
		int n;
		int k;
		int[][] sz = new int[100][100];
		int i;
		int j;
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
			for (j = 0;j < m;j++)
			{
				for (int q = 0;q < n;q++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[j][q] = Integer.parseInt(tempVar4);
					}
				}
			}
			if (m == 1 && n == 1)
			{
				System.out.printf("%d\n",sz[0][0]);
			}
			else
			{
			he = 0;
			for (j = 0;j < m;j++)
			{
				if (m == 1)
				{
					he += sz[j][0];
				}
				else
				{
				he += sz[j][0] + sz[j][n - 1];
				}
			}
			for (j = 1;j < n - 1;j++)
			{
				if (n == 1)
				{
					he += sz[0][j];
				}
				else
				{
					he += sz[0][j] + sz[m - 1][j];
				}
			}
			System.out.printf("%d\n",he);
			}
		}
			return 0;

	}

}

