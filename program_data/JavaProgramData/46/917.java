package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] Array = new int[100][100];
		int startRow = 0;
		int startCol = 0;
		int endRow;
		int endCol;
		int step = 1;

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
					Array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		endRow = row - 1;
		endCol = col - 1;
		while (startRow <= endRow != 0 && startCol <= endCol)
		{
			switch (step)
			{
			case 1:
				for (j = startCol; j <= endCol; j++)
				{
					System.out.printf("%d\n", Array[startRow][j]);
				}
				step++;
				startRow++;
				break;
			case 2:
				for (i = startRow; i <= endRow; i++)
				{
					System.out.printf("%d\n", Array[i][endCol]);
				}
				step++;
				endCol--;
				break;
			case 3:
				for (j = endCol; j >= startCol; j--)
				{
					System.out.printf("%d\n", Array[endRow][j]);
				}
				step++;
				endRow--;
				break;
			case 4:
				for (i = endRow; i >= startRow; i--)
				{
					System.out.printf("%d\n", Array[i][startCol]);
				}
				step = 1;
				startCol++;
				break;
			}
		}
		return 0;
	}
}

