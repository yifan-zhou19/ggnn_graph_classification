package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] x = new int[100][100];
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		int m;
		int n;
		for (m = 0;m < a;m++)
		{
			for (n = 0;n < b;n++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[m][n] = Integer.parseInt(tempVar3);
				}
			}
		}
		int xx_row = 0;
		int sx_row = a - 1;
		int xx_col = 0;
		int sx_col = b - 1;
		int i;
		int j;
		while ((xx_row < sx_row) && (xx_col < sx_col))
		{
			for (j = xx_col;j < sx_col;j++)
			{
				System.out.printf("%d\n",x[xx_row][j]);
			}
			for (i = xx_row;i < sx_row;i++)
			{
				System.out.printf("%d\n",x[i][sx_col]);
			}
			for (j = sx_col;j > xx_col;j--)
			{
				System.out.printf("%d\n",x[sx_row][j]);
			}
			for (i = sx_row;i > xx_row;i--)
			{
				System.out.printf("%d\n",x[i][xx_col]);
			}
			xx_row++;
			sx_row--;
			xx_col++;
			sx_col--;
		}
		if ((xx_row == sx_row) && (xx_col == sx_col))
		{
			System.out.printf("%d\n",x[xx_row][xx_col]);
		}
		if ((xx_row == sx_row) && (xx_col != sx_col))
		{
			for (i = xx_col;i <= sx_col;i++)
			{
				System.out.printf("%d\n",x[xx_row][i]);
			}
		}
		if ((xx_col == sx_col) && (xx_row != sx_row))
		{
			for (i = xx_row;i <= sx_row;i++)
			{
				System.out.printf("%d\n",x[i][xx_col]);
			}
		}
		return 0;
	}

}

