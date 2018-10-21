package <missing>;

public class GlobalMembers
{
	/*
		program: ????
		Author : ??
		ID     : 00948159
		Date   : 2011.3.29
	*/


	public static final int MAXN = 1000;
	public static final int PRICE = 200;

	public static int[][] h = new int[2][MAXN];

	public static int Main()
	{
		int n;
		int i;
		int j;
		int ans;
		int s0;
		int t0;
		int s1;
		int t1;

		while (scanf("%d", n), n > 0)
		{
			for (i = 0; i < 2; ++i)
			{
				for (j = 0; j < n; ++j)
				{
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						h[i][j] = Integer.parseInt(tempVar);
					}
				}
				sort(h[i], h[i] + n);
			}

			ans = 0;
			s0 = 0;
			s1 = 0;
			t0 = n - 1;
			t1 = n - 1;
			while (s0 <= t0)
			{
				while (s0 <= t0 != 0 && h[0][s0] > h[1][s1])
				{
					ans += PRICE;
					++s0;
					++s1;
				}
				while (s0 <= t0 != 0 && h[0][t0] > h[1][t1])
				{
					ans += PRICE;
					--t0;
					--t1;
				}
				if (s0 <= t0)
				{
					if (h[0][s0] == h[1][t1])
					{
						break;
					}
					ans -= PRICE;
					++s0;
					--t1;
				}
			}

			System.out.printf("%d\n", ans);
		}

		return 0;
	}

}

