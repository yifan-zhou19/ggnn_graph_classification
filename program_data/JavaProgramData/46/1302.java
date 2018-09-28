package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int row1;
		int row2;
		int col1;
		int col2;
		int[][] array = new int[100][100];
		int i;
		int j;
		int i1;
		int i2;
		int j1;
		int j2;
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
					(array[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		col1 = 0;
		col2 = col - 1;
		row1 = 0;
		row2 = row - 1;
		while ((row2 - row1 > 0) && (col2 - col1 > 0))
		{
			for (i1 = col1;i1 < col2;i1++)
			{
				System.out.printf("%d\n",array[row1][i1]);
			}
			for (j1 = row1;j1 < row2;j1++)
			{
				System.out.printf("%d\n",array[j1][col2]);
			}
			for (i2 = col2;i2 > col1;i2--)
			{
				System.out.printf("%d\n",array[row2][i2]);
			}
			for (j2 = row2;j2 > row1;j2--)
			{
				System.out.printf("%d\n",array[j2][col1]);
			}
			col1++;
			col2--;
			row1++;
			row2--;
		}
		if ((row2 - row1 == 0) && (col2 - col1 != 0))
		{
			for (i = col1;i <= col2;i++)
			{
				System.out.printf("%d\n",array[row1][i]);
			}
		}
		if ((col2 - col1 == 0) && (row2 - row1 != 0))
		{
			for (j = row1;j <= row2;j++)
			{
				System.out.printf("%d\n",array[j][col1]);
			}
		}
		if ((col2 - col1 == 0) && (row2 - row1 == 0))
		{
			System.out.printf("%d\n",array[row1][col1]);
		}
		return 0;
	}


}

