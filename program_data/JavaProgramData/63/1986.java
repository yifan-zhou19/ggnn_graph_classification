package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[100][100];
		  int[][] b = new int[100][100];
		  int m;
		  int n;
		  int p;
		  int q;
		  int j;
		  int i;
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
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
						a[i][j] = Integer.parseInt(tempVar3);
					}
			   }
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  p = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead();
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
					 for (k = 0;k < n;k++)
					 {
						   c[i][j] = c[i][j] + a[i][k] * b[k][j];
					 }
			   }
		  }
		  for (i = 0;i < m;i++)
		  {
			   System.out.printf("%d",c[i][0]);
			   for (j = 1;j < q;j++)
			   {
					 System.out.printf(" %d",c[i][j]);
			   }
			   System.out.print("\n");
		  }
	}


}

