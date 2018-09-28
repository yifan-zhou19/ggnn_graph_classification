package <missing>;

public class GlobalMembers
{
	public static int full(int M, int N)
	{
		if (M < N)
		{
			return 0;
		}
		if (M == N)
		{
			return 1;
		}
		if (M > N)
		{
			return (full(M - N, N) + empty(M - N, N));
		}


	}
	public static int empty(int M, int N)
	{
		if (N == 2)
		{
			return 1;
		}
		if (N == 1)
		{
			return 0;
		}
		if (N != 1 && N != 2)
		{
		return (full(M, N - 1) + empty(M, N - 1));
		}

	}
	public static int Main()
	{
		int t;
		int M;
		int N;
		int i;
		int num;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < t; i++)
		{
				M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				System.out.print(full(M, N) + empty(M, N));
				System.out.print("\n");
		}
		return 0;
	}
}

