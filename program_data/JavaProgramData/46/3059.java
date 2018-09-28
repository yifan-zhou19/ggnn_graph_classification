package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[105][105];
		int i;
		int j;
		int k;
		int min;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (row < col)
		{
			min = row;
		}
		else
		{
			min = col;
		}
		if (min % 2 == 0)
		{
			min = min / 2;
		}
		else
		{
			min = min / 2 + 1;
		}
		for (k = 0; k < min; k++)
		{
			for (j = k; j < col - k; j++)
			{
				System.out.print(a[k][j]);
				System.out.print("\n");
			}
			for (i = k + 1; i < row - k ; i++)
			{
				System.out.print(a [i][col - k - 1]);
				System.out.print("\n");
			}
			for (j = col - 2 - k; j >= k != 0 && (row - k - 1 > k); j--)
			{
				System.out.print(a [row - k - 1][j]);
				System.out.print("\n");
			}
			for (i = row - 2 - k; i >= 1 + k && (col - k - 1 > k); i--)
			{
				System.out.print(a [i][k]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

