package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int ROW;
		int COL;
		int row;
		int col;
		int rowxia;
		int rowup;
		int colxia;
		int colup;
		int[][] array = new int[99][99];
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
		for (row = 0;row < ROW;row++)
		{
			for (col = 0;col < COL;col++)
			{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			array[row][col] = Integer.parseInt(tempVar3);
		}
			}
		}
		for (rowxia = 0, rowup = ROW - 1, colxia = 0, colup = COL - 1;rowxia < rowup && colxia < colup;rowxia++, colxia++, rowup--, colup--)
		{
		for (row = rowxia,col = colxia;col < colup;col++)
		{
		System.out.printf("%d\n",array[row][col]);
		}
			for (col = colup,row = rowxia;row < rowup;row++)
			{
			System.out.printf("%d\n",array[row][col]);
			}
			for (row = rowup,col = colup;col > colxia;col--)
			{
			System.out.printf("%d\n",array[row][col]);
			}
			for (col = colxia,row = rowup;row > rowxia;row--)
			{
				System.out.printf("%d\n",array[row][col]);
			}
		}
		if (rowup == rowxia)
		{
			for (col = colxia,row = rowup;col <= colup;col++)
			{
				System.out.printf("%d\n",array[row][col]);
			}
		}
		else if (colup == colxia)
		{
			for (row = rowxia,col = colup;row <= rowup;row++)
			{
		System.out.printf("%d\n",array[row][col]);
			}
		}
	}
}

