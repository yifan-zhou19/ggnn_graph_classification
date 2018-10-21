package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ROW;
		int COL;
		int[][] array = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ROW = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			COL = Integer.parseInt(tempVar2);
		}
		for (int row = 0;row < ROW;row++)
		{
			for (int col = 0;col < COL;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		//????
		int sx_row = 0;
		int xx_row = ROW - 1;
		int sx_col = 0;
		int xx_col = COL - 1;

		while ((xx_row > sx_row) && (xx_col > sx_col))


		{
			for (int i1 = sx_row,j1 = sx_col;j1 < xx_col;j1++)
			{

				System.out.printf("%d\n",array[i1][j1]);
			}
			for (int j2 = xx_col,i2 = sx_row;i2 < xx_row;i2++)
			{

				System.out.printf("%d\n",array[i2][j2]);
			}
			for (int i3 = xx_row,j3 = xx_col;j3 > sx_col;j3--)
			{

				System.out.printf("%d\n",array[i3][j3]);
			}
			for (int i4 = xx_row,j4 = sx_col;i4 > sx_row;i4--)
			{

				System.out.printf("%d\n",array[i4][j4]);
			}
			sx_row++;
			sx_col++;
			xx_row--;
			xx_col--;
		}
		if ((sx_row == xx_row) && (sx_col != xx_col))
		{
			for (int i = sx_col;i <= xx_col;i++)
			{
				System.out.printf("%d\n",array[sx_row][i]);
			}
		}
		else if (sx_col == xx_col)
		{
			for (int j = sx_row;j <= xx_row;j++)
			{
				System.out.printf("%d\n",array[j][sx_col]);
			}
		}
		return 0;
	}
}

