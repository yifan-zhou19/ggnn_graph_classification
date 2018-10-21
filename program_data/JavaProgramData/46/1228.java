package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int m;
		int n;
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
		int i;
		int j;
		int p;
		int m1;
		int n1;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int a = m > n != 0 ? n : m;

		for (p = 0;p < a / 2;p++)
		{
			for (m1 = p,n1 = p;n1 < n - 1 - p;n1++)
			{
				System.out.printf("%d\n",sz[m1][n1]);
			}
			//printf("--> end\n");
			for (n1 = n - 1 - p,m1 = p;m1 < m - 1 - p;m1++)
			{
				System.out.printf("%d\n",sz[m1][n1]);
			}
			//printf("|v end\n");
			if (m - 1 - p != p)
			{
				for (m1 = m - 1 - p,n1 = n - 1 - p;n1 > p;n1--)
				{
					System.out.printf("%d\n",sz[m1][n1]);
				}
				//printf("<--- end\n");
			}
			if (n - 1 - p != p)
			{
				for (n1 = p,m1 = m - 1 - p;m1 >= p + 1;m1--)
				{
					System.out.printf("%d\n",sz[m1][n1]);
				}
				//printf("^| end\n");
			}
		}
		//printf("p=%d\n", p);
		if (m - 1 - p == p)
		{
			for (int i = p; i <= n - 1 - p; i++)
			{
				System.out.printf("%d\n", sz[p][i]);
			}
		}
		else if (n - 1 - p == p)
		{
			for (int i = p; i <= m - 1 - p; i++)
			{
				System.out.printf("%d\n", sz[i][p]);
			}
		}
		return 0;
	}
}

