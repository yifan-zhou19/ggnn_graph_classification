package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int x1;
		  int x2;
		  int y1;
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
		  int[][] a = new int[x1][y1];
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
		  for (i = 0;i < x2;i++)
		  {
				 for (j = 0;j < y2;j++)
				 {
				 String tempVar6 = ConsoleInput.scanfRead();
				 if (tempVar6 != null)
				 {
					 b[i][j] = Integer.parseInt(tempVar6);
				 }
				 }
		  }
		  int[][] c = new int[x1][y2];
		  for (i = 0;i < x1;i++)
		  {
					for (j = 0;j < y2;j++)
					{
								   c[i][j] = 0;
								  for (int k = 0;k < x2;k++)
								  {
								   c[i][j] = c[i][j] + a[i][k] * b[k][j];
								  }
					}
		  }
		  int n = 0;
		  for (i = 0;i < x1;i++)
		  {
					for (j = 0;j < y2;j++)
					{
						   if (j == 0)
						   {
							 System.out.printf("%d",c[i][0]);
								   n++;
						   }
						  if (j >= 1)
						  {
								 System.out.printf(" %d",c[i][j]);
								 n++;
						  }
							 if (n % y2 == 0)
							 {
							 System.out.print("\n");
							 }
					}
		  }
	return 0;
	}
}

