package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		if (x > y)
		{
		return x;
		}
		else
		{
			return y;
		}

	}
	public static int Main()
	{
		int[] num = new int[30];
	int r = 0;
	int[] dp = new int[30];

		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 num[i] = Integer.parseInt(tempVar2);
			 }
		  dp[i] = 1;
		}
		for (int i = 2;i <= n;i++)
		{
		 for (int j = 1;j < i;j++)
		 {
		if (num[i] <= num[j])
		{
			 dp[i] = max(dp[i], dp[j] + 1);
		 if (dp[i] > r)
		 {
		  r = dp[i];
		 }
		}
		 }
		}
		System.out.printf("%d",r);
	}

}

