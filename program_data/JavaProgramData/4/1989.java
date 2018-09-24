package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] array = new int[100][100];
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

		for (i = 0; i < col; i++)
		{
			for (j = 0; j <= i; j++)
			{
				if (j < row)
				{
					System.out.print(array[j][i - j]);
					System.out.print("\n");
				}
			}
		}

		for (j = 1; j < row; j++)
		{
			for (i = col - 1; i >= 0; i--)
			{
				if (col - 1 + j - i < row)
				{
					System.out.print(array[col - 1 - i + j][i]);
					System.out.print("\n");
				}
			}
		}

		return 0;
	}

}

