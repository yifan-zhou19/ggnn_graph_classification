package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row; //?????????
		int col;
		int[][] a = new int[110][110];
		int max;
		int min;

		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < row; i++)
		{
		for (int j = 0; j < col; j++)
		{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}

		if (row > col)
		{
			max = row;
			min = col;
		}
		else
		{
			max = col;
			min = row;
		}

		for (int i = 0; i < min; i++)
		{
		for (int j = 0; j <= i; j++)
		{
		System.out.print(a[j][i - j]);
		System.out.print("\n");
		}
		}

		if (col != row)
		{
			for (int i = min; i < max; i++)
			{
				if (col > row)
				{
				for (int j = 0; j < min; j++)
				{
				System.out.print(a[j][i - j]);
				System.out.print("\n");
				}
				}

				else
				{
				for (int j = col - 1; j >= 0; j--)
				{
				System.out.print(a[i - j][j]);
				System.out.print("\n");
				}
				}
			}
		}


		for (int i = max; i <= row + col - 2; i++)
		{
		for (int j = col - 1; i - j <= row - 1; j--)
		{
		System.out.print(a[i - j][j]);
		System.out.print("\n");
		}
		}



		return 0;
	}
}

