package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row = 0;
		int col = 0;
		int[][] a = new int[101][101];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i < col;i++)
		{
			System.out.print(((a) + i));
			System.out.print("\n");
			for (int j = 1;i - j >= 0 && j < row;j++)
			{
				System.out.print((*(a + j) + i - j));
				System.out.print("\n");
			}
		}
		for (int i = 1;i < row;i++)
		{
			System.out.print((*(a + i) + col - 1));
			System.out.print("\n");
			for (int j = 1;i + j < row && j <= col - 1;j++)
			{
				System.out.print((*(a + i + j) + col - 1 - j));
				System.out.print("\n");
			}

		}
		return 0;
	}
}

