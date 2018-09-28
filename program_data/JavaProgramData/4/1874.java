package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ROW;
		int COL;
		int j;
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
		int[][] sz = new int[100][100];
		int row;
		int col;
		for (row = 0;row < ROW;row++)
		{
			for (col = 0;col < COL;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (ROW == COL)
		{
			if (ROW == 1)
			{
				System.out.printf("%d\n",sz[ROW - 1][COL - 1]);
			}
			else
			{
				for (col = 0;col < COL;col++)
				{
					j = col;
					row = 0;
					do
					{
						System.out.printf("%d\n",sz[row][col]);
						row++;
						col--;
					} while (col > -1);
					col = j;
				}
				for (row = 1;row < ROW;row++)
				{
					j = row;
					col = COL - 1;
					do
					{
						System.out.printf("%d\n",sz[row][col]);
						row++;
						col--;
					} while (row < ROW);
					row = j;
				}
			}
		}
		else
		{
			for (col = 0;col < COL - 1;col++)
			{
				j = col;
				row = 0;
				do
				{
					System.out.printf("%d\n",sz[row][col]);
					row++;
					col--;
				} while ((col > -1) && (row < ROW));
				col = j;
			}
			for (row = 0;row < ROW;row++)
			{
				j = row;
				col = COL - 1;
				do
				{
					System.out.printf("%d\n",sz[row][col]);
					row++;
					col--;
				} while ((row < ROW) && (col>-1));
				row = j;
			}
		}
		return 0;
	}

}

