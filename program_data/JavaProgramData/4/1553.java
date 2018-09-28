package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int row;
		int col;
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
		for (k = 0;k < col;k++)
		{
			for (i = 0, j = k;j >= 0 && i < row;i++, j--)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
		}
		for (k = 1;k < row;k++)
		{
			for (i = k, j = col - 1;i < row && j >= 0;i++, j--)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

