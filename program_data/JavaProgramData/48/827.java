package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[12][12];
	   int[][] b = new int[12][12];
	   int i;
	   int j;
	   int k;
	   int f;
	   int t;
	   int m;
	   int n;
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
	   for (k = 0;k < n;k++)
	   {
		 for (i = 1;i <= 9;i++)
		 {
			 for (j = 1;j <= 9;j++)
			 {
			 b[i][j] = 2 * a[i][j] + a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] + a[i][j - 1] + a[i][j + 1] + a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1];
			 }
		 }
		   for (t = 1;t <= 9;t++)
		   {
		   for (f = 1;f <= 9;f++)
		   {
		   a[t][f] = b[t][f];
		   }
		   }
	   }
	   for (i = 1;i <= 9;i++)
	   {
	   for (j = 1;j <= 9;j++)
	   {
		 if (j <= 8)
		 {
		 System.out.printf("%d ",a[i][j]);
		 }
		 else
		 {
		 System.out.printf("%d\n",a[i][j]);
		 }
	   }
	   }

	}

}

