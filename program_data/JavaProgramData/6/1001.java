package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int row;
		int col;
		int ROW;
		int[][] sz = new int[100][100];
		int COL;
		int[] sum = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
						sum[i] = 0;
		}
		for (i = 0;i < k;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 ROW = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
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
																			  sz[row][col] = Integer.parseInt(tempVar4);
																		  }
												  }
						 }
						if (ROW == 1 && COL == 1)
						{
										  sum[i] = sum[i] + sz[0][0];
						}
						 else
						 {
						 for (col = 0;col < COL;col++)
						 {
												 sum[i] = sum[i] + sz[0][col] + sz[ROW - 1][col];
						 }
						 for (row = 1;row < (ROW - 1);row++)
						 {
													 sum[i] = sum[i] + sz[row][0] + sz[row][COL - 1];
						 }
						 }

		}
		for (i = 0;i < k;i++)
		{
		System.out.printf("%d\n", sum[i]);
		}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		k = Integer.parseInt(tempVar5);
	}
	return 0;
	}
}

