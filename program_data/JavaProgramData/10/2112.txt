package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] dp = new int[50];
		int[] m = new int[50];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
		m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
		dp[i] = 1;
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < i;j++)
			{
				if (m[i] <= m[j])
				{
					dp[i] = Math.max(dp[j] + 1,dp[i]);
				}
			}
		}
		int maxl = 0;
		for (int i = 0;i < n;i++)
		{
		if (dp[i] > maxl)
		{
		maxl = dp[i];
		}
		}
		System.out.print(maxl);
	}

}

