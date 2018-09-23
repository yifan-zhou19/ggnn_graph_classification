package <missing>;

public class GlobalMembers
{
	public static int k = 0;
	public static int[] a = new int[100];
	public static int[] dp = new int[100];

	public static int solve()
	{
		int ans = 0;

		dp[0] = 1;
		for (int i = 1; i < k; i++)
		{
			dp[i] = 1;
			for (int j = 0; j < i; j++)
			{
				if (a[j] >= a[i] != 0 && dp[j] + 1 > dp[i])
				{
					dp[i] = dp[j] + 1;
				}
			}
			if (dp[i] > ans)
			{
				ans = dp[i];
			}
		}

		return ans;
	}

	public static int Main()
	{
		freopen("input.txt", "r", stdin);
		freopen("output.txt", "w", stdout);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (int i = 0; i < k; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d\n", solve());

		return 0;
	}
}

