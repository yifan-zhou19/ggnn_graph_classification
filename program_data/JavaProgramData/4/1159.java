package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];

		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= row; i++)
		{
			for (int j = 1; j <= col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 2; i <= col + row; i++)
		{
			for (int j = 1; j <= i - 1; j++)
			{
				if (i - j > col)
				{
					continue;
				}
				if (j > row)
				{
					continue;
				}
				System.out.print(a[j][i - j]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

