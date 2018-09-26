package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int[][] a = new int[100][100];
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
		  int i;
		  int j;
		  for (i = 0;i < m;i++)
		  {
						  for (j = 0;j < n;j++)
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
		  int[][] b = new int[100][100];
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  p = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  q = Integer.parseInt(tempVar5);
		  }
		  for (i = 0;i < p;i++)
		  {
						  for (j = 0;j < q;j++)
						  {
										  String tempVar6 = ConsoleInput.scanfRead();
										  if (tempVar6 != null)
										  {
											  b[i][j] = Integer.parseInt(tempVar6);
										  }
						  }
		  }
		  int[][] c = new int[100][100];
		  for (i = 0;i < m;i++)
		  {
						  for (j = 0;j < q;j++)
						  {
										  c[i][j] = 0;
										  for (int k = 0;k < n;k++)
										  {
												  c[i][j] += a[i][k] * b[k][j];
										  }
										  if (j < q - 1)
										  {
										  System.out.printf("%d ",c[i][j]);
										  }
										  if (j == q - 1)
										  {
										  System.out.printf("%d\n",c[i][j]);
										  }
						  }
		  }
	}

}

