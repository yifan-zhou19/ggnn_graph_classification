package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[200][200];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < row ; i++)
		{
			for (int j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i <= row + col - 2; i++)
		{
			for (int j = 0; j <= i != 0 && j < row && (i - j) < col; j++)
			{
				System.out.print((a[j] + (i - j)));
				System.out.print("\n");
			}
		}
		for (int k = col; k <= row + col - 2; k++)
		{
			for (int q = col - 1; q >= k - row + 1 && q >= 0;q--)
			{
				System.out.print((a[k - q] + q));
				System.out.print("\n");
			}
		}
		return 0;
	}
}

