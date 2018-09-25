package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			if (n < m)
			{
				t = n;
				n = m;
				m = t;
			}
			if (n == m)
			{
				System.out.print(n);
				return 0;
			}
			if (n - 1 == m && n % 2 == 1)
			{
				System.out.print(n / 2);
				return 0;
			}
			n /= 2;
			if (m == 1)
			{
				System.out.print("1");
				return 0;
			}
		}
	}

}

