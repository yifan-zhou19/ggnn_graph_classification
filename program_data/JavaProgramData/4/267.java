package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int startrow = 0;
		int startcol = 0;

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
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		while ((startcol + startrow) != (row + col - 2))
		{
			if (startcol < col - 1)
			{
				for (i = startrow; (i < row) && (i <= startrow + startcol); i++)
				{
					System.out.printf("%d\n",sz[i][startcol + startrow - i]);
				}
				startcol++;
			}
			else
			{
				for (i = startrow; (i < row) && (i <= startrow + startcol); i++)
				{
					System.out.printf("%d\n",sz[i][startcol + startrow - i]);
				}
				startrow++;
			}
		}
		System.out.printf("%d",sz[row - 1][col - 1]);
		return 0;
	}
}

