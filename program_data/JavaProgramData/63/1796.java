package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[100][100];
	   int[][] b = new int[100][100];
	   int[][] c = new int[100][100];
	   int d;
	   int e;
	   int f;
	   int g;
	   int i;
	   int j;
	   int k;
	   int m;
	   int n;
	   int p;
	   int q;
	   int r;
	   int s;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   d = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   e = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i <= d - 1;i++)
	   {
		 for (j = 0;j <= e-1;j++)
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
		   f = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ");
	   if (tempVar5 != null)
	   {
		   g = Integer.parseInt(tempVar5);
	   }
	   for (k = 0;k <= f - 1;k++)
	   {
		 for (m = 0;m <= g - 1;m++)
		 {
		 String tempVar6 = ConsoleInput.scanfRead();
		 if (tempVar6 != null)
		 {
			 b[k][m] = Integer.parseInt(tempVar6);
		 }
		 }
	   }
	   for (n = 0;n <= d - 1;n++)
	   {
		  for (p = 0;p <= g - 1;p++)
		  {
			  for (q = 0;q <= e-1;q++)
			  {
				if (q == 0)
				{
				c[n][p] = a[n][q] * b[q][p];
				}
				else
				{
				c[n][p] = c[n][p] + a[n][q] * b[q][p];
				}
			  }
		  }
	   }
	   for (r = 0;r <= d - 1;r++)
	   {
		  for (s = 0;s <= g - 1;s++)
		  {
		  if (s != g - 1)
		  {
		  System.out.printf("%d ",c[r][s]);
		  }
		  else if (s == g - 1 && r != d - 1)
		  {
		  System.out.printf("%d\n",c[r][s]);
		  }
		  else if (s == g - 1 && r == d - 1)
		  {
		  System.out.printf("%d",c[r][s]);
		  }
		  }
	   }
	}
}

