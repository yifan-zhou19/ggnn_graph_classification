package <missing>;

public class GlobalMembers
{
	public static int f(int n,int m)
	{
		if (n == m)
		{
			return n;
		}
		else
		{
			if (n / 2 > m)
			{
				return f(n / 2, m);
			}
			else
			{
				return f(m, n / 2);
			}
		}
	}
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < m)
		{
				n = n ^ m;
				m = n ^ m;
				n = n ^ m;
		}

		System.out.print(f(n, m));
		System.out.print("\n");
		return 0;
	}

}

