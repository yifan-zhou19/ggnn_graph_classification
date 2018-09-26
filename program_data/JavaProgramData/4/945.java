package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int row;
			int col;
			int i;
			int j;
			int k;
			int[][] a = new int[100][100];
			row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < row;i++)
			{
				for (j = 0;j < col;j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (i = 0;i < col - 1;i++)
			{
				for (j = 0, k = i;k >= 0 && j < row;k--, j++)
				{
					System.out.print((*(a + j) + k));
					System.out.print("\n");
				}
			}
			for (i = 0;i < row;i++)
			{
				for (j = col - 1, k = i;k < row && j >= 0;k++, j--)
				{
					System.out.print((*(a + k) + j));
					System.out.print("\n");
				}
			}
	}



}

