package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] array = new int[100][100];
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
				array[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		int x_row = 0;
		int s_row = row - 1;
		int x_col = 0;
		int s_col = col - 1;
		while (x_row < s_row && x_col < s_col)
		{
			for (j = x_col;j < s_col;j++)
			{
				if (x_row == 0 && j == 0)
				{
				System.out.printf("%d",array[x_row][j]);
				}
				else
				{
				System.out.printf("\n%d",array[x_row][j]);
				}
			}
			for (i = x_row;i < s_row;i++)
			{
			System.out.printf("\n%d",array[i][s_col]);
			}
			for (j = s_col;j > x_col;j--)
			{
			System.out.printf("\n%d",array[s_row][j]);
			}
			for (i = s_row;i > x_row;i--)
			{
			System.out.printf("\n%d",array[i][x_col]);
			}
			x_row += 1;
			s_row -= 1;
			x_col += 1;
			s_col -= 1;
		}
		if (row <= col != 0 && row % 2 == 1)
		{
			for (j = (row - 1) / 2;j <= col - 1 - (row - 1) / 2;j++)
			{
				if (row == 1 && j == 0)
				{
				System.out.printf("%d",array[(row - 1) / 2][j]);
				}
				else
				{
			System.out.printf("\n%d",array[(row - 1) / 2][j]);
				}
			}
		}
		if (col < row && col % 2 == 1)
		{
			for (i = (col - 1) / 2;i <= row - 1 - (col - 1) / 2;i++)
			{
			System.out.printf("\n%d",array[i][(col - 1) / 2]);
			}
		}
		return 0;
	}
}

