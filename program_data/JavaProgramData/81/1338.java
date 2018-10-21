package <missing>;

public class GlobalMembers
{
	public static int exchange(int[][] shz, int x, int y)
	{
		int p;
		int t;
		if ((x >= 0 && x < 5) && (y >= 0 && y < 5))
		{
			for (p = 0;p < 5;p++)
			{
			t = shz[x][p];
			shz[x][p] = shz[y][p];
			shz[y][p] = t;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int n;
		int m;
		int result;
		int i;
		int j;
		int[][] sz = new int[5][5];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		result = exchange(sz, n, m);
		if (result == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",sz[i][j]);
				if (j == 3)
				{
				System.out.printf("%d\n",sz[i][4]);
				}
			}
			}
		}
	}
}

