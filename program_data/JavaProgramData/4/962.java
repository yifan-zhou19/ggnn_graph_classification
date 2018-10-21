package <missing>;

public class GlobalMembers
{
	/* Name      : ?????????? 
	 * Version   : 1.0
	 * Date      : 2012-12-08
	 * New       : Null
	 * Func&Feat : ???????? 
	 * State     : Design
	 */
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int dia = 0;dia < row + col - 1;dia++)
		{
			if (dia < col)
			{
				for (int iRow = 0;dia - iRow >= 0 && iRow < row;iRow++)
				{
					System.out.print((*(a + iRow) + dia - iRow));
					System.out.print("\n");
				}
			}
			else
			{
				for (int iRow = dia - col + 1;dia - iRow >= 0 && iRow < row;iRow++)
				{
					System.out.print((*(a + iRow) + dia - iRow));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

