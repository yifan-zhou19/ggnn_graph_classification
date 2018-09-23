package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int j;
	 int k;
	 int b;
	 int c;
	 int x;
	 int y;
	 b = c = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[][] sz = new int[n][n];
	 for (j = 0; j <= n - 1; j++)
	 {
	   for (k = 0; k <= n - 1; k++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   sz[j][k] = Integer.parseInt(tempVar2);
		   }
		   if (sz[j][k] == 0)
		   {
			 x = j;
			 y = k;
		   }
	   }
	 }
	 for (j = 0; j <= n - 1; j++)
	 {
	   for (k = 0; k <= n - 1; k++)
	   {
		   if (sz[j][k] == 0)
		   {
			 b = j;
			 c = k;
			 break;
		   }
	   }
		 if (sz[b][c] == 0)
		 {
		 break;
		 }
	 }
	   int m;
	   m = (x - b - 1) * (y - c - 1);
	   System.out.printf("%d",m);
	   return 0;
	}



}

