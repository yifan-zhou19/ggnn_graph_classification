package <missing>;

public class GlobalMembers
{
	public static int way = 0;
	public static int Main()
	{
		int apple = new int(int n,int m);
		int t;
		int n;
		int m;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(apple(n, m));
			System.out.print("\n");
		}
		return 0;
	}
	public static int apple(int n,int m)
	{
		if (m == 1 || n == 1)
		{
			way = 1;
		}
		if (m == n)
		{
			way = apple(n, m - 1) + 1;
		}
		if (m != n && m != 1 && n != 1)
		{
			if (n > m)
			{
			way = apple(n, m - 1) + apple(n - m, m);
			}
			else
			{
			way = apple(n, n);
			}
		}
		return way;
	}

}

