package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
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
		}
		for (int m = 0;m < row + col - 1; m++)
		{
		 for (int i = 0 ;i < row ;i++)
		 {
			 for (int j = 0;j < col;j++)
			 {
				 if (i + j == m)
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

