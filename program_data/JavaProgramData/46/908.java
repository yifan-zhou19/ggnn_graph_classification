package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	 int[][] u = new int[100][100];
	 int m;
	 int n;
	 int i;
	 int j;
	 int x;
	 int y;
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
				   (u[i][j]) = Integer.parseInt(tempVar3);
			   }
		   }
		}
	   y = (m < n)?m:n;
	   x = y / 2;
	   if (y % 2 == 0)
	   {
	   for (k = 0;k < x;k++)
	   {
		   for (j = k;j <= n - 2 - k;j++)
		   {
			   i = k;
			   System.out.printf("%d\n",u[i][j]);
		   }
			   for (i = k;i <= m - 2 - k;i++)
			   {
			   j = n - 1 - k;
			   System.out.printf("%d\n",u[i][j]);
			   }
			   for (j = n - 1 - k;j >= k + 1;j--)
			   {
			   i = m - 1 - k;
			   System.out.printf("%d\n",u[i][j]);
			   }
			   for (i = m - 1 - k;i >= k + 1;i--)
			   {
			   j = k;
			   System.out.printf("%d\n",u[i][j]);
			   }
	   }
	   }
	   else
	   {
	   for (k = 0;k < x;k++)
	   {
		   for (j = k;j <= n - 2 - k;j++)
		   {
			   i = k;
			   System.out.printf("%d\n",u[i][j]);
		   }
			   for (i = k;i <= m - 2 - k;i++)
			   {
			   j = n - 1 - k;
			   System.out.printf("%d\n",u[i][j]);
			   }
			   for (j = n - 1 - k;j >= k + 1;j--)
			   {
			   i = m - 1 - k;
			   System.out.printf("%d\n",u[i][j]);
			   }
			   for (i = m - 1 - k;i >= k + 1;i--)
			   {
			   j = k;
			   System.out.printf("%d\n",u[i][j]);
			   }
	   }
	   if (m <= n)
	   {
		for (j = x;j <= n - 1 - x;j++)
		{
			System.out.printf("%d\n",u[x][j]);
		}
	   }
	   if (m > n)
	   {
		for (i = x;i <= m - 1 - x;i++)
		{
			System.out.printf("%d\n",u[i][x]);
		}
	   }
	   }
	   return 0;
	 }
}

