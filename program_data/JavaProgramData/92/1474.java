package <missing>;

public class GlobalMembers
{
	public static final int MAXN = 1010;

	public static int n;
	public static int[] a = new int[MAXN];
	public static int[] b = new int[MAXN];
	public static int[][] f = new int[MAXN][MAXN];

	public static void init()
	{
		int i;

		for (i = 1; i <= n; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		sort(a + 1, a + n + 1);
		sort(b + 1, b + n + 1);
	}

	public static int game(int x, int y)
	{
		if (x > y)
		{
			return 200;
		}
		else
		{
		if (x < y)
		{
			return -200;
		}
		else
		{
			return 0;
		}
		}
	}

	public static void work()
	{
		int i;
		int j;
		int k;

		for (i = 1; i <= n; i++)
		{
			f[i][i] = game(a[i], b[1]);
		}
		for (k = 1; k < n; k++)
		{
			for (i = 1; i <= n - k; i++)
			{
				j = i + k;
				f[i][j] = Math.max(f[i][j - 1] + game(a[j], b[j - i + 1]), f[i + 1][j] + game(a[i], b[j - i + 1]));
			}
		}
		System.out.printf("%d\n", f[1][n]);
	}

	public static int Main()
	{
		while (scanf("%d", n), n != 0)
		{
			init();
			work();
		}

		return 0;
	}

}

