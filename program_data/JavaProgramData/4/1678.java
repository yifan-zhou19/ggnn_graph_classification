package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int k;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0;k <= col - 1;k++)
		{
			for (i = 0, j = k - i;i <= row - 1 && j >= 0;i++, j--)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
		}
		for (k = col;k <= row + col - 2;k++)
		{
			for (j = col - 1, i = k - j;i <= row - 1 && j >= 0;i++, j--)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
		}
	}



}

