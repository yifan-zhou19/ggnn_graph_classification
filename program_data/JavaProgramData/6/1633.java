package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int rie;
	   int k;
	   int i;
	   int ROW;
	   int COL;
	   int row;
	   int col;
	   int[][] sz = new int[100][100];
	   int[] sum = new int[100];

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   k = Integer.parseInt(tempVar);
	   }

	   for (i = 1;i <= k;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  ROW = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  COL = Integer.parseInt(tempVar3);
		  }
		  for (row = 0;row < ROW;row++)
		  {
			 for (col = 0;col < COL;col++)
			 {
				 String tempVar4 = ConsoleInput.scanfRead();
				 if (tempVar4 != null)
				 {
					 (sz[row][col]) = Integer.parseInt(tempVar4);
				 }
			 }
		  }
		  rie = 0;
		  for (col = 0;col <= COL - 1;col++)
		  {
					 rie += sz[0][col];
		  }
		  for (row = 1;row <= ROW - 1;row++)
		  {
					 rie += sz[row][COL - 1];
		  }
		  for (col = COL - 2;col >= 0;col--)
		  {
					 rie += sz[ROW - 1][col];
		  }
		  for (row = ROW - 2;row >= 1;row--)
		  {
					 rie += sz[row][0];
		  }
		  sum[i] = rie;
	   }

		for (i = 1;i <= k;i++)
		{
		   System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}
}

