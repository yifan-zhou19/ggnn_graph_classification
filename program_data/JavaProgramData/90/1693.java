package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		if (m == 1 || n == 1 || m == 0)
		{
			return (1);
		}
		else if (m < 0)
		{
			return (0);
		}
		else if (m > 1 && n > 1)
		{
			return (f(m, n - 1) + f(m - n, n)); //????
		}
	}
	public static int Main()
	{
		int M;
		int N;
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= t;i++)
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(M, N));
			System.out.print("\n");
		}

		return 0;
	}
}

