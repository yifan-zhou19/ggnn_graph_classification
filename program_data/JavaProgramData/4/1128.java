package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		int k = 0;
		int[][] a = new int[100][100];
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[] p = a;
		for (k = 0;k < col;k++)
		{
			for (i = 0;i < row && k - i < col && k - i >= 0;i++)
			{
				System.out.print((p[i] + k - i));
				System.out.print("\n");
			}
		}
		for (k = col;k <= (row - 1) + (col - 1);k++)
		{
			for (i = k - col + 1;i < row && k - i >= 0;i++)
			{
				System.out.print((p[i] + k - i));
				System.out.print("\n");
			}
		}
		return 0;
	}
}

