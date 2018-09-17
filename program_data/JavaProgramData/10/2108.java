package <missing>;

public class GlobalMembers
{
	public static final int maxn = 55;
	public static int[] a = new int[maxn];
	public static int[][] dp = new int[maxn][maxn];

	public static int Main()
	{
		int T;
		int n;
		int i;
		int j;
		int ans;
		while (scanf("%d", n) != EOF)
		{
			  for (i = 1; i <= n; i++)
			  {
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  a + i = tempVar;
				  }
			  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			  memset(dp, -1, (Integer.SIZE / Byte.SIZE));
			  for (i = 1; i <= n; i++)
			  {
				  dp[i][i] = 1;
			  }
			  for (i = 1; i < n; i++)
			  {
				  for (j = 1; j <= i;j++)
				  {
					  dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
					  if (a[i + 1] <= a[j])
					  {
						 dp[i + 1][i + 1] = Math.max(dp[i + 1][i + 1], dp[i][j] + 1);
					  }
				  }
			  }
			  ans = 0;
			  for (i = n, j = 1;j <= i;j++)
			  {
				  ans = Math.max(ans, dp[i][j]);
			  }
			  System.out.printf("%d\n", ans);
		}
		return 0;
	}

}

