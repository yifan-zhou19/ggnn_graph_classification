package <missing>;

public class GlobalMembers
{
	public static final int N = 25 + 10;
	public static int[] h = new int[N];
	public static int[] dp = new int[N];

	public static int Main()
	{
		int ans;
		int cnt;
		int i;
		int j;
		while (scanf("%d", cnt) != EOF)
		{
			for (i = 0; i < cnt; ++i)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					h + i = tempVar;
				}
			}
			dp[0] = 1;
			for (i = 1; i < cnt; ++i)
			{
				dp[i] = 1;
				for (j = 0; j < i; ++j)
				{
					if (h[i] <= h[j])
					{
						dp[i] = Math.max(dp[i], dp[j] + 1);
					}
				}
			}
			ans = 0;
			for (i = 0; i < cnt; ++i)
			{
				ans = Math.max(ans, dp[i]);
			}
			System.out.printf("%d\n", ans);
		}

		return 0;
	}
}

