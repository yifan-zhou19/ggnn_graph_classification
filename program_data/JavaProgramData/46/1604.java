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
	 int c = 0;
	 int h;
	 row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 System.out.print("\n");
	 k = row * col;
	 int[][] a = new int[row][col];
	 int[][] b = new int[row + 2][col + 2];
	 for (i = 0;i <= row - 1;i++)
	 {
		 for (j = 0;j <= col - 1;j++)
		 {
		  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	 }
	 for (i = 1;i <= row;i++)
	 {
		 for (j = 1;j <= col;j++)
		 {
		  b[i][j] = 1;
		 }
	 }
	 for (i = 0;i <= col + 1;i++)
	 {
		 b[0][i] = 0;
		 b[row + 1][i] = 0;
	 }
	 for (j = 1;j <= row;j++)
	 {
		 b[j][0] = 0;
		 b[j][col + 1] = 0;
	 }
	 i = 0;
	 j = 0;
	 h = 1;
	 while (1 > 0)
	 {
		 if (h % 4 == 1 && c < k)
		 {
		  do
		  {
		   System.out.print(a[i][j]);
		   System.out.print("\n");
		b[i + 1][j + 1] = 0;
		c = c + 1;
		j = j + 1;
		  }while (b[i + 1][j + 1] != 0);
	   h = h + 1;
	   i = i + 1;
	   j = j - 1;
		 }
	  if (h % 4 == 2 && c < k)
	  {
		  do
		  {
		   System.out.print(a[i][j]);
		   System.out.print("\n");
		b[i + 1][j + 1] = 0;
		c = c + 1;
		i = i + 1;
		  }while (b[i + 1][j + 1] != 0);
	   h = h + 1;
	   j = j - 1;
	   i = i - 1;
	  }
	  if (h % 4 == 3 && c < k)
	  {
		  do
		  {
		   System.out.print(a[i][j]);
		   System.out.print("\n");
		b[i + 1][j + 1] = 0;
		c = c + 1;
		j = j - 1;
		  }while (b[i + 1][j + 1] != 0);
	   h = h + 1;
	   i = i - 1;
	   j = j + 1;
	  }
	  if (h % 4 == 0 && c < k)
	  {
		  do
		  {
		   System.out.print(a[i][j]);
		   System.out.print("\n");
		b[i + 1][j + 1] = 0;
		c = c + 1;
		i = i - 1;
		  }while (b[i + 1][j + 1] != 0);
	   h = h + 1;
	   j = j + 1;
	   i = i + 1;
	  }
	  if (c == k)
	  {
		  break;
	  }
	 }
	return 0;
	}

}

