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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		int[][] data = new int[100][100];
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					data[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int colLow = 0;
		int rowLow = 0;
		int colHigh = col - 1;
		int rowHigh = row - 1;
		while (rowLow <= rowHigh != 0 && colLow <= colHigh)
		{
			for (int i = colLow; i <= colHigh; i++)
			{
				System.out.printf("%d\n", data[rowLow][i]);
			}
			for (int i = rowLow + 1; i <= rowHigh - 1; i++)
			{
				System.out.printf("%d\n", data[i][colHigh]);
			}
			if (rowHigh != rowLow)
			{
				for (int i = colHigh; i >= colLow; i--)
				{
					System.out.printf("%d\n", data[rowHigh][i]);
				}
			}
			if (colHigh != colLow)
			{
				for (int i = rowHigh - 1; i >= rowLow + 1; i--)
				{
					System.out.printf("%d\n", data[i][colLow]);
				}
			}
			colLow++;
			rowLow++;
			colHigh--;
			rowHigh--;
		}
	}


}

