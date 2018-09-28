package <missing>;

public class GlobalMembers
{
	public static int f(int M, int N)
	{
		if (M == 0)
		{
			return 1;
		}
		if (N == 1)
		{
			return 1;
		}
		if (M < N)
		{
			return f(M, N - 1);
		}
		else
		{
			return f(M - N, N) + f(M, N - 1);
		}
	}
	public static int Main()
	{
		int M;
		int N;
		int K;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				N = Integer.parseInt(tempVar3);
			}
			K = f(M, N);
			System.out.printf("%d\n",K);
		}
		return 0;
	}
}

