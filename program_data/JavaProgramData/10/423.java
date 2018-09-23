package <missing>;

public class GlobalMembers
{
	public static int[] H = new int[100];
	public static int N;

	public static int[][] memo = new int[40][40];

	public static int dp(int i, int k)
	{ // from i, max H[k]
		int rslt;
		if (i == N)
		{
			return 0;
		}
		if (memo[i][k] != -1)
		{
			return memo[i][k];
		}
		if (k != 30 && H[i] > H[k])
		{
			rslt = dp(i + 1, k);
		}
		else
		{
			int a = dp(i + 1, i) + 1;
			int b = dp(i + 1, k);
			if (a > b)
			{
				rslt = a;
			}
			else
			{
				rslt = b;
			}
		}
		return memo[i][k] = rslt;
	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int i = 0; i < 40; i++)
		{
			for (int j = 0; j < 40; j++)
			{
			memo[i][j] = -1;
			}
		}
		for (int i = 0; i < N; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				H[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d\n", dp(0, 30));
	}

}

