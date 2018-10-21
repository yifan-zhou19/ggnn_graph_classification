package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static int Main()
	{
		int[][] a = new int[200][200];
		int[][] b = new int[200][200];
		int[][] c = new int[200][200];
		int m;
		int n;
		int p;
		int i;
		int j;
		int k;
		int r;
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
			n = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p = Integer.parseInt(tempVar5);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= p;j++)
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
			for (j = 1;j <= p;j++)
			{
				c[i][j] = 0;
				for (k = 1;k <= n;k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for (i = 1;i < m;i++)
		{
			for (j = 1;j <= p;j++)
			{
				if (j != p)
				{
					System.out.printf("%d ",c[i][j]);
				}
				else
				{
					System.out.printf("%d\n",c[i][j]);
				}
			}
		}
		for (j = 1;j <= p;j++)
		{
			if (j != p)
			{
				System.out.printf("%d ",c[i][j]);
			}
			else
			{
				System.out.printf("%d",c[i][j]);
			}
		}
		return 0;
	}
}

