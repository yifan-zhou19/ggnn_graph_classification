package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] shuzu = new int[100][100];
		int i;
		int j;
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
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						shuzu[i][j] = Integer.parseInt(tempVar3);
					}
			}
		}
		int row_xx = 0;
		int row_sx = row - 1;
		int col_xx = 0;
		int col_sx = col - 1;
		while (row_sx > row_xx && col_sx > col_xx)
		{
			for (j = col_xx;j < col_sx;j++)
			{
				System.out.printf("%d\n",shuzu[row_xx][j]);
			}
			for (i = row_xx;i < row_sx;i++)
			{
				System.out.printf("%d\n",shuzu[i][col_sx]);
			}
			for (j = col_sx;j > col_xx;j--)
			{
				System.out.printf("%d\n",shuzu[row_sx][j]);
			}
			for (i = row_sx;i > row_xx;i--)
			{
				System.out.printf("%d\n",shuzu[i][col_xx]);
			}
			col_xx++;
			row_xx++;
			col_sx--;
			row_sx--;
		}
		if (row_xx == row_sx && col_xx < col_sx)
		{
			for (j = col_xx;j <= col_sx;j++)
			{
				System.out.printf("%d\n",shuzu[row_xx][j]);
			}
		}
		else if (col_xx == col_sx && row_xx < row_sx)
		{
			for (i = row_xx;i <= row_sx;i++)
			{
				System.out.printf("%d\n",shuzu[i][col_xx]);
			}
		}
		if (row % 2 != 0 && col % 2 != 0 && ((row > 1 && col > 1) || (row == 1 && col == 1)))
		{
			System.out.printf("%d\n",shuzu[(row - 1) / 2][(col - 1) / 2]);
		}

		return 0;
	}

}

