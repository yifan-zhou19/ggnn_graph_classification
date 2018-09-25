package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int m;
	   int n;
	   int count = 0;
	   int[][] sz = new int[22][22];
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
	   for (i = 0;i < m + 2;i++)
	   {
		  for (j = 0;j < n + 2;j++)
		  {
			sz[i][j] = 0;
		  }
	   }
	   for (i = 1;i < m + 1;i++)
	   {
		  for (j = 1;j < n;j++)
		  {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i][j] = Integer.parseInt(tempVar3);
			}
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  sz[i][n] = Integer.parseInt(tempVar4);
		  }
	   }
	   for (i = 1;i < m + 1;i++)
	   {
		  for (j = 1;j < n + 1;j++)
		  {
			if (sz[i + 1][j] - sz[i][j] <= 0 && sz[i - 1][j] - sz[i][j] <= 0 && sz[i][j + 1] - sz[i][j] <= 0 && sz[i][j - 1] - sz[i][j] <= 0)
			{
					System.out.printf("%d %d\n",i - 1,j - 1);
			}
		  }
	   }
	   return 0;
	}
}

