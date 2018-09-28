package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int n;
	   int m;
	   int k;
	   int N = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   int[][] a = new int[100][100];
	   for (i = 0;i < n;i++)
	   {
	   for (j = 0;j < m;j++)
	   {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar3);
	   }
	   }
	   }
	   for (k = 0;;k++)
	   {
	   for (j = k;j <= m - 1 - k;j++)
	   {
	   System.out.printf("%d\n",a[k][j]);
	   N++;
	   }
	   System.out.print("\n");
	   if (N == n * m)
	   {
		   break;
	   }
	   for (i = k + 1;i <= n - 1 - k;i++)
	   {
	   System.out.printf("%d\n",a[i][m - 1 - k]);
	   N++;
	   }
	   System.out.print("\n");
	   if (N == n * m)
	   {
		   break;
	   }
	   for (j = m - 2 - k;j >= k;j--)
	   {
	   System.out.printf("%d\n",a[n - 1 - k][j]);
	   N++;
	   }
	   System.out.print("\n");
	   if (N == n * m)
	   {
		   break;
	   }
	   for (i = n - 2 - k;i >= k + 1;i--)
	   {
	   System.out.printf("%d\n",a[i][k]);
	   N++;
	   }
	   System.out.print("\n");
	   if (N == n * m)
	   {
	   break;
	   }
	   }
	   return 0;
	}


}

