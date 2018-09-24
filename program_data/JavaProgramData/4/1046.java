package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[110][110];
		int i;
		int j;
		for (i = 0;i < row;i++)
		{
				for (j = 0;j < col;j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
		}
		for (i = 0;i < col;i++)
		{
			for (j = 0;j <= i != 0 && j < row;j++)
			{
				System.out.print((*(a + j) + i - j));
				System.out.print("\n");
			}
		}
		for (i = 1;i < row;i++)
		{
				for (j = col - 1;j > i + col - 1 - row && j >= 0;j--)
				{
					System.out.print((*(a + i + col - j - 1) + j));
					System.out.print("\n");
				}
		}
		return 0;
	}

}

