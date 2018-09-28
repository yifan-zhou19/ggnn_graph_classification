package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[110][110];
		int row; //row????col???
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i1 = 0;i1 < row;i1++)
		{
			for (int j1 = 0;j1 < col;j1++)
			{
				*(*(a + i1) + j1) = ConsoleInput.readToWhiteSpace(true);
			}
		} //???????
		if (row < col)
		{
			for (int i = 0;i < col;i++)
			{
				for (int j = i;j >= 0;j--)
				{
					if (i - j <= row - 1 && i - j >= 0)
					{
					System.out.print((*(a + (i - j)) + j));
					System.out.print("\n");
					}
				}
			} //?????????????,?????????????
			for (int k = col;k <= col + row - 2;k++)
			{
				for (int w = col - 1;w >= 1;w--)
				{
					if (k - w <= row - 1 && w <= col - 1)
					{
					System.out.print((*(a + k - w) + w));
					System.out.print("\n");
					}
				}
			}
		}
		else if (row > col)
		{
			for (int i = 0;i < col;i++)
			{
				for (int j = i;j >= 0;j--)
				{
					if (i - j <= row - 1)
					{
					System.out.print((*(a + (i - j)) + j));
					System.out.print("\n");
					}
				}
			} //?????????????,?????????????

			for (int k = col;k <= col + row - 2;k++)
			{
				for (int w = col - 1;w >= 0;w--)
				{
					if (k - w >= 0 && k - w <= row - 1 && w <= col - 1 && w >= 0)
					{
						  System.out.print((*(a + k - w) + w));
						  System.out.print("\n");
					}
				}
			}
		}
		else if (row = col)
		{
			for (int i = 0;i < col;i++)
			{
				for (int j = i;j >= 0;j--)
				{
					if (i - j <= row - 1)
					{
					System.out.print((*(a + (i - j)) + j));
					System.out.print("\n");
					}
				}
			} //?????????????,?????????????
			for (int k = col;k <= col + row - 2;k++)
			{
				for (int w = col - 1;w >= 0;w--)
				{
					if (k - w >= 0 && k - w <= row - 1 && w <= col - 1 && w >= 0)
					{
						  System.out.print((*(a + k - w) + w));
						  System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

