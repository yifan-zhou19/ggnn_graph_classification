package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int k;
	   int m;
	   int n;
	   int i;
	   int j;
	   int l;
	   int[][] b = new int[101][101];
	   int[] sum = new int[1000];
	   k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (l = 1;l <= k;l++)
	   {
		   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  for (i = 1;i <= m;i++)
		  {
			 for (j = 1;j <= n;j++)
			 {
			 b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 }
		  }

		 sum[l] = 0;
		 for (j = 1;j <= n;j++)
		 {
			 sum[l] += b[1][j];
		 }
		 for (j = 1;j <= n;j++)
		 {
			 sum[l] += b[m][j];
		 }
		 for (i = 2;i < m;i++)
		 {
			 sum[l] += b[i][1];
		 }
		 for (i = 2;i < m;i++)
		 {
			 sum[l] += b[i][n];
		 }

	   }
	 if (k == 1)
	 {
		 System.out.print(sum[1]);
	 }
	 else
	 {
		 System.out.print(sum[1]);
	   for (l = 2;l <= k;l++)
	   {
		   System.out.print("\n");
	   System.out.print(sum[l]);
	   }
	 }
	   return 0;
	}
}

