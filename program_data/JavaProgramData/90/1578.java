package <missing>;

public class GlobalMembers
{
	public static int Calc(int m, int n)
	{
		int sum;

		// case: at least one empty
		if (n == 1)
		{
			return 1;
		}
		else
		{
			sum = Calc(m, n - 1);
		}

		// case: no empty
		if (m == n)
		{
			sum += 1;
		}
		else if (m > n)
		{
			sum += Calc(m - n, n);
		}

		return sum;
	}

	public static int Main()
	{
		int m;
		int n;
		int x;
		for ((x; x > 0; x-- = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(Calc(m, n));
			System.out.print("\n");
		}
	}
}

