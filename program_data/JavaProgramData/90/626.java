package <missing>;

public class GlobalMembers
{
	public static int C(int m,int n)
	{
		if (m == 0 || n == m)
		{
			return 1;
		}
		return C(m, n - 1) + C(m - 1, n - 1);
	}

	public static int f(int M, int N)
	{
		if (N == 1)
		{
			return 1;
		}
		if (M == 0)
		{
			return 1;
		}
		if (N > M)
		{
			return f(M, N - 1);
		}
		if (M >= N)
		{
			return f(M, N - 1) + f(M - N, N);
		}
	}

	public static int Main()
	{
		int n;
		int M;
		int N;
		int i;
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
				M = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				N = Integer.parseInt(tempVar3);
			}

			System.out.printf("%d\n", f(M, N));
		}
		return 0;
	}

}

