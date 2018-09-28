package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int row;
	 int col;
	 int xx_row;
	 int sx_row;
	 int xx_col;
	 int sx_col;
	 int[][] a = new int[100][100];
	 int i;
	 int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 row = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 col = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < row;i++)
	 {
	  for (j = 0;j < col;j++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar3);
	   }
	  }
	 }
	 xx_row = 0;
	 sx_row = row;
	 xx_col = 0;
	 sx_col = col;
	 while ((xx_row <= sx_row) && (xx_col <= sx_col))
	 {
	  for (j = xx_col;j < sx_col;j++)
	  {
	   System.out.printf("%d\n",a[xx_row][j]);
	  }

	  for (i = xx_row + 1;i < sx_row;i++)
	  {
	   System.out.printf("%d\n",a[i][sx_col - 1]);
	  }
	  if (xx_row >= sx_row - 1)
	  {
	   break;
	  }
		  if (xx_col >= sx_col - 1)
		  {
	   break;
		  }
	  for (j = sx_col - 2;j > xx_col;j--)
	  {
	   System.out.printf("%d\n",a[sx_row - 1][j]);
	  }
	  for (i = sx_row - 1;i > xx_row;i--)
	  {
	   System.out.printf("%d\n",a[i][xx_col]);
	  }
	  xx_row++;
	  xx_col++;
	  sx_row--;
	  sx_col--;
	 }



	 return 0;
	}
}

