package <missing>;

public class GlobalMembers
{
	public static int f(int M,int N)
	{
		if (M == 0)
		{
		return 1;
		}
		if (N == 0)
		{
		return 0;
		}
		if (M == 1 || N == 1)
		{
		return 1;
		}
		if (M < N)
		{
		return f(M, M);
		}
		else
		{
		return f(M, N - 1) + f(M - N, N);
		}
	}

	public static int Main()
	{
		int t;
		int M;
		int N;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(M, N));
			System.out.print("\n");
		}
		return 0;
	}

}

