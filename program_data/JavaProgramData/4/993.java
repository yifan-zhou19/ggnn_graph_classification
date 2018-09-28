package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int row;
	public static int col;
	public static int Main()
	{
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= row; i++)
		{
			for (int j = 1; j <= col; j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int i = 2; i <= row + col; i++)
		{
			for (int j = Math.max(1, i - col); j <= Math.min(row, i - 1); j++)
			{
				System.out.print((*(a + j) + i - j));
				System.out.print("\n");
			}
		}
		return 0;
	}

}

