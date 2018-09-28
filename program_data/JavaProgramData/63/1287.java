package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[102][102];
		int[][] b = new int[102][102];
		int[][] c = new int[102][102];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < x;i++)
		{
				 for (j = 0;j < y;j++)
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
			  m = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  n = Integer.parseInt(tempVar5);
		  }
		   for (i = 0;i < m;i++)
		   {
				 for (j = 0;j < n;j++)
				 {
						 String tempVar6 = ConsoleInput.scanfRead();
						 if (tempVar6 != null)
						 {
							 b[i][j] = Integer.parseInt(tempVar6);
						 }
				 }
		   }
			for (i = 0;i < x;i++)
			{
					  for (k = 0;k < n - 1;k++)
					  {
						   for (j = 0;j < y;j++)
						   {
								   c[i][k] += a[i][j] * b[j][k];
						   }
							   System.out.printf("%d ",c[i][k]);
					  }
						  for (j = 0;j < y;j++)
						  {
							c[i][n - 1] += a[i][j] * b[j][n - 1];
						  }
						  System.out.printf("%d\n",c[i][n - 1]);
			}

	}



}

