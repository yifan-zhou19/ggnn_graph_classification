package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int a;
		int b;
		int m;
		int n;
		int t;
		for (a = 0;a < 5;a++)
		{
			for (b = 0;b < 5;b++)
			{
				if (b < 4)
				{
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						sz[a][b] = Integer.parseInt(tempVar);
					}
				}
				else
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						sz[a][b] = Integer.parseInt(tempVar2);
					}
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		if (0 <= n != 0 && n <= 4 && 0 <= m != 0 && m <= 4)
		{
			for (b = 0;b < 5;b++)
			{
				t = sz[n][b];
				sz[n][b] = sz[m][b];
				sz[m][b] = t;
			}
			for (a = 0;a < 5;a++)
			{
				for (b = 0;b < 5;b++)
				{
					if (b < 4)
					{
						System.out.printf("%d ",sz[a][b]);
					}
					else
					{
						System.out.printf("%d\n",sz[a][b]);
					}
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

