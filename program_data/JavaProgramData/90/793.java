package <missing>;

public class GlobalMembers
{
	public static int apple(int m,int n)
	{
		int s = 0;

		if (n == 1)
		{
			s = 1;
		}
		else if (m < 0)
		{
			s = 0;
		}
		else if (n >= 2 && m >= 0)
		{
			s = apple(m, n - 1) + apple(m - n, n);
		}
		return s;
	}
	public static int Main()
	{
		int t;
		int i;
		int M;
		int N;
		int q;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(apple(M, N));
			System.out.print("\n");
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

