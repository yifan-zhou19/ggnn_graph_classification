package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int row;
	int col;
	int rowsx;
	int rowxx;
	int colsx;
	int colxx;
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
	   int[][] sz = new int[100][100];
	   for (int i = 0;i < row;i++)
	   {
		  for (int j = 0;j < col;j++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  sz[i][j] = Integer.parseInt(tempVar3);
			  }
		  }
	   }
	   rowsx = row - 1;
	   rowxx = 0;
		colsx = col - 1;
		colxx = 0;
		while (rowxx <= rowsx != 0 && colxx <= colsx)
		{
		   if (rowxx == rowsx)
		   {
			  for (int o = colxx;o <= colsx;o++)
			  {
				 System.out.printf("%d\n",sz[rowxx][o]);
			  }
			  break;
		   }
		   if (colsx == colxx)
		   {
			  for (int p = rowxx;p <= rowsx;p++)
			  {
				 System.out.printf("%d\n",sz[p][colxx]);
			  }
			  break;
		   }

		   for (int k = colxx;k <= colsx;k++)
		   {
			  System.out.printf("%d\n",sz[rowxx][k]);
		   }
		   for (int l = rowxx + 1;l <= rowsx;l++)
		   {
			  System.out.printf("%d\n",sz[l][colsx]);
		   }
		   for (int m = colsx - 1;m >= colxx;m--)
		   {
			  System.out.printf("%d\n",sz[rowsx][m]);
		   }
		   for (int n = rowsx - 1;n > rowxx;n--)
		   {
			  System.out.printf("%d\n",sz[n][colxx]);
		   }
		   rowsx--;
		   rowxx++;
		   colsx--;
		   colxx++;
		}
	return 0;
	}


}

