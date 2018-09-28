package <missing>;

public class GlobalMembers
{
	public static int fanwei(int x, int y)
	{
		if (x <= 4 && y <= 4 && x >= 0 && y >= 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int[][] sz = new int[5][5];
		int m;
		int n;
		int[][] zhongjian = new int[1][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
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
		if (fanwei(m, n) == 0)
		{
			System.out.print("error");
			return 0;
		}
		if (fanwei(m, n) == 1)
		{
			for (j = 0;j < 5;j++)
			{
				zhongjian[0][j] = sz[m][j];
			}
		for (j = 0;j < 5;j++)
		{
				sz[m][j] = sz[n][j];
		}
		for (j = 0;j < 5;j++)
		{
				sz[n][j] = zhongjian[0][j];
		}

	for (i = 0;i < 5;i++)
	{
			for (j = 0;j < 5;j++)
			{
				if (j == 4)
				{
					System.out.printf("%d\n",sz[i][j]);
				}
				else
				{
					System.out.printf("%d ",sz[i][j]);
				}
			}
	}
		}
		 return 0;
	}
}

