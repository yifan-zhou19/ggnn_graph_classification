package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int m;
		  int n1;
		  int m1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  int[][] a = new int[n][m];
		  for (int i = 0;i < n;i++)
		  {
		  for (int j = 0;j < m;j++)
		  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  a[i][j] = Integer.parseInt(tempVar3);
				  }
		  }
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  n1 = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  m1 = Integer.parseInt(tempVar5);
		  }
		  int[][] b = new int[n1][m1];
		  for (int i = 0;i < n1;i++)
		  {
		  for (int j = 0;j < m1;j++)
		  {
				  String tempVar6 = ConsoleInput.scanfRead();
				  if (tempVar6 != null)
				  {
					  b[i][j] = Integer.parseInt(tempVar6);
				  }
		  }
		  }
		  int[][] c = new int[n][m1];
		  for (int i = 0;i < n;i++)
		  {
		  for (int j = 0;j < m1;j++)
		  {
				  c[i][j] = 0;
		  }
		  }
		  int g;
		  int q;
		  for (int i = 0;i < n;i++)
		  {
		  for (int j = 0;j < m1;j++)
		  {
				  for (int x = 0;x < m;x++)
				  {
						  c[i][j] += a[i][x] * b[x][j];
						  g = c[i][j];
						  q = a[i][x] * b[x][j];
				  }
		  }
		  }
		  int count = 0;
		  for (int i = 0;i < n;i++)
		  {
		  for (int j = 0;j < m1;j++)
		  {
				  if (count == 0)
				  {
				  System.out.printf("%d",c[i][j]);
				  }
				  else
				  {
				  System.out.printf(" %d",c[i][j]);
				  }
				  count = 1;
				  if (j == m1 - 1)
				  {
							 System.out.print("\n");
							 count = 0;
				  }
		  }
		  }
	}

}

