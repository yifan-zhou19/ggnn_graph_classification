package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int j;
	int k;
	int[][][] sz = new int[5][20][20];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   n = n + 1;



		   sz[0][5][5] = m;
	  for (k = 0;k < n;k++)
	  {
		   for (i = 1;i < 10;i++)
		   {
			  for (j = 1;j < 10;j++)
			  {
				 sz[k + 1][i][j] = (sz[k][i][j] * 2 + sz[k][i][j + 1] + sz[k][i][j - 1] + sz[k][i - 1][j] + sz[k][i + 1][j] + sz[k][i + 1][j + 1] + sz[k][i + 1][j - 1] + sz[k][i - 1][j + 1] + sz[k][i - 1][j - 1]);
			  }
		   }
	  }
		 for (i = 1;i < 9;i++)
		 {
			for (j = 1;j < 9;j++)
			{
				 System.out.printf("%d ",sz[n - 1][i][j]);
			}
			 System.out.printf("%d\n",sz[n - 1][i][9]);

		 }
		 for (i = 9,j = 1;j < 9;j++)
		 {
			  System.out.printf("%d ",sz[n - 1][i][j]);
		 }
		 System.out.printf("%d",sz[n - 1][9][9]);

	return 0;
	}

}

