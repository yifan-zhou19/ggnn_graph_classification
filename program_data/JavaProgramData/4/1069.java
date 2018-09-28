package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] matrix = new int[120][120];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p[100];
		int[] p = new int[100];
		for (int i = 0; i < row; i++)
		{
			p[i] = matrix[i][0];
			for (int j = 0; j < col; j++)
			{
				matrix[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			}
		}
		if (col >= row)
		{
			for (int i = 0; i < col; i++)
			{
				for (int j = 0; (i - j) < col && (i - j) >= 0 && j < row; j++)
				{
					System.out.print((p[j] + i - j));
					System.out.print("\n");
				}

			}
			for (int i = col; i < (col + row - 1); i++)
			{
				for (int j = col - 1; i - j < row; j--)
				{
					System.out.print((p[i - j] + j));
					System.out.print("\n");
				}
			}
		}
		else
		{
			for (int i = 0; i < col; i++)
			{
				for (int j = 0; (i - j) < col && (i - j) >= 0 && j < row; j++)
				{
					System.out.print((p[j] + i - j));
					System.out.print("\n");
				}

			}
			for (int i = col; i < (col + row - 1); i++)
			{
				for (int j = col - 1; i - j < row && j >= 0; j--)
				{
					System.out.print((p[i - j] + j));
					System.out.print("\n");
				}
			}

		}

	}
}

