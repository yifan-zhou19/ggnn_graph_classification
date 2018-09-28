package <missing>;

public class GlobalMembers
{
	public static int ROW;
	public static int COL;
	public static int row = -1;
	public static int col = 1;
	public static int[][] array = new int[100][100];
	public static int move()
	{
		row++;
		col--;
		System.out.printf("%d\n",array[row][col]);
		return 0;
	}
	public static int big_move()
	{
		if (row + col < COL - 1)
		{
			col = row + col + 1;
			row = 0;
		}
		else
		{
			row = row + col - COL + 2;
			col = COL - 1;
		}
		System.out.printf("%d\n",array[row][col]);
		return 0;
	}
	public static int Main()
	{
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
		int r;
		int c;
		for (r = 0;r < ROW;r++)
		{
			for (c = 0;c < COL;c++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[r][c] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (ROW == 1 && COL == 1)
		{
			System.out.printf("%d",array[0][0]);
			return 0;
		}
		while (row != ROW - 1 || col != COL - 1)
		{
			while (col != 0 && row != ROW - 1)
			{
				move();
			}
			big_move();
		}
		return 0;
	}
}

