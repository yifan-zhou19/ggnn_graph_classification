package <missing>;

public class GlobalMembers
{
	public static void f1(int n, int[][] a)
	{
		int i;
		for (i = 0;i <= n - 1;i++)
		{
			int x = a[i][0];
			int j;
			for (j = 1;j <= n - 1;j++)
			{
				if (x > a[i][j])
				{
					x = a[i][j];
				}
			}
			if (x > 0)
			{
				for (j = 0;j <= n - 1;j++)
				{
					a[i][j] -= x;
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			int x = a[0][i];
			int j;
			for (j = 1;j <= n - 1;j++)
			{
				if (x > a[j][i])
				{
					x = a[j][i];
				}
			}
			if (x > 0)
			{
				for (j = 0;j <= n - 1;j++)
				{
					a[j][i] -= x;
				}
			}
		}
	}

	public static void f2(int n, int[][] a)
	{
		int i;
		int j;
		for (i = 1;i <= n - 2;i++)
		{
			a[0][i] = a[0][i + 1];
			a[i][0] = a[i + 1][0];
		}
		for (i = 1;i <= n - 2;i++)
		{
			for (j = 1;j <= n - 2;j++)
			{
				a[i][j] = a[i + 1][j + 1];
			}
		}
	}

	public static int loop(int n, int[][] a)
	{
		f1(n, a);
		int x = a[1][1];

		if (n == 2)
		{
			return a[1][1];
		}
		else
		{
			f2(n, a);
			return x + loop(n - 1, a);
		}
	}

	public static void Main()
	{
		int t;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (t = 1;t <= n;t++)
		{
			int[][] a = new int[100][100];
			int i;
			int j;
			for (i = 0;i <= n - 1;i++)
			{
				for (j = 0;j <= n - 1;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i][j] = Integer.parseInt(tempVar2);
					}
				}
			}

			System.out.printf("%d\n",loop(n, a));
		}
	}
}

