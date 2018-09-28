package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		for (;;)
		{
			int n;
			int m;
			int sum;
			int[] dp = new int[301];
			int pos = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((n == 0) && (m == 0))
			{
				break;
			}
			for (int i = 0;i < (n - 1);i++)
			{
				sum = 0;
				for (;sum < m;)
				{
					pos++;
					if (pos > n)
					{
						pos = pos % n;
					}
					if (dp[pos] == 0)
					{
						sum++;
					}
				}
				dp[pos] = 1;
			}
			for (int i = 1;i <= n;i++)
			{
			  if (dp[i] == 0)
			  {
				System.out.print(i);
				System.out.print("\n");
				break;
			  }
			}
		}
	}

}

