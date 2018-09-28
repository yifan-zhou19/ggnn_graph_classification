package <missing>;

public class GlobalMembers
{
	public static int sum(int m,int n)
	{
		int[][] a = new int[m][n];
		int i;
		int j;
		int t = 0;
		if (m == 1 || n == 1)
		{
			for (i = 0;i < m + n - 1;i++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				j = Integer.parseInt(tempVar);
			}
			t += j;
			}
		}

		else
		{
		for (i = 0;i < m;i++)
		{
				for (j = 0;j < n;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i][j] = Integer.parseInt(tempVar2);
					}
				}
		}
		for (i = 0;i < m;i++)
		{
			t += a[i][0] + a[i][n - 1];
		}
		for (j = 1;j < n - 1;j++)
		{
			t += a[0][j] + a[m - 1][j];
		}

		}
	return t;
	}
	public static int Main()
	{
		int m;
		int n;
		int q;
		for (scanf("%d", q);q > 0;q--)
		{
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
			System.out.printf("%d\n",sum(m, n));

		}
	}
}

