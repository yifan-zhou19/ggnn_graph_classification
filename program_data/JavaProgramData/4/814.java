package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i = 0;
		int j = 0;
		int row;
		int col;

		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (;i != (row - 1) || j != (col - 1);)
		{
			System.out.print((*(a + i) + j));
			System.out.print("\n");
			i++;
			j--;
			if (j < 0 || i> row - 1)
			{
				if (i + j + 1 < col)
				{
					j = i + j + 1;
					i = 0;
				}
				else
				{
					i = i + j + 1 - (col - 1);
					j = col - 1;

				}
			}

		}
		System.out.print((*(a + row - 1) + col - 1));
	}

}

