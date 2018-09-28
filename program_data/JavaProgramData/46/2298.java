package <missing>;

public class GlobalMembers
{
	public static int[][] b = new int[100][100];
	public static void circle(int[][] array, int row, int col)
	{
		int i;
		for (i = 0; i < col; i++)
		{
			System.out.print(array[0][i]);
			System.out.print("\n");
		}
		for (i = 1; i < row; i++)
		{
			System.out.print(array[i][col - 1]);
			System.out.print("\n");
		}
		for (i = col - 2; i >= 0; i--)
		{
			if (row > 1)
			{
				System.out.print(array[row - 1][i]);
				System.out.print("\n");
			}
		}
		for (i = row - 2; i > 0; i--)
		{
			if (col > 1)
			{
				System.out.print(array[i][0]);
				System.out.print("\n");
			}
		}
	}
	public static void change(int[][] array, int row, int col)
	{
		int i;
		int j;
		for (i = 0; i < row - 2; i++)
		{
			for (j = 0; j < col - 2; j++)
			{
				b[i][j] = array[i + 1][j + 1];
			}
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int row;
		int col;
		int[][] array = new int[100][100];
		int k = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				b[i][j] = array[i][j];
			}
		}
		if (row > col)
		{
			for (k = 0; k < col; k = k + 2)
			{
				circle(b, row - k, col - k);
				change(b, row - k, col - k);
			}
		}
		else
		{
			for (k = 0; k < row; k = k + 2)
			{
				circle(b, row - k, col - k);
				change(b, row - k, col - k);
			}
		}
		return 0;
	}


}

