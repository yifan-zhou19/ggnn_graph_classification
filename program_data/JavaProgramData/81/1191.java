package <missing>;

public class GlobalMembers
{
	public static int judge(int x, int y)
	{
		if (x >= 0 && x <= 4 && y >= 0 && y <= 4)
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
		int[][] sz = new int[5][5];
		int n;
		int m;
		int result;
		int i;
		int j;
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
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		result = judge(n, m);
		int[] k = new int[5];
		if (result == 0)
		{
			System.out.print("error");
		}
		else if (result == 1)
		{
			for (i = 0;i < 5;i++)
			{
				k[i] = sz[n][i];
				sz[n][i] = sz[m][i];
				sz[m][i] = k[i];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j != 4)
					{
						System.out.printf("%d ",sz[i][j]);
					}
					else
					{
						System.out.printf("%d\n",sz[i][4]);
					}
				}
			}
		}
		return 0;
	}
}

