package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row1;
		int row2;
		int col1;
		int col2;
		int i;
		int j;
		int[][] a = new int[100 + 10][100 + 10];
		int[][] b = new int[100 + 10][100 + 10];
		int[][] c = new int[100 + 10][100 + 10];
		int k;
		row1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= row1;i++)
		{
			for (j = 1;j <= col1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		row2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= row2;i++)
		{
			for (j = 1;j <= col2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= row1;i++)
		{
			for (j = 1;j <= col2;j++)
			{
				for (k = 1;k <= col1;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		for (i = 1;i <= row1;i++)
		{
				for (j = 1;j < col2;j++)
				{
					System.out.print(c[i][j]);
					System.out.print(' ');
				}
				System.out.print(c[i][col2]);
				System.out.print("\n");
		}
		return 0;
	}

}

