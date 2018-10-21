package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] array = new int[99][99];
		int i;
		int j;
		int k;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 0;
		j = 0;
		for (k = 0; k <= col - 1; k++)
		{
			j = k;
			i = 0;
			do
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				j = j - 1;
				i = k - j;
			}while (i != row && j != -1);
		}
		for (k = col; k <= col + row - 2; k++)
		{
			j = col - 1;
			i = k - j;
			do
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				j = j - 1;
				i = i + 1;
			}while (i != row && j != -1);
		}
		return 0;
	}

}

