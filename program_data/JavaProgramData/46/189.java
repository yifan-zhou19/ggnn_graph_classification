package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
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
		int[][] sz = new int[100][100];
		int p;
		int q;
		for (p = 0;p < row;p++)
		{
			for (q = 0;q < col;q++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[p][q] = Integer.parseInt(tempVar3);
				}
			}
		}

		int ROW;
		int COL;
		int row1 = 0;
		int row2 = row - 1;
		int col1 = 0;
		int col2 = col - 1;
		for (;(row1 <= row2) && (col1 <= col2);)
		{
			if ((row1 <= row2) && (col1 <= col2))
			{
				for (COL = col1;COL <= col2;COL++)
				{
				System.out.printf("%d\n",sz[row1][COL]);
				}
				row1 = row1 + 1;
			}
			if ((row1 <= row2) && (col1 <= col2))
			{
				for (ROW = row1;ROW <= row2;ROW++)
				{
				System.out.printf("%d\n",sz[ROW][col2]);
				}
				   col2 = col2 - 1;
			}
			if ((row1 <= row2) && (col1 <= col2))
			{
				for (COL = col2;COL >= col1;COL--)
				{
				System.out.printf("%d\n",sz[row2][COL]);
				}
				row2 = row2 - 1;
			}
			if ((row1 <= row2) && (col1 <= col2))
			{
				for (ROW = row2;ROW >= row1;ROW--)
				{
				System.out.printf("%d\n",sz[ROW][col1]);
				}
				col1 = col1 + 1;
			}
		}
		return 0;
	}

}

