package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] matrix = new int[ROW][COL];
		int[] k = new int[100000];
		int i;
		int j;
		int a = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					matrix[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int xx_row;
		int sx_row;
		int xx_col;
		int sx_col;
		xx_row = 0;
		sx_row = row - 1;
		xx_col = 0;
		sx_col = col - 1;
		while ((xx_row <= sx_row) && (xx_col <= sx_col))
		{
			if ((xx_row == sx_row) && (xx_col == sx_col))
			{
				k[a] = matrix[xx_row][xx_col];
				a++;
			}
			for (j = xx_col;j < sx_col;j++)
			{
				k[a] = matrix[xx_row][j];
				a++;
			}
			for (i = xx_row;i < sx_row;i++)
			{
				k[a] = matrix[i][sx_col];
				a++;
			}
			for (j = sx_col;j > xx_col;j--)
			{
				k[a] = matrix[sx_row][j];
				a++;
			}
			for (i = sx_row;i > xx_row;i--)
			{
				k[a] = matrix[i][xx_col];
				a++;
			}
			xx_row++;
			sx_row--;
			xx_col++;
			sx_col--;
		}
		for (i = 0;i < row * col;i++)
		{
			System.out.printf("%d\n",k[i]);
		}
		return 0;
	}



}

