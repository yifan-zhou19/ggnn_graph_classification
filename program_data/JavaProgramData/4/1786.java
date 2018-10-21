package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row = 0;
		int col = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] array = new int[100][100];
		int i;
		int j;
		int n;
		for (i = 0 ; i < row ; i++)
		{
			for (j = 0 ; j < col ; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (n = 0 ; n < row + col ; n++)
		{
			for (i = 0, j = n - 1 ; i < n, j >= 0 ; i++, j--)
			{
				if (i < row && j < col)
				{
					System.out.print(array[i][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

