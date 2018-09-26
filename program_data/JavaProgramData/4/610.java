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
	 int h;
	 row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 System.out.print("\n");
	 int[][] a = new int[row][col];
	 for (i = 0;i <= row - 1;i++)
	 {
		 for (j = 0;j <= col - 1;j++)
		 {
		  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	 }
	 if (row != 1 && col != 1)
	 {
		 for (j = 0;j <= col - 1;j++)
		 {
		  k = 0;
	   h = j;
	   while (k <= row - 1 && h >= 0)
	   {
		   System.out.print(a[k][h]);
		   System.out.print("\n");
		k = k + 1;
		h = h - 1;
	   }
		 }
	  for (i = 1;i <= row - 1;i++)
	  {
		  k = col - 1;
	   h = i;
	   while (h <= row - 1 && k >= 0)
	   {
		   System.out.print(a[h][k]);
		   System.out.print("\n");
		h = h + 1;
		k = k - 1;
	   }
	  }
	 }
	 if (row == 1 && col != 1)
	 {
		 for (i = 0;i <= col - 1;i++)
		 {
		  System.out.print(a[0][i]);
		  System.out.print("\n");
		 }
	 }
	 if (col == 1 && row != 1)
	 {
		 for (i = 0;i <= row - 1;i++)
		 {
		  System.out.print(a[i][0]);
		  System.out.print("\n");
		 }
	 }
	 if (row == 1 && col == 1)
	 {
		 System.out.print(a[0][0]);
		 System.out.print("\n");
	 }
	 return 0;
	}





}

