package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][10];
		int[][] b = new int[10][10];
	  int i;
	  int j;
	  int k;
	  int m;
	  int n;
	  int p;
	  int q;
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
	  for (i = 1;i <= 9;i++)
	  {
	  for (j = 1;j <= 9;j++)
	  {
	  a[i][j] = 0;
	  }
	  }
	  a[5][5] = m;
	   /*for (j=1;j<=9;j++)
	   {
	     for (k=1;k<=9;k++) printf("%d ",a[j][k]);
	     printf("\n");}
	   printf("\n");*/

	  for (i = 1;i <= n;i++)
	  {
		  for (j = 1;j <= 9;j++)
		  {
	   for (k = 1;k <= 9;k++)
	   {
	   b[j][k] = 0;
	   }
		  }

		for (j = 1;j <= 9;j++)
		{
		for (k = 1;k <= 9;k++)
		{
			b[j][k] = b[j][k] + 2 * a[j][k];
		  for (p = -1;p <= 1;p++)
		  {
		  for (q = -1;q <= 1;q++)
		  {
		  if ((p != 0) || (q != 0))
		  {
			  b[j + p][k + q] = b[j + p][k + q] + a[j][k];
		  }
		  }
		  }
		}
		}
		for (j = 1;j <= 9;j++)
		{
		for (k = 1;k <= 9;k++)
		{
		a[j][k] = b[j][k];
		}
		}
	  }
	   for (j = 1;j <= 9;j++)
	   {
		 for (k = 1;k <= 9;k++)
		 {
			 System.out.printf("%d",a[j][k]);
			 if (k < 9)
			 {
				 System.out.print(" ");
			 }
		 }
		 System.out.print("\n");
	   }
	}

}

