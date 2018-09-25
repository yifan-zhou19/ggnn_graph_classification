package <missing>;

public class GlobalMembers
{
	public static int e(int a, int b)
	{
		int k;
		if (b > 1)
		{
			k = e(a, b - 1) + f(a, b - 1);
		}
		else
		{
			k = 0;
		}
		return k;
	}

	public static int f(int a, int b)
	{
		int k;
		if (a > b)
		{
			k = f(a - b, b) + e(a - b, b);
		}
		else if (a == b)
		{
			k = 1;
		}
		else
		{
			k = 0;
		}
		return k;
	}

	public static int Main()
	{
		int m;
		int n;
		int k;
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = f(m, n) + e(m, n);
			System.out.print(k);
			System.out.print("\n");
		}

		return 0;
	}

}

