package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int r;

	public static int Main()
	{
		int num = new int(int, int);

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		r = k + n;
		while (num(n, r) == 0)
		{
			r = n + r;
		}
		System.out.print(num(n, r));
		System.out.print("\n");

		return 0;
	}

	public static int num(int a, int b)
	{
		if (a == 1)
		{
			return b;
		}
		else
		{
			if (b % (n - 1) == 0)
			{
				b = b * n / (n - 1) + k;
				return num(a - 1, b);
			}

			else
			{
				return 0;
			}
		}
	}
}

