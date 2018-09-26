package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int t;
		int i;
		int j;
		int k;
		int[][] a = new int[101][101];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = row + col - 1;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 0;i < t;i++)
		{
			for (j = 0;j < row;j++)
			{
				for (k = 0;k < col;k++)
				{
					if ((j + k) == i)
					{
						System.out.print((*(a + j) + k));
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}
}

