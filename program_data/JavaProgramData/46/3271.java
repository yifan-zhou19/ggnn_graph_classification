package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row = 0;
		int col = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] array = new int[101][101];
		int i = 0;
		int j = 0;
		int k = 0;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0;(row - 2 * k > 2) && (col - 2 * k > 2);k++)
		{
			for (j = k;j < col - k;j++)
			{
				System.out.print(array[k][j]);
				System.out.print("\n");
			}
			for (i = k + 1;i < row - k;i++)
			{
				System.out.print(array[i][col - 1 - k]);
				System.out.print("\n");
			}
			for (j = col - 2 - k;j >= k;j--)
			{
				System.out.print(array[row - 1 - k][j]);
				System.out.print("\n");
			}
			for (i = row - 2 - k;i >= k + 1;i--)
			{
				System.out.print(array[i][k]);
				System.out.print("\n");
			}
		}
		if (row == col)
		{
			for (j = k;j < col - k;j++)
			{
				System.out.print(array[k][j]);
				System.out.print("\n");
			}
			for (i = k + 1;i < row - k;i++)
			{
				System.out.print(array[i][col - 1 - k]);
				System.out.print("\n");
			}
			for (j = col - 2 - k;j >= k;j--)
			{
				System.out.print(array[row - 1 - k][j]);
				System.out.print("\n");
			}
			for (i = row - 2 - k;i >= k + 1;i--)
			{
				System.out.print(array[i][k]);
				System.out.print("\n");
			}
		}
		else
		{
			for (j = k;j < col - k;j++)
			{
				System.out.print(array[k][j]);
				System.out.print("\n");
			}
			for (i = k + 1;i < row - k;i++)
			{
				System.out.print(array[i][col - 1 - k]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

