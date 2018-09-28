package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[11][11];
	   int[][] b = new int[11][11];
	   int i;
	   int j;
	   int k;
	   int l;
	   int m;
	   int n;
	   int x;
	   int y;
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
	   a[5][5] = m;
	   b[5][5] = m;
	   for (i = 1;i <= n;i++)
	   {
			  for (j = 1;j < 10;j++)
			  {
					 for (k = 1;k < 10;k++)
					 {
							 for (x = 0 - 1;x <= 1;x++)
							 {
									 for (y = 0 - 1;y <= 1;y++)
									 {
											 b[j][k] = b[j][k] + a[j + x][k + y];
									 }
							 }
					 }
			  }
			 for (j = 1;j < 10;j++)
			 {
					for (k = 1;k < 10;k++)
					{
							 a[j][k] = b[j][k];
					}
			 }
	   }
	   for (j = 1;j < 10;j++)
	   {
			 for (k = 1;k < 9;k++)
			 {
					 System.out.printf("%d ",a[j][k]);
			 }
			 System.out.printf("%d\n",a[j][9]);
	   }

	}
}

