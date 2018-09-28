package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] array = new int[101][101];
		int i;
		int j;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		col--;
		row--;
		for (i = 0; i <= row + col; i++)
		{
			for (j = 0; j <= i; j++)
			{
				if (i - j <= col != 0 && j <= row)
				{
					System.out.print(array[j][i - j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

