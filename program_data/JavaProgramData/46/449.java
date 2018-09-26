package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[][] sz = new int[100][100];
		int x = 0;
		int y;
		while (x < n)
		{
			for (y = 0;y < m;y++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[x][y]) = Integer.parseInt(tempVar3);
				}
			}
			x++;
		}
		int xx_row;
		int xx_col;
		int sx_row;
		int sx_col;
		int i;
		int j;
		xx_row = xx_col = 0;
		sx_row = n - 1;
		sx_col = m - 1;
		while (xx_row < sx_row && xx_col < sx_col)
		{
			for (j = xx_col;j < sx_col;j++)
			{
				System.out.printf("%d\n",sz[xx_row][j]);
			}
			for (i = xx_row;i < sx_row;i++)
			{
				System.out.printf("%d\n",sz[i][sx_col]);
			}
			for (j = sx_col;j > xx_col;j--)
			{
				System.out.printf("%d\n",sz[sx_row][j]);
			}
			for (i = sx_row;i > xx_row;i--)
			{
				System.out.printf("%d\n",sz[i][xx_col]);
			}
			xx_row++;
			xx_col++;
			sx_row--;
			sx_col--;
		}
		if (xx_row == sx_row)
		{
			for (j = xx_col;j <= sx_col;j++)
			{
				System.out.printf("%d\n",sz[sx_row][j]);
			}
		}
		else
		{
		if (xx_col == sx_col)
		{
			for (i = xx_row;i <= sx_row;i++)
			{
				System.out.printf("%d\n",sz[i][sx_col]);
			}
		}
		}
		return 0;
	}


}

