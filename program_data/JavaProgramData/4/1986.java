package <missing>;

public class GlobalMembers
{
	/*
	 * array.cpp
	 * ??????
	 * ????: 2012-12-14
	 * ???????????????????????
	 */
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0;i < col;i++)
		{
			for (j = 0;j < row && i - j >= 0;j++)
			{
				System.out.print((*(a + j) + i - j));
				System.out.print("\n");
			}
		}
		for (i = 1;i < row;i++) //???????????
		{
			for (j = col - 1;j >= 0 && i + col - 1 - j < row;j--)
			{
				System.out.print((*(a + i + col - 1 - j) + j));
				System.out.print("\n");
			}
		}
		return 0; //????


	}

}

