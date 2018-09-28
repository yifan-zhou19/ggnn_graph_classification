package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int row;
		int col;
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
		int k;
		int n;
		while (xx_row < sx_row && xx_col < sx_col)
		{
			for (k = xx_col;k <= sx_col - 1;k++)
			{
				System.out.printf("%d\n",sz[xx_row][k]);
			}
			for (n = xx_row;n <= sx_row - 1;n++)
			{
				System.out.printf("%d\n",sz[n][sx_col]);
			}
			for (k = sx_col;k >= xx_col + 1;k--)
			{
				System.out.printf("%d\n",sz[sx_row][k]);
			}
			for (n = sx_row;n >= xx_row + 1;n--)
			{
				System.out.printf("%d\n",sz[n][xx_col]);
			}
		xx_col++;
		sx_col--;
		xx_row++;
		sx_row--;
		}
		if (sx_row == xx_row)
		{
			for (k = xx_col;k <= sx_col;k++)
			{
				System.out.printf("%d\n",sz[sx_row][k]);
			}
		}
		else
		{
			if (xx_row == sx_col)
			{
				for (n = xx_row;n <= sx_row;n++)
				{
					System.out.printf("%d\n",sz[n][sx_col]);
				}
			}
		}
			return 0;
	}
}

