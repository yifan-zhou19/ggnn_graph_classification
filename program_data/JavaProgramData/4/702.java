package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] num = new int[110][110];
		for (int i = 0 ; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				*(*(num + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int i = 0; i < col; i++)
		{ // begin from the first element of each line
			for (int j = 0; j <= i; j++)
			{ // this part have j elements
				if (j < row)
				{
					System.out.print((*(num + j) + i - j));
					System.out.print("\n");
				}
				else
				{
					break;
				}
			}
		}
		for (int i = 1; i < row; i++)
		{ // begin from the last element of each row
			for (int j = 0; j < row - i; j++)
			{
				if (j < col)
				{
					System.out.print((*(num + i + j) + col - j - 1));
					System.out.print("\n");
				}
			}
		}

		return 0;
	}
}

