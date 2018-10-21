package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int K;
	public static int dfs(int n)
	{
		if (n == 0)
		{
			return N - 1;
		}
		int m = dfs(n - 1) / (N - 1) * N + K;
		if (n == N)
		{
			return m;
		}
		while (m % (N - 1) != 0)
		{
			m += (int)Math.pow(N,n);
		}
		return m;
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			K = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",dfs(N));
		return 0;
	}
}

