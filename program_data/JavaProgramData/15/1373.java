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
	   int x1;
	   int x2;
	   int y1;
	   int y2;
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
	  }
	for (i = 0;i < n;i++)
	{
					for (j = 0;j < n;j++)
					{
					if (a[i][j] == 0)
					{
								 x1 = i;
								  y1 = j;
								   break;
					}
					}
					 if (j < n)
					 {
						 break;
					 }
	}
	for (i = n - 1;i >= 0;i--)
	{
						 for (j = n - 1;j >= 0;j--)
						 {
								  if (a[i][j] == 0)
								  {
										  x2 = i;
										  y2 = j;
										  break;
								  }
						 }
						   if (j >= 0)
						   {
							   break;
						   }
	}

		   s = (x2 - x1 - 1) * (y2 - y1 - 1);
		 System.out.printf("%d",s);
	return 0;
	 }
}

