package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int[][] flag =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int row;
		int col;
		int i;
		int j;
		int rowstart;
		int colstart;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= row; i++)
		{
			for (j = 1; j <= col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				flag[i][j] = 1;
			}
		}
		rowstart = colstart = 1;
		do
		{
			for (i = colstart; i <= col; i++)
			{
				if (flag[rowstart][i] == 0 || array[rowstart][i] == 0)
				{
					break;
				}
				System.out.print(array[rowstart][i]);
				System.out.print("\n");
				flag[rowstart][i] = 0;
			}
			rowstart++;
			for (i = rowstart; i <= row; i++)
			{
				if (flag[i][col] == 0 || array[i][col] == 0)
				{
					break;
				}
				System.out.print(array[i][col]);
				System.out.print("\n");
				flag[i][col] = 0;
			}
			col--;
			for (i = col; i >= colstart; i--)
			{
				if (flag[row][i] == 0 || array[row][i] == 0)
				{
					break;
				}
				System.out.print(array[row][i]);
				System.out.print("\n");
				flag[row][i] = 0;
			}
			row--;
			for (i = row; i >= rowstart; i--)
			{
				if (flag[i][colstart] == 0 || array[i][colstart] == 0)
				{
					break;
				}
				System.out.print(array[i][colstart]);
				System.out.print("\n");
				flag[i][colstart] = 0;
			}
			colstart++;
			if (row == rowstart && col == colstart)
			{
				System.out.print(array[row][col]);
			}
		}while (row > rowstart || col > colstart);
		return 0;
	}
}

