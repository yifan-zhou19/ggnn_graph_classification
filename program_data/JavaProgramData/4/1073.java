package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] array = new int[row][col];
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				*(*(array + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int i = 0;i <= row + col - 2;i++)
		{
			for (int j = 0;j <= i;j++)
			{
				if (j < row && i - j < col)
				{
					System.out.print((*(array + j) + i - j));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

