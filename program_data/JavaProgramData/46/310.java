package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int ROW;
	 int COL;
	 int[][] b = new int[100][100];
	 int row;
	 int col;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 ROW = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 COL = Integer.parseInt(tempVar2);
	 }
	 for (row = 0;row < ROW;row++)
	 {
	  for (col = 0;col < COL;col++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   (b[row][col]) = Integer.parseInt(tempVar3);
	   }
	  }
	 }
	 row = 0;
	 col = 0;
	 int i = 0;
	 int k = 0;
	 while (i < ROW && k < COL)
	 {
	  for (col = k;col < COL - k;col++)
	  {
	   if (b[row][col] != 0)
	   {
		System.out.printf("%d\n",b[row][col]);
		b[row][col] = 0;
	   }
	   else
	   {
		return 0;
	   }
	  }
	  col--;
	  for (row = 1 + i;row < ROW - i;row++)
	  {
	   if (b[row][col] != 0)
	   {
		System.out.printf("%d\n",b[row][col]);
		b[row][col] = 0;
	   }
	   else
	   {
		return 0;
	   }
	  }
	  row--;
	  for (col = col - 1;col >= k;col--)
	  {
	   if (b[row][col] != 0)
	   {
		System.out.printf("%d\n",b[row][col]);
		b[row][col] = 0;
	   }
	   else
	   {
		return 0;
	   }
	  }
	  col++;
			i++;
	  for (row = row - 1;row >= i;row--)
	  {
	   if (b[row][col] != 0)
	   {
		System.out.printf("%d\n",b[row][col]);
		b[row][col] = 0;
	   }
	   else
	   {
		return 0;
	   }
	  }
	  row++;
	  k++;
	 }
	 return 0;
	}

}

