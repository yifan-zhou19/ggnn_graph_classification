package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int k;
	 int i;
	 int j;
	 int row;
	 int col;
	 int sx_row;
	 int sx_col;
	 int s;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Integer.parseInt(tempVar);
	 }
	 for (a = 0;a < k;a++)
	 {
	s = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		row = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		col = Integer.parseInt(tempVar3);
	}
		 int[][] sz = new int[100][100];
		 for (i = 0;i < row;i++)
		 {
		  for (j = 0;j < col;j++)
		  {
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   sz[i][j] = Integer.parseInt(tempVar4);
		   }
		  }
		 }
		 sx_row = row - 1;
		 sx_col = col - 1;
	  for (j = 0;j < sx_col;j++)
	  {
	   s = s + sz[0][j];
	  }
	  for (i = 0;i < sx_row;i++)
	  {
	   s = s + sz[i][sx_col];
	  }
	  for (j = sx_col;j > 0;j--)
	  {
	   s = s + sz[sx_row][j];
	  }
	  for (i = sx_row;i > 0;i--)
	  {
	   s = s + sz[i][0];
	  }
	  System.out.printf("%d\n",s);
	 }
	 return 0;
	}
}

