package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;
	   int a;
	   int b;
	   int i;
	   int j;
	   int[][] h = new int[22][22];
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
	   for (a = 0;a < 22;a++)
	   {
		   for (b = 0;b < 22;b++)
		   {
		  h[a][b] = 0;
		   }
	   }
		  for (i = 1;i < m + 1;i++)
		  {
			  for (j = 1;j < n + 1;j++)
			  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  h[i][j] = Integer.parseInt(tempVar3);
			  }
			  }
		  }
		  for (i = 1;i < m + 1;i++)
		  {
							 for (j = 1;j < n + 1;j++)
							 {
								 if (h[i][j] >= h[i - 1][j] != 0 && h[i][j] >= h[i][j - 1] != 0 && h[i][j] >= h[i + 1][j] != 0 && h[i][j] >= h[i][j + 1])
								 {
							 System.out.printf("%d %d\n",i - 1,j - 1);
								 }
							 }
		  }
							 return 0;
	}



}

