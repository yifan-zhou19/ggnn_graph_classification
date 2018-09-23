package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[30];
	public static int[] dp = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static int n;
	public static int ans = -1;
	public static int Main()
	{
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i < n;i++)
		{
			dp[i] = 1;
			for (j = 0;j < i;j++)
			{
				if (a[j] >= a[i] != 0 && dp[j] + 1 > dp[i])
				{
					dp[i] = dp[j] + 1;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (dp[i] > ans)
			{
				ans = dp[i];
			}
		}
		System.out.printf("%d\n",ans);
		return 0;
	}

}

