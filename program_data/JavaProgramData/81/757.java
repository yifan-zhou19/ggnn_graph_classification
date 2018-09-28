package <missing>;

public class GlobalMembers
{
	public static int a(int x,int y)
	{
		if (x < 0 || y < 0 || y>4 || x>4)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int n;
		int m;
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
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


		if (a(m, n) == 0)
		{
			System.out.print("error");
		}
		if (a(m, n) == 1)
		{
			for (int r = 0;r < 5;r++)
			{
				for (int t = 0;t < 5;t++)
				{
					if (r == m)
					{
						if (t == 4)
						{
							System.out.printf("%d\n",sz[n][t]);
						}
						else
						{
							System.out.printf("%d ",sz[n][t]);
						}
					}
					if (r == n)
					{
						if (t == 4)
						{
							System.out.printf("%d\n",sz[m][t]);
						}
						else
						{
							System.out.printf("%d ",sz[m][t]);
						}
					}
					if (r != n && r != m)
					{
						if (t == 4)
						{
							System.out.printf("%d\n",sz[r][t]);
						}
						else
						{
							System.out.printf("%d ",sz[r][t]);
						}
					}
				}
			}
		}
		return 0;
	}


}

