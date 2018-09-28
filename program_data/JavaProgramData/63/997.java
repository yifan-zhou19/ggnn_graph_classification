package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int q;
		int i;
		int j;
		int k;
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			q = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= m - 1;i++)
		{
		   for (j = 0;j <= q - 1;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar3);
			   }
		   }
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			q = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			n = Integer.parseInt(tempVar5);
		}
		for (i = 0;i <= q - 1;i++)
		{
		   for (j = 0;j <= n - 1;j++)
		   {
			   String tempVar6 = ConsoleInput.scanfRead();
			   if (tempVar6 != null)
			   {
				   b[i][j] = Integer.parseInt(tempVar6);
			   }
		   }
		}
		for (i = 0;i <= m - 1;i++)
		{
		   for (j = 0;j <= n - 1;j++)
		   {
			   for (k = 0;k <= q;k++)
			   {
			   c[i][j] = a[i][k] * b[k][j] + c[i][j];
			   }
		   }
		}
		for (i = 0;i <= m - 1;i++)
		{
		   for (j = 0;j <= n - 1;j++)
		   {
			   if (j != n - 1)
			   {
				   System.out.printf("%d ",c[i][j]);
			   }
			   else
			   {
				   System.out.printf("%d\n",c[i][j]);
			   }
		   }
		}
		System.in.read();
		System.in.read();
	}

}

