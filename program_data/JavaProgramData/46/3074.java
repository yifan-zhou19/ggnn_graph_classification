package <missing>;

public class GlobalMembers
{
	// homework : ????????
	// name     : ???



	public static int Main()
	{
		int[][] array = new int[100][100];
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int row1 = 0, row2 = row - 1, col1 = 0, col2 = col - 1; col1 <= col2 != 0 && row1 <= row2; row1++, row2--, col1++, col2--)
		{
			if (col1 == col2 && row1 == row2)
			{
				System.out.print(array[row1][col1]);
				System.out.print("\n");
				break;
			}
			if (row1 == row2)
			{
				for (int i = col1; i <= col2; i++)
				{
					System.out.print(array[row1][i]);
					System.out.print("\n");
				}
				break;
			}
			if (col1 == col2)
			{
				for (int i = row1; i <= row2; i++)
				{
					System.out.print(array[i][col1]);
					System.out.print("\n");
				}
				break;
			}
			for (int i = col1; i < col2; i++)
			{
				System.out.print(array[row1][i]);
				System.out.print("\n");
			}
			for (int i = row1; i < row2; i++)
			{
				System.out.print(array[i][col2]);
				System.out.print("\n");
			}
			for (int i = col2; i > col1; i--)
			{
				System.out.print(array[row2][i]);
				System.out.print("\n");
			}
			for (int i = row2; i > row1; i--)
			{
				System.out.print(array[i][col1]);
				System.out.print("\n");
			}
		}

		return 0;
	}
}

