package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[row][col];
		int i;
		int j;
		int t = 0; //?????t?
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		while ((row > 2 * t) && (col > 2 * t))
		{
			for (i = t; i <= col - t - 1; i++)
			{
				System.out.print(a[t][i]);
				System.out.print("\n");
			}

			for (i = t + 1; i <= row - t - 1; i++)
			{
				System.out.print(a[i][col - t - 1]);
				System.out.print("\n");
			}

			if (col == 2 * t + 1 || row == 2 * t + 1)
			{
				break;
			}

			for (i = col - t - 2; i >= t + 1; i--)
			{
				System.out.print(a[row - t - 1][i]);
				System.out.print("\n");
			}

			for (i = row - t - 1; i >= t + 1; i--)
			{
				System.out.print(a[i][t]);
				System.out.print("\n");
			}

			t++;
		}

		return 0;
	}
}

