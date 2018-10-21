package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int m;
	   int i;
	   int j;
	   int e;
	   int k;
	   int a = 0;
	   int b = 0;
	   int[][] sz = new int[N][N];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(",");
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
		   for (j = 0;j <= m - 1;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   sz[i][j] = Integer.parseInt(tempVar3);
			   }
		   }
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
		   e = sz[i][0];
		for (j = 0;j <= m - 1;j++)
		{
			if (e < sz[i][j])
			{
				e = sz[i][j];
			}
		}
		for (k = 0;k <= m - 1;k++)
		{
			if (e == sz[i][k])
			{
				j = k;
			}
		}
		for (k = 0;k <= n - 1;k++)
		{
			if (e <= sz[k][j])
			{
				a++;
			}
		}
		if (a == n)
		{
			System.out.printf("%d+%d",i,j);
			b = 1;
		}
		a = 0;
	   }
	   if (b == 0)
	   {
		   System.out.print("No");
	   }
	   return 0;
	}
}

