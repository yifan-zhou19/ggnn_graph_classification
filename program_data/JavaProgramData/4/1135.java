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
		for (int i = 0 ; i < row ; i++)
		{
			for (int j = 0 ; j < col ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int i = 0;
		int j = 0;
		for (; i < row ; i++)
		{
			for (; j < col ; j++)
			{
				for (int m = i, n = j ; m < row && n > -1 ; m++, n--)
				{
					System.out.print(a[m][n]);
					System.out.print("\n");
				}
			}
			j--;
		}
		return 0;
	}
}

