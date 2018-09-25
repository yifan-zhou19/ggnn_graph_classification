package <missing>;

public class GlobalMembers
{
	// ?????????.cpp : ??????????????
	//


	public static int[][] a = new int[100][100];
	public static int n;

	public static void scan(int m)
	{
		int i;
		int j;
		for (i = 0;i <= m - 1;++i)
		{
			for (j = 0;j <= m - 1;++j)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
	}

	public static int minofc(int m)
	{
		int i;
		int min = a[m][0];
		for (i = 0;i <= n - 1;++i)
		{
			if (a[m][i] < min)
			{
				min = a[m][i];
			}
		}
		return min;
	}

	public static int minofr(int m)
	{
		int i;
		int min = a[0][m];
		for (i = 0;i <= n - 1;++i)
		{
			if (a[i][m] < min)
			{
				min = a[i][m];
			}
		}
		return min;
	}

	public static void tozero()
	{
		int i;
		int j;
		for (i = 0;i <= n - 1;++i)
		{
			int min = minofc(i);
			for (j = 0;j <= n - 1;++j)
			{
				a[i][j] = a[i][j] - min;
			}
		}
		for (j = 0;j <= n - 1;++j)
		{
			int min = minofr(j);
			for (i = 0;i <= n - 1;++i)
			{
				a[i][j] = a[i][j] - min;
			}
		}
	}

	public static void eliminate()
	{
		int i;
		int j;
		for (i = 1;i <= n - 2;++i)
		{
			a[0][i] = a[0][i + 1];
			a[i][0] = a[i + 1][0];
		}
		for (i = 1;i <= n - 2;++i)
		{
			for (j = 1;j <= n - 2;++j)
			{
				a[i][j] = a[i + 1][j + 1];
			}
		}
	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int p = n;
		int i;
		int j;
		for (i = 1;i <= n;++i)
		{
			int sum = 0;
			scan(n);
			do
			{
				tozero();
				sum = sum + a[1][1];
				eliminate();
				n--;
			}while (n > 1);
			System.out.printf("%d\n",sum);
			n = p;
		}
		return 0;
	}

}

