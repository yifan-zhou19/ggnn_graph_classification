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

		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0;i < col;i++)
		{
			for (j = i;j >= 0 && i - j < row;j--)
			{
				System.out.print(a[i - j][j]);
				System.out.print("\n");
			}
		}

		for (i = 1;i < row;i++)
		{
			for (j = col - 1;(j >= 0) && (i + col - 1 - j < row) ;j--)
			{
				System.out.print(a[i + col - 1 - j][j]);
				System.out.print("\n");
			}
		}


		return 0;
	}
}

