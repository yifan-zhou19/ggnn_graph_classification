package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	 int[][] u = new int[100][100];
	 int[] c = new int[10];
	 int[] d = new int[10];
	 int[] e = new int[10];
	 int[] f = new int[10];
	 int m;
	 int n;
	 int i;
	 int j;
	 int[] a = new int[10];
	 int[] b = new int[10];
	 int x = -1;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 scanf(",");
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
		a[i] = u[0][0];
		for (i = 0;i < m;i++)
		{
		   for (j = 0;j < n - 1;j++)
		   {
			  c[i] = i;
			  d[i] = 0;
			  a[i] = u[i][0];
			  if (u[i][j] < u[i][j + 1])
			  {
				 a[i] = u[i][j + 1];
				 d[i] = j + 1;
			  }
		   }
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < m - 1;i++)
			{
			   f[j] = j;
			   e[j] = 0;
			   b[j] = u[0][j];
			   if (u[i][j] > u[i + 1][j])
			   {
				  b[j] = u[i + 1][j];
				  e[j] = i + 1;
			   }
			}
		}
		 for (i = 0;i < m;i++)
		 {
		   for (j = 0;j < n;j++)
		   {
		   if (u[c[i]][d[i]] == u[e[j]][f[j]])
		   {
		   System.out.printf("%d+%d\n",j,i);
		   x = 1;
		   }
		   }
		 }
		 if (x == -1)
		 {
			 System.out.print("No");
		 }
	 return 0;
	 }
}

