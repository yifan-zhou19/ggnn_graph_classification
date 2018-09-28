package <missing>;

public class GlobalMembers
{
	public static int apple(int n,int m)
	{
		int i;
		int p;
		if (m == 1 || n == 1 || n == 0)
		{
			return 1;
		}
		else
		{
			p = 0;
			if (n < m)
			{
				return apple(n, n);
			}
			if (n >= m)
			{
				for (i = 1;i <= m;i++)
				{
					p = p + apple(n - i, i);
				}
				return p;
			}
		}
	}
	public static int Main()
	{
		int i;
		int t;
		int n;
		int m;
		int num;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num = apple(n, m);
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}
}

