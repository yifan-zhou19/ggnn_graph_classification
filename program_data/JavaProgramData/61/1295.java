package <missing>;

public class GlobalMembers
{
	public static int fib(int a)
	{
		if (a == 1 || a == 2)
		{
			return 1;
		}
		return fib(a - 1) + fib(a - 2);
	}

	public static int Main()
	{
		int a;
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fib(a));
			System.out.print("\n");
		}
		System.out.print("\n");
		return 0;
	}

}

