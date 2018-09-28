package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[100][100];
	   int r;
	   int c;
	   int m;
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   r = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   c = Integer.parseInt(tempVar2);
	   }
	   for (int i = 0;i < r;i++)
	   {
		  for (int j = 0;j < c;j++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar3);
			  }
		  }
	   }
	   for (int k = 0;r - k > k && c - k > k;k++)
	   {
		  for (m = k,n = k;n < c - k - 1;n++)
		  {
			  System.out.printf("%d\n",a[m][n]);
		  }
		  for (m = k;m < r - k - 1;m++)
		  {
			  System.out.printf("%d\n",a[m][n]);
		  }
		  if (m == k || n == k)
		  {
			  System.out.printf("%d\n",a[m][n]);
			  break;
		  }
		  for (n = c - k - 1;n > k;n--)
		  {
			  System.out.printf("%d\n",a[m][n]);
		  }
		  for (m = r - k - 1;m > k;m--)
		  {
			  System.out.printf("%d\n",a[m][n]);
		  }
	   }
	   return 0;
	}
}

