package <missing>;

public class GlobalMembers
{
	public static int[][] dp = new int[40000][200];
	public static int Main()
	{
		int n;
		int i;
		int N;
		int mm = new int(int, int);

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
						 N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 System.out.print(mm(N, 2));
						 System.out.print("\n");
					   // if(prime(N)) cout<<"haha";
		}

		return 0;
	}

	public static int mm(int n, int i)
	{
		int sum = 1;

		if (dp[n][i] > 0)
		{
			return dp[n][i];
		}


		for (int j = i; j <= Math.sqrt(n);j++)
		{
				 if (n % j == 0)
				 {
						   sum += mm(n / j, j);
				 }
		}
		dp[n][i] = sum;
		return sum;
	}























}

