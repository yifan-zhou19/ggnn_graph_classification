package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int row;
		int col;
		int ROW;
		int COL;
		int[][] array = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ROW = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
		if (ROW > 1 && COL > 1)
		{
			for (col = 0;col < COL;col++)
			{
				for (row = 0;row < ROW;row++)
				{
					if (col - row < 0)
					{
						break;
					}
					else
					{
						System.out.printf("%d\n",array[row][col - row]);
					}
				}
			}
			for (row = 1;row < ROW - 1;row++)
			{
				for (col = COL - 1;col >= 0;col--)
				{
					if (row + COL - 1 - col > ROW - 1)
					{
						break;
					}
					else
					{
						System.out.printf("%d\n",array[row + COL - 1 - col][col]);
					}
				}
			}
		}
		if (ROW == 1 && COL > 1)
		{
			for (col = 0;col < COL - 1;col++)
			{
				System.out.printf("%d\n",array[0][col]);
			}
		}
		if (COL == 1 && ROW > 1)
		{
			for (row = 0;row < ROW - 1;row++)
			{
				System.out.printf("%d\n",array[row][0]);
			}
		}
		System.out.printf("%d",array[ROW - 1][COL - 1]);
	}

}

