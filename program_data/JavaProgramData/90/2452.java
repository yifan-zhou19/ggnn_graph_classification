package <missing>;

public class GlobalMembers
{
	public static int put(int m,int n) //m????n???
	{
		if (m < n)
		{
			return (put(m, m));
		}
		if (m == n)
		{
			return (put(m, n - 1)) + 1;
		}
		if (n == 1)
		{
			return 1;
		}
		if ((n == 0) || (m == 0))
		{
			return 0;
		}
		if (m == 1)
		{
			return 0;
		}
		else
		{
			return (put(m, n - 1) + put(m - n, n));
		}
	}
	public static int Main()
	{
		int t;
		int i;
		int m;
		int n;
		int s;
		int j;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = 1;
		for (i = 1;i <= t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = put(m, n);
			if (j < t)
			{
			System.out.print(s);
			System.out.print("\n");
			}
			else
			{
				System.out.print(s);
			}
		}
	}

}

