package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[][] n = new int[100][100];
		int col;
		int row;
		int COL;
		int ROW;
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
					n[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < COL + ROW - 1;i++)
		{
			if (i < COL)
			{
				col = i;
				row = 0;
				while (col >= 0 && row < ROW)
				{
					System.out.printf("%d\n",n[row][col]);
					col -= 1;
					row += 1;
				}
			}
			else if (i >= COL)
			{
				col = COL - 1;
				row = i - COL + 1;
				while (col >= 0 && row < ROW)
				{
					System.out.printf("%d\n",n[row][col]);
					col -= 1;
					row += 1;
				}
			}
		}
		return 0;
	}

}

