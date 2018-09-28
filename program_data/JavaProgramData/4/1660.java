package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int i;
		int k;
		int n;
		int j;
		int ROW;
		int COL;
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ROW = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			COL = Integer.parseInt(tempVar2);
		}
		if (ROW > COL)
		{
			j = COL - 1;
		}
		else
		{
			j = ROW - 1;
		}
		for (i = 0;i < ROW;i++)
		{
			for (k = 0;k < COL;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[i][k]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (n = 0;n <= j;n++)
		{
			for (row = 0;row <= n;row++)
			{
				System.out.printf("%d\n",sz[row][n - row]);
			}
		}
		if (COL > ROW)
		{
			for (n = j + 1;n < COL;n++)
			{
				for (row = 0;row < ROW;row++)
				{
					System.out.printf("%d\n",sz[row][n - row]);
				}
			}
			for (n = COL;n <= COL + ROW - 2;n++)
			{
				for (col = COL - 1;col >= n - ROW + 1;col--)
				{
					System.out.printf("%d\n",sz[n - col][col]);
				}
			}
		}
		if (ROW > COL)
		{
			for (n = j + 1;n < ROW;n++)
			{
				for (col = COL - 1;col >= 0;col--)
				{
					System.out.printf("%d\n",sz[n - col][col]);
				}
			}
			for (n = ROW;n <= COL + ROW - 2;n++)
			{
				for (col = COL - 1;col >= n - ROW + 1;col--)
				{
					System.out.printf("%d\n",sz[n - col][col]);
				}
			}
		}
		if (ROW == COL)
		{
			for (n = j + 1;n <= COL + ROW - 2;n++)
			{
				for (col = COL - 1;col >= n - ROW + 1;col--)
				{
					System.out.printf("%d\n",sz[n - col][col]);
				}
			}
		}
		return 0;
	}

}

