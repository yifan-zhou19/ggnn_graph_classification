package <missing>;

public class GlobalMembers
{
	public static int[][] dp = new int[100][11];
	public static int Main()
	{
		int i;
		int j;
		int t;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 100;i++)
		{
			dp[i][1] = 1;
		}
		for (j = 2;j <= 10;j++)
		{
			for (i = 1;i <= 100;i++)
			{
				if (i - j > 0)
				{
					dp[i][j] = dp[i][j - 1] + dp[i - j][j];
				}
				else if (i - j == 0)
				{
					dp[i][j] = dp[i][j - 1] + 1;
				}
				else
				{
					dp[i][j] = dp[i][j - 1];
				}
			}
		}
		while (t-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",dp[m][n]);
		}
		return 0;
	}
}

