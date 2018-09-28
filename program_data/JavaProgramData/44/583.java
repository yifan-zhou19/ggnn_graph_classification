package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		if (n == 0)
		{
			System.out.print(n);
			System.out.print("\n");
			return 0;
		}
		if (n < 0)
		{
			System.out.print('-');
			return f(-n);
		}
		System.out.print(n % 10);
		if (n / 10 != 0)
		{
			return f(n / 10);
		}
		else
		{
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			while (n % 10 == 0 && n != 0)
			{
				n /= 10;
			}
			f(n);
		}
		return 0;
	}
}

