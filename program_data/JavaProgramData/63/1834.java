package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[100][100];
		  int[][] b = new int[100][100];
		  int[][] c = new int[100][100];
		  int x1;
		  int y1;
		  int x2;
		  int y2;
		  int i;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x1 = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  y1 = Integer.parseInt(tempVar2);
		  }
		  for (i = 0;i < x1;i++)
		  {
						   for (j = 0;j < y1;j++)
						   {
											String tempVar3 = ConsoleInput.scanfRead();
											if (tempVar3 != null)
											{
												a[i][j] = Integer.parseInt(tempVar3);
											}
						   }
		  }
		  int p;
		  int q;
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  x2 = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  y2 = Integer.parseInt(tempVar5);
		  }
		  for (p = 0;p < x2;p++)
		  {
						   for (q = 0;q < y2;q++)
						   {
											String tempVar6 = ConsoleInput.scanfRead();
											if (tempVar6 != null)
											{
												b[p][q] = Integer.parseInt(tempVar6);
											}
						   }
		  }
		  for (int m = 0;m < x1;m++)
		  {
				  for (int n = 0;n < y2;n++)
				  {
						  for (int x = 0;x < y1;x++)
						  {
							  c[m][n] = c[m][n] + a[m][x] * b[x][n];
						  }
				  }
		  }
		  for (int m = 0;m < x1;m++)
		  {
				  int n;
				  for (n = 0;n < y2 - 1;n++)
				  {
						  System.out.printf("%d ",c[m][n]);
				  }
						  if (n == y2 - 1)
						  {
						  System.out.printf("%d\n",c[m][n]);
						  }
		  }
	}

}

