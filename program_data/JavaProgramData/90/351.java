package <missing>;

public class GlobalMembers
{
	public static int apple(int M, int N)
	{
		int sum = 0;
		if (M == 1 || N == 1)
		{
			return 1;
		}
		if (M < N)
		{
			N = M;
			sum += apple(M, N);
			return sum;
		}
		if (M == N)
		{
			sum += apple(M, N - 1);
			sum++;
		}
		else
		{
			sum += apple(M - N, N);
			sum += apple(M, N - 1);
		}
		return sum;
	}
	public static int Main()
	{
		int times;
		int M;
		int N;
		int i;
		times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < times;i++)
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(apple(M, N));
			System.out.print("\n");
		}
		return 0;
	}
}

