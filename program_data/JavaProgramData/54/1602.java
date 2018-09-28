package <missing>;

public class GlobalMembers
{
	public static int res(int n, int k, int i, int p)
	{
		int m;
		if (i == n)
		{
			m = n * p + k;
		}
		else
		{
			m = res(n, k, i + 1, p);
			if (m != -1 && m % (n - 1) == 0)
			{
				m = m / (n - 1) * n + k;
			}
			else
			{
				m = -1;
			}
		}
		return m;
	}

	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 1;
		while (true)
		{
			int m = res(n, k, 1, i++);
			if (m != -1)
			{
				System.out.print(m);
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}

}

