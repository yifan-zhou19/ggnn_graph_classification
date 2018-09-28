package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int row;
		int col;
		int i;
		int j;
		int n;
		int sum;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (n = 0; n < row + col - 1; n++)
		{
			for (i = 0; i <= n;i++)
			{
				if (i < row && n - i < col)
				{
					System.out.print(a[i][n - i]);
					System.out.print("\n");
				}
				else
				{
					continue;
				}
			}
		}
		return 0;
	}
}

