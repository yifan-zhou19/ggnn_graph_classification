package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[105][105];
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		} //????
		for (int i = 0;i < row + col - 1;i++)
		{
			for (int j = 0;j < row;j++)
			{
				for (int k = 0;k < col;k++)
				{
					if (j + k == i)
					{
						System.out.print((*(a + j) + k));
						System.out.print("\n");
					}
				}
			}
		} //??

			return 0;
	}

}

