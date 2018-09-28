package <missing>;

public class GlobalMembers
{
	public static int dispose(int m, int n)
	{
		if (n == 1 || m <= 1)
		{
			return 1;
		}
		if (m < n)
		{
			return dispose(m, m);
		}
		return dispose(m, n - 1) + dispose(m - n, n);
	}

	public static int Main()
	{
		int t;
		int m;
		int n;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(dispose(m, n));
			System.out.print("\n");
			t--;
		}
	}
}

