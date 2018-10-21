package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int p;
		int i;
		int j;
		int k;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int o;
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
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
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
			o = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < o;i++)
		{
			for (j = 0;j < p;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < p;j++)
			{
				for (k = 0;k < n;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < p;j++)
			{
				if (p == 1)
				{
					System.out.printf("%d\n",c[i][j]);
				}
				else if (j == 0)
				{
					System.out.printf("%d",c[i][j]);
				}
				else if (j == p - 1)
				{
					System.out.printf(" %d\n",c[i][j]);
				}
				else
				{
					System.out.printf(" %d",c[i][j]);
				}
			}
		}
		return 0;
	}
}

