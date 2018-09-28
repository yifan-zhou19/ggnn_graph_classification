package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		if (m < n)
		{
			return f(m, m);
		}
		if (m == 1 && n != 0 || n == 1 && m != 0)
		{
			return 1; //??? m>=1
		}
		if (m == 0 || n == 0)
		{
			return 1; //??????????0
		}
		if (m >= n)
		{
			return f(m - n, n) + f(m, n - 1);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(m, n));
			System.out.print("\n");
		}
	}
}

