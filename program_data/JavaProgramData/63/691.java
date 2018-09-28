package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int x1;
	 int x2;
	 int y1;
	 int y2;
	 int i;
	 int j;
	 int k;
	 int m;
	 x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int[][] a = new int[x1][y1];
	 for (i = 0;i < x1;i++)
	 {
	 for (j = 0;j < y1;j++)
	 {
	 a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 }
	 x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int[][] b = new int[x2][y2];
	 for (i = 0;i < x2;i++)
	 {
	 for (j = 0;j < y2;j++)
	 {
	 b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 }
	 int[][] c = new int[x1][y2];
	 k = x2 - 1;
	 for (i = 0;i < x1;i++)
	 {
	 for (j = 0;j < y2;j++)
	 {
		 c[i][j] = 0;
		 for (m = 0;m <= k;m++)
		 {
			 c[i][j] += a[i][m] * b[m][j];
		 }
	 }
	 }
	 for (i = 0;i < x1;i++)
	 {
	  for (j = 0;j < y2 - 1;j++)
	  {
		 System.out.print(c[i][j]);
		 System.out.print(" ");
	  }
	  System.out.print(c[i][y2 - 1]);
	  System.out.print("\n");
	 }
	 return 0;

	}
}

