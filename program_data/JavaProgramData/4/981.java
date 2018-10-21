package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		int row = 0;
		int col = 0;
		int i = 0;
		int j = 0;
		int min = 0;
		int rowbegin = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[row][col];
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		min = row < col != 0?row:col;
		while (k <= col + row - 1)
		{
			i = 0;
			if (k > col - 1)
			{
				rowbegin++;
			}

			for (i = rowbegin; i <= k != 0 && i < row; i++)
			{
				System.out.print(a[i][k - i]);
				System.out.print("\n");
			}
			k++;
		}
		return 0;
	}

}

