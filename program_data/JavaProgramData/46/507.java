package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int xx_row = 0;
		int sx_row = row - 1;
		int xx_col = 0;
		int sx_col = col - 1;
		while ((xx_row < sx_row) && (xx_col < sx_col))
		{
			for (int i = xx_col;i < sx_col;i++)
			{
				System.out.printf("%d\n",sz[xx_row][i]);
			}
			for (int j = xx_row;j < sx_row;j++)
			{
				System.out.printf("%d\n",sz[j][sx_col]);
			}
			for (int k = sx_col;k > xx_col;k--)
			{
				System.out.printf("%d\n",sz[sx_row][k]);
			}
			for (int p = sx_row;p > xx_row;p--)
			{
				System.out.printf("%d\n",sz[p][xx_col]);
			}
			xx_row++;
			sx_row--;
			xx_col++;
			sx_col--;
		}
	if ((xx_row == sx_row) && (xx_col != sx_col))
	{
	for (int i = xx_row;i <= sx_col;i++)
	{
		System.out.printf("%d\n",sz[xx_row][i]);
	}
	}
	if ((xx_col == sx_col) && (xx_row != sx_row))
	{
	for (int i = xx_col;i <= sx_row;i++)
	{
		System.out.printf("%d\n",sz[i][xx_col]);
	}
	}
	if ((xx_row == sx_row) && (xx_col == sx_col))
	{
	System.out.printf("%d\n",sz[xx_row][sx_col]);
	}
	return 0;
	}





}

