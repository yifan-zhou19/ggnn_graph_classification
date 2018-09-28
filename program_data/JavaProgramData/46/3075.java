package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[110][110];
		int row;
		int col;
		int rowup = 0;
		int rowdown = 0;
		int colleft = 0;
		int colright = 0;

		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= row; i++)
		{
			for (int j = 1; j <= col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		while (true)
		{
			for (int k = colleft + 1; k <= col - colright; k++)
			{
				System.out.print(array[rowup + 1][k]);
				System.out.print("\n");
			}
			rowup++;
			if (rowup + rowdown >= row)
			{
				break;
			}

			for (int k = rowup + 1; k <= row - rowdown; k++)
			{
				System.out.print(array[k][col - colright]);
				System.out.print("\n");
			}
			colright++;
			if (colright + colleft >= col)
			{
				break;
			}

			for (int k = col - colright; k >= colleft + 1; k--)
			{
				System.out.print(array[row - rowdown][k]);
				System.out.print("\n");
			}
			rowdown++;
			if (rowup + rowdown >= row)
			{
				break;
			}

			for (int k = row - rowdown; k >= rowup + 1; k--)
			{
				System.out.print(array[k][colleft + 1]);
				System.out.print("\n");
			}
			colleft++;
			if (colright + colleft >= col)
			{
				break;
			}
		}
		return 0;
	}
}

