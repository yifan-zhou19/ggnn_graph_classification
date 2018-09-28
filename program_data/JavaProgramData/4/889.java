package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[110][110];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= row;i++) //????
		{
			for (int j = 1;j <= col;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}

		for (int k = 2;k <= row + col;k++) //????????
		{
			for (int i = 1;i <= row;i++)
			{
				for (int j = 1;j <= col;j++)
				{
					if (i + j == k)
					{
						System.out.print((*(a + i) + j));
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}

