package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int M, int N);
		int M;
		int N;
		int K;
		int t;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= t ; i++)
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			K = f(M, N);
			System.out.print(K);
			System.out.print("\n");
		}
		return 0;
	}
	public static int f(int M, int N)
	{
		if (N == 1)
		{
			return 1;
		}
		else if (M >= N)
		{
			return f(M, N - 1) + f(M - N, N);
		}
		else
		{
			return f(M, N - 1);
		}
	}
}

