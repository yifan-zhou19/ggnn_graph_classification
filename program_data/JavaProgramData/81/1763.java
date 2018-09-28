package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int p;
		int i;
		int j;
		int[][] sz = new int[5][5];
		for (int i = 0; i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					(sz[i][j]) = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if ((m > -1) && (m < 5) && (n>-1) && (n < 5))
		{
			if (m <= n)
			{
				for (i = 0;i < m;i++)
				{
					for (j = 0;j < 4;j++)
					{
						System.out.printf("%d ",sz[i][j]);
					}
					System.out.printf("%d\n",sz[i][4]);
				}
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",sz[n][j]);
				}
				System.out.printf("%d\n",sz[n][4]);
				for (i = m + 1;i < n;i++)
				{
					for (j = 0;j < 4;j++)
					{
						System.out.printf("%d ",sz[i][j]);
					}
					System.out.printf("%d\n",sz[i][4]);
				}
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",sz[m][j]);
				}
				System.out.printf("%d\n",sz[m][4]);
				for (i = n + 1;i < 5;i++)
				{
					for (j = 0;j < 4;j++)
					{
						System.out.printf("%d ",sz[i][j]);
					}
					System.out.printf("%d\n",sz[i][4]);
				}
			}
			if (m > n)
			{
				for (i = 0;i < n;i++)
				{
					for (j = 0;j < 4;j++)
					{
						System.out.printf("%d ",sz[i][j]);
					}
					System.out.printf("%d\n",sz[i][4]);
				}
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",sz[m][j]);
				}
				System.out.printf("%d\n",sz[m][4]);
				for (i = n + 1;i < m;i++)
				{
					for (j = 0;j < 4;j++)
					{
						System.out.printf("%d ",sz[i][j]);
					}
					System.out.printf("%d\n",sz[i][4]);
				}
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",sz[n][j]);
				}
				System.out.printf("%d\n",sz[n][4]);
				for (i = m + 1;i < 5;i++)
				{
					for (j = 0;j < 4;j++)
					{
						System.out.printf("%d ",sz[i][j]);
					}
					System.out.printf("%d\n",sz[i][4]);
				}
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}

}

