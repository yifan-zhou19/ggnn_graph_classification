package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sort = new int(int M, int N);
		int n;
		int M;
		int N;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 1;
		do
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = sort(M, N);
			System.out.print(k);
			System.out.print("\n");
			i++;
		}while (i <= n);
		return 0;
	}
	public static int sort(int M, int N)
	{
		if (M <= 1 || N == 1)
		{
			return 1;
		}
		else
		{
			if (M < N)
			{
				return sort(M, M);
			}
			else
			{
				return (sort(M - N, N) + sort(M, N - 1));
			}
		}
	}
}

