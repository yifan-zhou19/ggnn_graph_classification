package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int, int);
		int t;
		int T;
		int m;
		int n;

		T = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (t = 0; t < T; t++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			System.out.print(f(m, n));
			System.out.print("\n");
		}

		return 0;
	}

	public static int f(int m, int n)
	{
		if (m >= n != 0 && n > 1)
		{
			return f(m - n, n) + f(m, n - 1);
		}
		else if (m < n && n > 1)
		{
			return f(m, n - 1);
		}
		else if (n == 1)
		{
			return 1;
		}
	}

}

