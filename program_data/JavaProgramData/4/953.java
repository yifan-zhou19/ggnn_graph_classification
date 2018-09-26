package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[101][101];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int n = 0;n < col;n++)
		{
			for (int i = 0, j = n;j >= 0 && i < row;i++, j--)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
		}
		for (int n = 1;n < row;n++)
		{
			for (int i = n, j = col - 1;i < row && j >= 0;i++, j--)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
		}


		return 0;
	}
}

