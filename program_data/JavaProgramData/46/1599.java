package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p; //row:?,col:?
		int row;
		int col;
		int i;
		int k;
		int j;
		int[][] a = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (col > row)
		{
			p = row / 2 + row % 2;
		}
		else
		{
			p = col / 2 + col % 2;
		}
		for (i = 0;i < p;i++)
		{
		for (k = i;k < col - i;k++)
		{
			System.out.print(a[i][k]);
			System.out.print("\n");
		}
		for (k = i + 1;k < row - i;k++)
		{
			System.out.print(a[k][col - i - 1]);
			System.out.print("\n");
		}
		if (i != row - i - 1)
		{
		for (k = col - i - 2;k >= i;k--)
		{
			System.out.print(a[row - i - 1][k]);
			System.out.print("\n");
		}
		}
		if (i != col - i - 1)
		{
		for (k = row - i - 2;k > i;k--)
		{
			System.out.print(a[k][i]);
			System.out.print("\n");
		}
		}
		}
		return 0;
	}
}

