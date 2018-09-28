package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] num = new int[120][120];

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

		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (int k = 0; k <= col + row - 1; k++)
		{
			int minRow;
			int minCol;
			if (k < col)
			{
				minRow = 0;
			}
			else
			{
				minRow = k - col + 1;
			}

			if (k < row)
			{
				minCol = 0;
			}
			else
			{
				minCol = k - row + 1;
			}

			for (int i = minRow; i <= k; i++)
			{
				if ((k - i) >= minCol)
				{
					System.out.printf("%d\n", num[i][k - i]);
				}
			}
		}

		return 0;
	}
}

