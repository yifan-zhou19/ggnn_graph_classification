package <missing>;

public class GlobalMembers
{
	public static int apple(int m,int n)
	{
		if (n == 1)
		{
			return 1;
		}
		if (m == 0)
		{
			return 1;
		}
		if (m < n)
		{
			return apple(m, m);
		}
		if (m >= n)
		{
			return (apple(m, n - 1) + apple(m - n, n));
		}
	}

	public static int Main()
	{
		int m;
		int n;
		int t;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(apple(m, n));
		System.out.print("\n");
		}
		return 0;
	}

}

