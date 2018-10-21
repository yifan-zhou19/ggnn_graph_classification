package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] p = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int k;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				 *(*(p + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		} //????
		for (k = 0;k < row + col - 1;k++)
		{ //??????????
			for (i = 0;i <= k != 0 && i < row && k - i < col && k - i >= 0;i++)
			{
				System.out.print((*(p + i) + k - i));
				System.out.print("\n");
			} //???????????????????
			for (j = col - 1;j <= k != 0 && j >= 0 && k - j < row && k - j>0;j--)
			{
				System.out.print((*(p + k - j) + j));
				System.out.print("\n");
			} //??????????????????????1????????
		}
		return 0;
	}

}

