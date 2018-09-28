package <missing>;

public class GlobalMembers
{
	public static int apple(int m, int n)
	{
		if (m == 1 || n == 1 || m == 0)
		{
			return 1;
		}

		if (m >= n)
		{
			return (apple(m, n - 1) + apple(m - n, n));
		}

		else
		{
			if (m < n)
			{
				return apple(m, n - 1);
			}
		}

	}

	public static int Main()
	{
		int t;
		int i;
		int k;
		int m;
		int n;

		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1 ; i <= t ; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			k = apple(m, n);

			System.out.print(k);
			System.out.print("\n");
		}

		return 0;
	}


}

