package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int col;
	 int row;
	 int i;
	 int j;
	 int[][] a = new int[100][100];
	 row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < row;i++)
	 {
		 for (j = 0;j < col;j++)
		 {
			 a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	 }
	 for (i = 0;(row - 2 * i > 0) && (col - 2 * i > 0);i++)
	 {
			 for (j = i;j < col - i;j++)
			 {
			 System.out.print(a[i][j]);
			 System.out.print("\n");
			 }
		  for (j = i + 1;j < row - i;j++)
		  {
			 System.out.print(a[j][col - i - 1]);
			 System.out.print("\n");
		  }
		  for (j = col - i - 2;j >= i != 0 && row - 2 * i > 1;j--)
		  {
			  System.out.print(a[row - i - 1][j]);
			  System.out.print("\n");
		  }
		  for (j = row - i - 2;j > i && col - 2 * i > 1;j--)
		  {
			  System.out.print(a[j][i]);
			  System.out.print("\n");
		  }
	 }
	 return 0;
	}
}

