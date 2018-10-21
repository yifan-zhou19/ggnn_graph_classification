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
		int k;
		int min;
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (row > col)
		{
			for (j = 0; j < col; j++)
			{
				for (i = 0, k = j; k >= 0; i++, k--)
				{
					System.out.print(a[i][k]);
					System.out.print("\n");
				}
			}
			for (i = 1; i < row - col + 1; i++)
			{
				for (j = col - 1, k = i; j >= 0; j--, k++)
				{
					System.out.print(a[k][j]);
					System.out.print("\n");
				}
			}
			for (; i < row; i++)
			{
				for (j = col - 1, k = i; k < row; k++, j--)
				{
					System.out.print(a[k][j]);
					System.out.print("\n");
				}
			}
		}
		else
		{
			for (j = 0; j < row; j++)
			{
				for (i = 0, k = j; k >= 0; k--, i++)
				{
					System.out.print(a[i][k]);
					System.out.print("\n");
				}
			}
			for (; j < col; j++)
			{
				for (i = 0, k = j; i < row; k--, i++)
				{
					System.out.print(a[i][k]);
					System.out.print("\n");
				}
			}
			for (i = 1; i < row; i++)
			{
				for (k = i, j = col - 1; k < row; k++, j--)
				{
					System.out.print(a[k][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

