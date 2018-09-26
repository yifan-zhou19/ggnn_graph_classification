package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int m;
		int n;
		int q;
		int i;
		int j;
		int k;
		for (i = 0; i < 100; i++)
		{
			for (j = 0; j < 100; j++)
			{
				a[i][j] = 0;
				b[i][j] = 0;
				c[i][j] = 0;
			}
		}
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
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < q; j++)
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
		for (i = 0; i < q; i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < q; k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n - 1; j++)
			{
				System.out.printf("%d ", c[i][j]);
			}
			System.out.printf("%d\n", c[i][n - 1]);
		}
	}
}

