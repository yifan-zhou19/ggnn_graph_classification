public class DP
{
	public int height;
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static DP[] dp = tangible.Arrays.initializeWithDefaultDPInstances(26);

	public static int Main()
	{
		int k;
		int i;
		int j;
		int[] h = new int[26];
		int Max;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		dp[0].height = INT_MAX;
		dp[0].num = 0;
		for (i = 1;i <= k;i++)
		{
			dp[i].height = h[i];
			Max = INT_MIN;
			for (j = 0;j < i;j++)
			{
				if (Max < dp[j].num && dp[j].height >= dp[i].height)
				{
					Max = dp[j].num;
				}
			}
			dp[i].num = Max + 1;
		}
		Max = INT_MIN;
		for (i = 0;i <= k;i++)
		{
			if (Max < dp[i].num)
			{
				Max = dp[i].num;
			}
		}
		System.out.print(Max);
		System.out.print("\n");


		return 0;
	}
}

