package <missing>;

public class GlobalMembers
{
	public static int[] dp = new int[100];
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] h;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		h = new int[(k + 1)];
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		dp[k] = 0;
		for (i = k - 1;i >= 0;i--)
		{
			max = 0;
			for (j = i + 1;j <= k;j++)
			{
				if (h[i] >= h[j])
				{
					 if (dp[j] + 1 > max)
					 {
						 max = dp[j] + 1;
					 }
				}
			}
			dp[i] = max;
		}
		int m = 0;
		for (i = 0;i <= k;i++)
		{
			if (dp[i] > m)
			{
				m = dp[i];
			}
		}
		System.out.printf("%d",m + 1);
		return 0;
	}
}

