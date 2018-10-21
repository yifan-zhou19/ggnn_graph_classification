package <missing>;

public class GlobalMembers
{
	public static int f2(int m,int n)
	{
		int N1;
		if (m == 0 || n == 0)
		{
			return 0;
		}
		if (n == 1 || m == 1)
		{
			return 1;
		}
		if (m < n)
		{
			return f2(m, m);
		}
		if (n == m)
		{
			return f2(m, n - 1) + 1;
		}
		if (m > n)
		{
			return f2(m, n - 1) + f2(m - n, n);
		}
	}

	public static int Main()
	{
		int t;
		int m;
		int n;
		int N;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = f2(m, n);
			System.out.print(N);
			System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

