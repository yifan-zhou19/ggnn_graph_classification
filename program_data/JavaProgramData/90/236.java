package <missing>;

public class GlobalMembers
{
	public static int apple(int m, int n)
	{
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		if (n == 1)
		{
			sum = 1;
			return sum;
		}
		if (m == 1)
		{
			sum = 1;
			return sum;
		}
		if (n != 1 && m != 1)
		{
			if (m <= n)
			{
				return (1 + apple(m, m - 1));
			}
			else
			{
				sum2 = apple(m - n, n);
				sum1 = apple(m, n - 1);
			}
		}
		sum = sum1 + sum2;
		return sum;
	}
	public static int Main()
	{
		int t;
		int i;
		int m;
		int n;
		int total;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(apple(m, n));
			System.out.print("\n");
		}
		return 0;
	}

}

