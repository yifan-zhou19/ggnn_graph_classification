package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int x1;
		  int y1;
		  int i = 0;
		  int j = 0;
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
		  int[][] a = new int[x1][y1];
		  while (i < x1)
		  {
					  while (j < y1)
					  {
								  String tempVar3 = ConsoleInput.scanfRead();
								  if (tempVar3 != null)
								  {
									  a[i][j] = Integer.parseInt(tempVar3);
								  }
								  j = j + 1;
					  }
					  j = 0;
					  i = i + 1;
		  }
		  int x2;
		  int y2;
		  i = 0,j = 0;
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
		  int[][] b = new int[x2][y2];
		  while (i < x2)
		  {
					  while (j < y2)
					  {
								  String tempVar6 = ConsoleInput.scanfRead();
								  if (tempVar6 != null)
								  {
									  b[i][j] = Integer.parseInt(tempVar6);
								  }
								  j = j + 1;
					  }
					  j = 0;
					  i = i + 1;
		  }
		  int[][] c = new int[x1][y2];
		  int m = 0;
		  int n = 0;
		  int sum = 0;
		  int k = 0;
		  while (m < x1)
		  {
					  while (n < y2)
					  {
								  while (k < y1)
								  {
											  sum = sum + a[m][k] * b[k][n];
											  k = k + 1;
								  }
								  c[m][n] = sum;
								  sum = 0;
								  n = n + 1;
								  k = 0;
					  }
					  n = 0;
					  m = m + 1;
		  }
		  m = 0,n = 0;
		  while (m < x1)
		  {
					  while (n < y2)
					  {
								  if (n == (y2 - 1))
								  {
									 System.out.printf("%d\n",c[m][n]);
								  }
								  else
								  {
									 System.out.printf("%d ",c[m][n]);
								  }
								  n = n + 1;
					  }
					  n = 0;
					  m = m + 1;
		  }
	}

}

