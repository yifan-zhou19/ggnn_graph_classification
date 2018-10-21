package <missing>;

public class GlobalMembers
{
	public static int Apple(int m, int n)
	{
		if (m == 0 || n == 0)
		{
			return 0;
		}
		if (m == 1 || n == 1)
		{
			return 1;
		}
		if (m < n)
		{
			return Apple(m, m);
		}
		if (m == n)
		{
			return Apple(m, n - 1) + 1;
		}
		return Apple(m - n, n) + Apple(m, n - 1);
	}
	public static int Main()
	{
		int t;
		int a;
		int b;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t != 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(Apple(a, b));
			System.out.print("\n");
			t--;
		}
		return 0;
	}
}

