package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int m;
		int n;
		int i;
		int j;
		int b;
		int[][] sz = new int[M][N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (b = 1;b <= a;b++)
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
			for (j = 0;j < n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		int e;
		int k;
		int h = 0;
		for (e = 0;e < m;e++)
		{
		if (e == 0)
		{
			for (k = 0;k < n;k++)
			{
				h += sz[e][k];
			}
		}
		if (e == m - 1)
		{
			for (k = 0;k < n;k++)
			{
				h += sz[e][k];
			}
		}
		}
		for (k = 0;k < n;k++)
		{
		if (k == n - 1)
		{
			for (e = 1;e < m - 1;e++)
			{
				h += sz[e][k];
			}
		}
		if (k == 0)
		{
			for (e = 1;e < m - 1;e++)
			{
				h += sz[e][k];
			}
		}
		}
		System.out.printf("%d\n",h);
		}
		return 0;
	}
}

