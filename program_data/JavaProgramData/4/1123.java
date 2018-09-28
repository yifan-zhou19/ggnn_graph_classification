package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int t = 0;t < row + col - 1;t++)
		{
			for (j = (col - 1 > t != 0?t:col - 1);t - j <= row - 1 && j >= 0;j--)
			{
				System.out.print((*(a + t - j) + j));
				System.out.print("\n");
			}
		}
		return 0;
	}
}

