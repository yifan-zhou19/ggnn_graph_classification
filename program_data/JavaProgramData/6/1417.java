package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] sz = new int[N][M];
	   int k;
	   int n;
	   int m;
	   int i;
	   int j;
	   int l;
	   int sum = 0;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   k = Integer.parseInt(tempVar);
	   }

	   for (l = 0;l < k;l++)
	   {
		   sum = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < m;j++)
		   {
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   sz[i][j] = Integer.parseInt(tempVar4);
		   }
		   }
	   }


	   for (j = 0;j < m - 1;j++)
	   {

			  sum += sz[0][j];
	   }
	   for (i = 0;i < n - 1;i++)
	   {
			  sum += sz[i][m - 1];
	   }
	   for (j = 1;j < m;j++)
	   {
			  sum += sz[n - 1][j];
	   }
	   for (i = 1;i < n;i++)
	   {
			  sum += sz[i][0];
	   }
	System.out.printf("%d\n",sum);
	   }
	   return 0;
	}

}

