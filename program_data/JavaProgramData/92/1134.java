package <missing>;

public class GlobalMembers
{
	public static int[][] dp = new int[N][N];
	public static int[] a = new int[N];
	public static int[] b = new int[N];
	public static int n;

	public static void Qsort(int[] a, int i, int j)
	{
		int i1 = i;
		int j1 = j;
		int tmp = a[i];
		while (i < j)
		{
			while (i < j && a[j] < tmp)
			{
				j--;
			}
			if (i < j)
			{
				a[i++] = a[j];
			}
			while (i < j && a[i]> tmp)
			{
				i++;
			}
			if (i < j)
			{
				a[j--] = a[i];
			}
		}
		a[i] = tmp;
		if (i1 < i - 1)
		{
			Qsort(a, i1, i - 1);
		}
		if (j + 1 < j1)
		{
			Qsort(a, j + 1, j1);
		}
	}

	public static void init()
	{
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		Qsort(a, 0, n - 1);
		Qsort(b, 0, n - 1);
	}

	public static int max(int x,int y)
	{
		return x > y != 0?x:y;
	}

	public static int judge(int x,int y)
	{
		if (x == y)
		{
			return 0;
		}
		if (x > y)
		{
			return 1;
		}
		return -1;
	}

	public static void solve()
	{
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;i + j < n;j++)
			{
				if (i == 0)
				{
					dp[j][i + j] = judge(b[j], a[n - 1]);
				}
				else
				{
					dp[j][i + j] = max(dp[j + 1][i + j] + judge(b[j], a[n - 1 - i]), dp[j][i + j - 1] + judge(b[i + j], a[n - 1 - i]));
				}
			}
		}
	}

	public static int Main()
	{
		while (scanf("%d",n))
		{
			if (n == 0)
			{
				break;
			}
			init();
			solve();
			System.out.printf("%d\n",dp[0][n - 1] * 200);
		}
		return 0;
	}

}

