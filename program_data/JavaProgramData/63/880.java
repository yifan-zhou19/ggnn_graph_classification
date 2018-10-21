package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int m;
		int n;
		int x;
		int y;
		int i;
		int j;
		int k;
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
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
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
			x = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y = Integer.parseInt(tempVar5);
		}
		for (i = 1;i <= x;i++)
		{
			for (j = 1;j <= y;j++)
			{
			   String tempVar6 = ConsoleInput.scanfRead();
			   if (tempVar6 != null)
			   {
				   b[i][j] = Integer.parseInt(tempVar6);
			   }
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= y - 1;j++)
			{
				c[i][j] = 0;
				for (k = 1;k <= n;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.printf("%ld ",c[i][j]);
			}
			for (k = 1;k <= n;k++)
			{
				c[i][y] += a[i][k] * b[k][y];
			}
			System.out.printf("%ld\n",c[i][y]);
		}
	}
}

