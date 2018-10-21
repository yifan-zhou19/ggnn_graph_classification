package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] d = new int[100];
	public static int[] dp = new int[30];

	public static int Main()
	{
		while (scanf("%d", n) == 1)
		{
			for (int i = 1; i <= n; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					d + i = tempVar;
				}
			}

//C++ TO JAVA CONVERTER WARNING: The right shift operator was replaced by Java's logical right shift operator since the left operand was originally of an unsigned type, but you should confirm this replacement:
			d[0] = (-1)>>>1;
			for (int i = 1; i <= n; i++)
			{
				dp[i] = 0;
				for (int j = 0; j < i; j++)
				{
					if (d[j] >= d[i])
					{
						dp[i] = Math.max(dp[i], dp[j] + 1);
					}
				}
			}

			int ans = 0;
			for (int i = 1; i <= n; i++)
			{
				ans = Math.max(ans, dp[i]);
			}

			System.out.printf("%d\n", ans);
		}
		return 0;
	}

}

