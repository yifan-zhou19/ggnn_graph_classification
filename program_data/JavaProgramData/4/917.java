package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		int i;
		int j;
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < col; i++)
		{
			for (j = 0; j <= i; j++)
			{
				if (j < row)
				{
				System.out.print(a[j][i - j]);
				System.out.print("\n");
				}
			}
		}
		for (i = 1; i < row; i++)
		{
			for (j = i; j < col + i; j++)
			{
				if (j < row)
				{
				System.out.print(a[j][col + i - j - 1]);
				System.out.print("\n");
				}
			}
		}

		return 0;
	}
}

