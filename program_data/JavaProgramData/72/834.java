package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;
	   int i;
	   int j;
	   int[][] sz = new int[20][20];
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
	   for (i = 0;i < m;i++)
	   {
			 for (j = 0;j < n;j++)
			 {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  (sz[i][j]) = Integer.parseInt(tempVar3);
				  }
			 }
	   }
	   for (i = 0;i < m;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
				if (i > 0 && i < m - 1 && j>0 && j < n - 1 && sz[i][j] >= sz[i][j - 1] != 0 && sz[i][j] >= sz[i][j + 1] != 0 && sz[i][j] >= sz[i + 1][j] != 0 && sz[i][j] >= sz[i - 1][j])
				{
						System.out.printf("%d %d\n",i,j);
				}
				if (i == 0 && j == 0 && sz[0][0] >= sz[0][1] != 0 && sz[0][0] >= sz[1][0])
				{
						System.out.printf("%d %d\n",i,j);
				}
				if (i == 0 && j == n - 1 && sz[0][n - 1] >= sz[0][n - 2] != 0 && sz[0][n - 1] >= sz[1][n - 1])
				{
						System.out.printf("%d %d\n",i,j);
				}
				if (i == m - 1 && j == 0 && sz[m - 1][0] >= sz[m - 1][1] != 0 && sz[m - 1][0] >= sz[m - 2][0])
				{
						System.out.printf("%d %d\n",i,j);
				}
				if (i == m - 1 && j == n - 1 && sz[m - 1][n - 1] >= sz[m - 1][n - 2] != 0 && sz[m - 1][n - 1] >= sz[m - 2][n - 1])
				{
					 System.out.printf("%d %d\n",i,j);
				}
				if ((i == 0 && j > 0 && j < n - 1 && sz[i][j] >= sz[i + 1][j] != 0 && sz[i][j] >= sz[i][j - 1] != 0 && sz[i][j] >= sz[i][j + 1]) || (i == m - 1 && j > 0 && j < n - 1 && sz[i][j] >= sz[i - 1][j] != 0 && sz[i][j] >= sz[i][j + 1] != 0 && sz[i][j] >= sz[i][j - 1]) || (j == 0 && i > 0 && i < m - 1 && sz[i][j] >= sz[i][j + 1] != 0 && sz[i][j] >= sz[i - 1][j] != 0 && sz[i][j] >= sz[i + 1][j]) || (j == n - 1 && i > 0 && i < m - 1 && sz[i][j] >= sz[i][j - 1] != 0 && sz[i][j] >= sz[i - 1][j] != 0 && sz[i][j] >= sz[i + 1][j]))
				{
					 System.out.printf("%d %d\n",i,j);
				}
		   }
	   }
	return 0;
	}









}

