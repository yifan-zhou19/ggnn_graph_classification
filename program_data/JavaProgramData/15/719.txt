package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[][] a = new int[n][n];
	   int i;
	   int j;
	   int e;
	   int b;
	   int c;
	   int d;
	   int s;
	   for (i = 0;i < n;i++)
	   {
			for (j = 0;j < n;j++)
			{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar2);
			   }
			}
	   scanf("\n");
	   }
		  for (i = 0;i < n;i++)
		  {
			for (j = 0;j < n;j++)
			{
			   if (a[i][j] == 0)
			   {
				   e = i;
				   b = j;
			   }
			}
		  }
			 for (i = n - 1;i >= 0;i--)
			 {
			for (j = n - 1;j >= 0;j--)
			{
			   if (a[i][j] == 0)
			   {
				   c = i;
				   d = j;
			   }
			}
			 }
		 s = (c - e+1) * (d - b + 1);
		 System.out.printf("%d",s);
	}


}

