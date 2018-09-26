package <missing>;

public class GlobalMembers
{
	   public static int Main()
	   {
	   int i;
	   int j;
	   int m;
	   int n;
	   int k;
	   int b;
	   int c;
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
	   int[][] a = new int[m][n];
	   for (i = 0;i < m;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar3);
			  }
		   }
	   }
	   if (m > n)
	   {
	   b = n;
	   }
	   else
	   {
	   b = m;
	   }
		if (b % 2 == 0)
		{
		c = b / 2;
		}
		else
		{
		c = b / 2 + 1;
		}
		   for (k = 0;k < c;k++)
		   {
				 for (j = k;j < n - k - 1;j++)
				 {
					 System.out.printf("%d\n",a[k][j]);
				 }
				 for (i = k;i < m - k - 1;i++)
				 {
					 System.out.printf("%d\n",a[i][n - k - 1]);
				 }
			  if ((b % 2 == 0) || (b % 2 != 0 && k != c - 1))
			  {
			  for (j = n - k - 1;j > k;j--)
			  {
				 System.out.printf("%d\n",a[m - k - 1][j]);
			  }
			  }
			  if ((b % 2 == 0) || (b % 2 != 0 && k != c - 1))
			  {
			  for (i = m - k - 1;i > k;i--)
			  {
				 System.out.printf("%d\n",a[i][k]);
			  }
			  }
		   }
			  if (m == n && m % 2 == 1)
			  {
				 System.out.printf("%d\n",a[c - 1][c - 1]);
			  }
			  if (m < n && m % 2 == 1)
			  {
				 System.out.printf("%d",a[c - 1][n - c]);
			  }
			  if (m > n && n % 2 == 1)
			  {
				 System.out.printf("%d",a[m - c][c - 1]);
			  }
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  n = Integer.parseInt(tempVar4);
			  }
	   return 0;
	   }




}

