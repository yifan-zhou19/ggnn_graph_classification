package <missing>;

public class GlobalMembers
{
	public static int baifang(int n, int m)
	{
		if (m == 0)
		{
			return 1;
		}
		if (n == 1)
		{
			return 1;
		}
		if (m < n)
		{
			return (baifang(n - 1, m));
		}
		else
		{
			return (baifang(n - 1, m) + baifang(n, m - n));
		}
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= t; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(baifang(n, m));
			System.out.print("\n");
		}
		return 0;
	}
}

