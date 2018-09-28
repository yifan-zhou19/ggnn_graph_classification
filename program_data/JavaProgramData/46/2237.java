package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] matrix = new int[ROW][COL];
		int i;
		int j;
		int xxrow;
		int sxrow;
		int xxcol;
		int sxcol;
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
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(matrix[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		xxrow = 0;
		sxrow = row - 1;
		xxcol = 0;
		sxcol = col - 1;

		while ((xxrow < sxrow) && (xxcol < sxcol))
		{
			for (j = xxcol; j < sxcol; j++)
			{
		System.out.printf("%d\n", matrix[xxrow][j]);
			}

	for (i = xxrow; i < sxrow; i++)
	{
		System.out.printf("%d\n", matrix[i][sxcol]);
	}

	for (j = sxcol; j > xxcol; j--)
	{
		System.out.printf("%d\n", matrix[sxrow][j]);
	}

	for (i = sxrow; i > xxrow; i--)
	{
		System.out.printf("%d\n", matrix[i][xxcol]);
	}
				  xxrow++;
				  sxrow--;
				 xxcol++;
				 sxcol--;

		}
		if ((xxrow == sxrow) && (xxcol < sxcol))
		{
			for (j = xxcol;j < sxcol + 1;j++)
			{
				System.out.printf("%d\n",matrix[xxrow][j]);
			}
		}
		else if (xxrow < sxrow && xxcol == sxcol)
		{
			for (i = xxrow;i < sxrow + 1;i++)
			{
				System.out.printf("%d\n",matrix[i][xxcol]);
			}
		}
		else if ((xxrow == sxrow) && (xxcol == sxcol))
		{
			System.out.printf("%d\n",matrix[xxrow][xxcol]);
		}



		return 0;
	}

}

