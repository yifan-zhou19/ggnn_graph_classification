package <missing>;

public class GlobalMembers
{
	public static int is_prime(int n)
	{
		int k;
		int limit;
		if (n == 2)
		{
			return 1;
		}

		if (n % 2 == 0)
		{
			return 0;
		}

		limit = n / 2;
		for (k = 3; k <= limit; k += 2)
		{
			if (n % k == 0)
			{
				return 0;
			}
		}
			return 1;
	}
	public static int Main()
	{
		int number;
		int a;
		int b;
		int i;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 3;a <= number / 2;a++)
		{
			b = number - a;
			if (is_prime(a) == 1 && is_prime(b) == 1)
			{
				System.out.print(a);
				System.out.print(" ");
				System.out.print(b);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

