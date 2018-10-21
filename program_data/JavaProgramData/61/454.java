package <missing>;

public class GlobalMembers
{
	public static int fib(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		if (n == 2)
		{
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fib(k));
			System.out.print("\n");
		}
		return 0;
	}
}

