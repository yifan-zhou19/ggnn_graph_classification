package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int Main()
	{
		int k;
		int i;
		int j;
		int[] h = new int[25];
		int[] dp = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < k;i++)
		{
			dp[i] = 1;
		}
		for (i = 1;i < k;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (h[j] >= h[i])
				{
					dp[i] = max(dp[i], dp[j] + 1);
				}
			}
		}
		int m = 0;
		for (i = 0;i < k;i++)
		{
			m = max(m, dp[i]);
		}
		System.out.printf("%d\n",m);
	}
}

