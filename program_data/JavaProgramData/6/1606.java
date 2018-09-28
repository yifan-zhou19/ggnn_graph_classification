package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int m;
		int sum = 0;
		int x;
		int y;
		i = 0;
		int[] sj = new int[100];
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
			for (y = 0;y < x;y++)
			{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   m = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   n = Integer.parseInt(tempVar3);
			   }
			   for (i = 0;i < m;i++)
			   {
			   for (k = 0;k < n;k++)
			   {
				   String tempVar4 = ConsoleInput.scanfRead();
				   if (tempVar4 != null)
				   {
					   sz[i][k] = Integer.parseInt(tempVar4);
				   }
			   }
			   }
		   for (k = 0;k < n;k++)
		   {
			   sum = sum + sz[0][k] + sz[m - 1][k];
		   }
		   for (i = 1;i < m - 1;i++)
		   {
			   sum = sum + sz[i][0] + sz[i][n - 1];
		   }
		   sj[y] = sum;
		   sum = 0;
			}
		for (y = 0;y < x;y++)
		{
			System.out.printf("%d\n",sj[y]);
		}
		return 0;
	}
}

