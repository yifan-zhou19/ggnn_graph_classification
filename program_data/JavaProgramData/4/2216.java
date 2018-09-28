package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < col;i++)
		{
			for (j = 0;j < row && i - j >= 0;j++)
			{
				System.out.print(a[j][i - j]);
				System.out.print("\n");
			}
		}
		for (i = 1;i < row;i++)
		{
			for (j = 0;j < row - i && col - 1 - j >= 0;j++)
			{
				System.out.print(a[i + j][col - 1 - j]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

