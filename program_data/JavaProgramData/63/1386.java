package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[100][101];
	   int[][] b = new int[101][100];
	   int[][] c = new int[100][100];
	   int i;
	   int j;
	   int k;
	   int p;
	   int q;
	   int x;
	   int y;
	   int m;
	   int n;
	   int s;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   q = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < m;i++)
	   {
		 for (j = 0;j < (q - 1);j++)
		 {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i][j] = Integer.parseInt(tempVar3);
		   }
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 a[i][q - 1] = Integer.parseInt(tempVar4);
		 }
	   }
	   String tempVar5 = ConsoleInput.scanfRead();
	   if (tempVar5 != null)
	   {
		   q = Integer.parseInt(tempVar5);
	   }
	   String tempVar6 = ConsoleInput.scanfRead(" ");
	   if (tempVar6 != null)
	   {
		   n = Integer.parseInt(tempVar6);
	   }
	   for (i = 0;i < q;i++)
	   {
		 for (j = 0;j < (n - 1);j++)
		 {
		   String tempVar7 = ConsoleInput.scanfRead();
		   if (tempVar7 != null)
		   {
			   b[i][j] = Integer.parseInt(tempVar7);
		   }
		 }
		 String tempVar8 = ConsoleInput.scanfRead();
		 if (tempVar8 != null)
		 {
			 b[i][n - 1] = Integer.parseInt(tempVar8);
		 }
	   }
	   for (i = 0;i < m;i++)
	   {
		 for (j = 0;j < n;j++)
		 {
			 s = 0;
		   for (k = 0;k <= q;k++)
		   {
			 s = s + a[i][k] * b[k][j];
		   }
		   c[i][j] = s;

		 }
	   }
	   for (i = 0;i < m;i++)
	   {
		 for (j = 0;j < (n - 1);j++)
		 {
		   System.out.printf("%d ",c[i][j]);
		 }
		 System.out.printf("%d\n",c[i][n - 1]);
	   }



	}

}

